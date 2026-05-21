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
    int l = 0, r = 0;
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return sync(root.left, root.right);
    }
    public boolean sync(TreeNode root1, TreeNode root2){
        if(root1==null && root2==null) return true;
        if(root1==null || root2==null) return false;
        return (root1.val == root2.val) && sync(root1.right, root2.left) && sync(root1.left, root2.right);
    }
}