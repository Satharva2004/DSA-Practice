class Solution {
    public int minElement(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int sum = 0;
            while(curr != 0){
                int last = curr%10;
                sum += last;
                curr = curr/10;
            }
            min = Math.min(min,sum);
            nums[i] = sum;
        }
        return min;
    }
}