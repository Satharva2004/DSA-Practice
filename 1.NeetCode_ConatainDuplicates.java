class Solution {
    public boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsValue(nums[i])){
                return true;
            }
            map.put(i, nums[i]);
        }
        return false;
    }
}
