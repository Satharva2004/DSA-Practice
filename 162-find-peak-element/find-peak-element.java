class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        int i = 1;
        int res = 0;
        if (n == 1) return 0;
        if (nums[0] > nums[1]) return 0;
        if (nums[n - 1] > nums[n - 2]) return n - 1;
        while(i < n && i+1 < n){
            if(nums[i-1] < nums[i] && nums[i+1] < nums[i]){
                res = i;
            }
            i++;
        }
        return res;
    }
}