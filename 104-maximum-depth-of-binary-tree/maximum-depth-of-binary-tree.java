/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        Stack<Pair> stack = new Stack<>();
        int res = 0;
        stack.push(new Pair(root, 1));
        while(!stack.isEmpty()){
            Pair<TreeNode, Integer> curr = stack.pop();
            TreeNode node = curr.getKey();
            int depth = curr.getValue();
            if(node != null){
                res = Math.max(res, depth);
                stack.push(new Pair(node.left, depth+1));
                stack.push(new Pair(node.right, depth+1));
            }
        }
        return res;
    }
}