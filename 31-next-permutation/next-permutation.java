class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length-1;
        int pivot = -1;
        for(int i = n; i > 0; i--){
            if(nums[i] > nums[i-1]){
                pivot = i-1;
                break;
            }
        }
        int j = n;
        if(pivot != -1){
            while(nums[j] <= nums[pivot]){
            j--;
        }int temp = nums[pivot];
        nums[pivot] = nums[j];
        nums[j] = temp;
        }
        
        int left = pivot + 1;
        int right = nums.length - 1;

        while (left < right) {
            int temps = nums[left];
            nums[left] = nums[right];
            nums[right] = temps;
            left++;
            right--;
        }
    }
}
