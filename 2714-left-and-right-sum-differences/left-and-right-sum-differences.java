class Solution {
    public int[] leftRightDifference(int[] nums) {
        int leftSum[] = new int[nums.length];
        int rightSum[] = new int[nums.length];
        int answer[] = new int[nums.length];

        int sumleft = 0;
        int sumright = 0;

        leftSum[0] = 0;
        rightSum[nums.length - 1] = 0;

        for (int i = 1; i < nums.length; i++) {
            sumleft += nums[i - 1];   // fixed
            leftSum[i] = sumleft;
        }

        for (int i = nums.length - 2; i >= 0; i--) { 
            sumright += nums[i + 1];                
            rightSum[i] = sumright;                 
        }

        for (int i = 0; i < nums.length; i++) {
            answer[i] = Math.abs(leftSum[i] - rightSum[i]); 
        }

        return answer;
    }
}