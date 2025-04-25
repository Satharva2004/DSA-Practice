//new approch where proper prefix and postfix are maintained like we calulate the the entier arrays prefix and postfix like first element is 1 and then 1*the next element and storing that in the left array into fucked up ahe bhai porper i dont know wehre this concept wll be used again but ghu for sure
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int result[] = new int[len];
         int left[] = new int[len];
        int right[] = new int[len];
        left[0] = 1;
        for(int i=1;i<len;i++){
            left[i] = left[i-1] * nums[i-1];
        }
        right[len-1] = 1;
        for(int i=len-2;i>=0;i--){
            right[i] = right[i+1] * nums[i+1];
        }
        for(int i=0;i<len;i++){
            result[i] = left[i] * right[i];
        }
        return result;
    }
}  


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
