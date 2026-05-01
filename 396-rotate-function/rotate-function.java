class Solution {
    public int maxRotateFunction(int[] nums) {
        int n = nums.length;
        int totalSum = 0;
        int current = 0;

        for (int i = 0; i < n; i++) {
            totalSum += nums[i];
            current += i * nums[i];
        }

        int max = current;

        for (int k = 1; k < n; k++) {
            current = current + totalSum - n * nums[n - k];
            max = Math.max(max, current);
        }

        return max;
    }
}