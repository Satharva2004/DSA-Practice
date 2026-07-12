class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        backtracking(n, k, new ArrayList<>(), list);
        return list;
    }
    public void backtracking(int n, int k, List<Integer> curr, List<List<Integer>> ans){
        if(k==0){
             ans.add(new ArrayList<>(curr));
             return;
        }
        if(n==0) return;
        curr.add(n);
        backtracking(n-1, k-1, curr, ans);
        curr.remove(curr.size()-1);
        backtracking(n-1, k, curr, ans);
    }
}