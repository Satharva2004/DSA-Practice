//using prefix and postfix basically using an pointer that runs from i=0 to the index i and other i+1 to nums.lenght
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int result[] = new int[len];
        for(int i=0;i<nums.length;i++){
            int left = 1;
            int right = 1;
            for(int left_index = 0; left_index<i;left_index++){
                left = left * nums[left_index];
            }
            for(int right_index = i+1; right_index<nums.length;right_index++){
                right = right * nums[right_index];
            }
            result[i] = left*right;
        }
        return result;
    }
}  



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
