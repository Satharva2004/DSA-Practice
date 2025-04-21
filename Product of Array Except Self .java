class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int result[] = new int[len];
        for(int i=0;i<nums.length;i++){
            int temp_result = 1;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    temp_result = temp_result * nums[j];
                }
            }
            result[i] = temp_result;
        }
        return result;
    }
}  
