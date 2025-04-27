class Solution {
    public void sortColors(int[] nums) {
       int k = 0;
       for(int i=0;i<nums.length;i++){
        if(nums[i] == 0){
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            k++;
        }
       }
       for(int i=0;i<nums.length;i++){
        if(nums[i] == 1){
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            k++;
        }
       }
       for(int i=0;i<nums.length;i++){
        if(nums[i] == 2){
            int temp = nums[i];
            nums[i] = nums[k];
            nums[k] = temp;
            k++;
        }
       }
    }
}



class Solution {
    public void sortColors(int[] nums) {
       int low = 0, mid = 0, high = nums.length-1 ;
       while(mid <= high){
        if(nums[mid] == 0){
            int temp = nums[mid];
            nums[mid] = nums[low];
            nums[low] = temp;
            low++;
            mid++;
        }
        else if(nums[mid] == 1){
            mid++;
        }
        else{
            int temp = nums[high];
            nums[high] = nums[mid];
            nums[mid] = temp;
            high--;
        }
       }
    }
}
