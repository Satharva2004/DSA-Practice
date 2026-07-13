class Solution {
    class Neighbour{
        String v;
        double w;
        Neighbour(String v, double w){
            this.v = v;
            this.w = w;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Neighbour>> adj = new HashMap<>();

        for(int i = 0; i < values.length; i++){
            List<String> edge = equations.get(i);
            List<Neighbour> nbrs = adj.getOrDefault(edge.get(0), new ArrayList<>());
            nbrs.add(new Neighbour(edge.get(1), values[i]));
            adj.put(edge.get(0), nbrs);
            nbrs = adj.getOrDefault(edge.get(1), new ArrayList<>());
            nbrs.add(new Neighbour(edge.get(0), 1 / values[i]));
            adj.put(edge.get(1), nbrs);
        }

        double[] ans = new double[queries.size()];

        for(int i = 0; i < queries.size(); i++){
            List<String> curr = queries.get(i);
            if(adj.containsKey(curr.get(0)) && adj.containsKey(curr.get(1))){
                ans[i] = solve(curr.get(0), 1.0, new HashSet<>(), curr.get(1), adj);
            }
            else{
                ans[i] = -1.0;
            }
        }
        return ans;
    }
    public double solve(String node, double ans, Set<String> vis, String target, Map<String, List<Neighbour>> adj){
        if(vis.contains(node)) return -1.0;
        if(node.equals(target)) return ans;
        vis.add(node);
        for(Neighbour nbr: adj.getOrDefault(node, new ArrayList<>())){
            double val = solve(nbr.v, ans * nbr.w, vis, target, adj);
            if(val != -1.0){
                return val;
            }
        }
        return -1.0;
    }
}