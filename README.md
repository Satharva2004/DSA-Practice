## Brain Rot at 6:7am 🕢


 recent wrong beauty - class Solution {
    public void backtracking(int nums[], List<Integer> temp, List<List<Integer>> result){
        if (temp.size() == nums.length) {
        result.add(new ArrayList<>(temp));
        return;
        }
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])){
                continue;
            }
            temp.add(nums[i]);
            backtracking(nums, temp, result);
            temp.remove(temp.size()-1);
        }
    }
    public int maxRotateFunction(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtracking(nums, new ArrayList<>(), result);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < result.size(); i++){
            int sum = 0;
            for(int j = 0; j < result.get(i).size();j++){
                sum += (j * result.get(i).get(j));
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
