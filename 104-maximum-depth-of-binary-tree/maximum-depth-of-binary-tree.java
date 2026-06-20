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
    int sum = 0;
    public int maxDepth(TreeNode root) {
        dfs(root, 1);
        return sum;
    }
    public void dfs(TreeNode root, int count){
        if(root == null) return;
        sum = Math.max(count, sum);
        dfs(root.left, count+1);
        dfs(root.right, count+1);
    }
}