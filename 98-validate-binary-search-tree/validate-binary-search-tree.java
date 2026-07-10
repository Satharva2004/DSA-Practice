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
    public boolean isValidBST(TreeNode root) {
        double right = Float.POSITIVE_INFINITY;
        double left = Float.NEGATIVE_INFINITY;
        return dfs(root, left, right);
    }
    public boolean dfs(TreeNode root, double left, double right){
        if(root == null) return true;
        if (root.val <= left || root.val >= right) return false;
        return dfs(root.left, left, root.val) && dfs(root.right, root.val, right);
        
    }
}