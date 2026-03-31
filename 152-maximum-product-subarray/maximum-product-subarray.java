class Solution {
    public int maxProduct(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            int sum = 1;
            int j = i;
            while(j < nums.length){
                sum *= nums[j];
                max = Math.max(sum, max);
                j++;
            }
        }
        return max;
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
