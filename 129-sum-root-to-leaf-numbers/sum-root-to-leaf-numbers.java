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
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        dfs(root, list, path);
        int sum = 0;
        for(int i = 0; i < list.size(); i++){
            List<Integer> inner = list.get(i);

            int num = 0;
            for (int j = 0; j < inner.size(); j++) {
                num = num * 10 + inner.get(j);
            }

            sum += num;
        }
        return sum;

    }
    public void dfs(TreeNode root, List<List<Integer>> list, List<Integer> path){
        if(root == null) return;
        path.add(root.val);
        if(root.left == null && root.right == null){
            list.add(new ArrayList<>(path));
        }
        dfs(root.left, list, path);
        dfs(root.right, list, path);
        path.remove(path.size() - 1);
    }
}