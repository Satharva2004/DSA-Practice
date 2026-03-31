class Solution {
    public int maxProduct(int[] nums) {
        int currmax = 1, currmin =1, res = nums[0];
        for(int n  : nums){
            res = Math.max(res, n);
        }
        for(int i = 0; i < nums.length; i++){
            int temp = currmax * nums[i];
            currmax = Math.max(temp, Math.max(currmin * nums[i], nums[i]));
            currmin = Math.min(temp, Math.min(currmin * nums[i], nums[i]));
            res = Math.max(currmax, res);
        }
        return res;
    }
}
/*
int max = 0;
    for(int i = 0; i< nums.length; i++){
            int prod = 1;;
            for(int j = i; j < nums.length; j++){
                prod *= nums[j];
                if(prod > max){
                    max = prod;
                }
            }
        }
    return max;
*/
