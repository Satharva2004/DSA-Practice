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
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return dfs(root, targetSum, 0);
    }
    public boolean dfs(TreeNode root, int targetSum, int sum){
        if(root == null) return false;
        sum += root.val;
        if(root.right == null && root.left == null) return sum == targetSum;

        return dfs(root.left, targetSum, sum) || dfs(root.right, targetSum, sum);
    }
}