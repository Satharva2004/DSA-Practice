/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null) return null;
        HashMap<Node, Node> map = new HashMap<>();
        return CloneNode(node, map);
    }
    public Node CloneNode(Node node, HashMap<Node, Node> map){
        if(map.containsKey(node)){
           return map.get(node); 
        }
        Node new_node = new Node(node.val);
        map.put(node, new_node);
        for(Node neighbour: node.neighbors){
            new_node.neighbors.add(CloneNode(neighbour, map));
        }
        return new_node;
    }
}