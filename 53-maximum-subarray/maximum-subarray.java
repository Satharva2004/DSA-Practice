class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0, res = nums[0];
        for(int n: nums){
            res = Math.max(n, res);
        }
        int i = 0;
        while(i < nums.length){
            sum += nums[i];
            sum = Math.max(nums[i], sum);
            res = Math.max(res, sum);
            i++;
        }
        return res;
    }
}