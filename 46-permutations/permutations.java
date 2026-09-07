class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
        boolean[] used = new boolean[nums.length];
        backtracking(path, list, nums, used);
        return list;
    }
    public void backtracking(List<Integer> path, List<List<Integer>> list, int[] nums, boolean[] used){
        if(path.size() == nums.length){
            list.add(new ArrayList<>(path));
            return;
        }
        for(int i = 0; i < nums.length;i++){
            if(used[i] == true) continue;
            used[i] = true;
            path.add(nums[i]);
            backtracking(path, list, nums, used);
            path.remove(path.size()-1);
            used[i] = false;
        }
    }
}