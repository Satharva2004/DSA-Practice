class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int number = 0;
        int n = nums.length;
        //1,5,8,4,7,6,5,3,1
        for(int i = n-2 ; i >= 0; i--){
            if(nums[i] < nums[i+1]){
                index = i;
                number = nums[i];
                break;
            }
        }
        if(index == -1){
            int left = 0;
            int right = n - 1;
            while(left < right){
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            return;
        }
        for(int i = n - 1; i > index; i--) {
            if(nums[i] > nums[index]) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                break;
            }
        }
        int left = index + 1;
        int right = nums.length - 1;

        while(left < right){
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
