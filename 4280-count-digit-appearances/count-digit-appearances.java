class Solution {
    public int countDigitOccurrences(int[] nums, int digit) {
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            if(curr == 0){
                if(digit == 0) count++;
                continue;
            }
            while(curr != 0){
                int mod = curr%10;
                if(mod == digit)count++;
                curr = curr/10;
            }
        }
        return count;
    }
}