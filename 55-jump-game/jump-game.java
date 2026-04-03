class Solution {
    public boolean canJump(int[] nums) {
        int major_max = 0;
        for(int i = 0; i < nums.length; i++){
            if(i > major_max) return false;
            int max = i + nums[i];
            major_max = Math.max(major_max, max);
            if(major_max >= nums.length-1){
                return true;
            }
        }
        return false;
    }
}