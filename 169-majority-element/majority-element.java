class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        int max = 0;
        for(int i = 0; i < nums.length;i++){
            int curr = map.get(nums[i]);
            if(curr > nums.length / 2){
                max = nums[i];
            }
        }
        return max;
    }
}