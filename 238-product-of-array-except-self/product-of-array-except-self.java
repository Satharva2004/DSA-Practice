class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prefix[] = new int[nums.length];
        int postfix[] = new int[nums.length];
        int ans[] = new int[nums.length];
        prefix[0] = 1;
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i -1] * nums[i-1]; 
        }
        int n = nums.length-1;
        postfix[n] = 1;
        for(int i = nums.length-2; i >= 0; i--){
            postfix[i] = postfix[i+1] * nums[i+1];
        }
        for(int i  = 0 ; i < nums.length; i++){
            ans[i] = prefix[i] * postfix[i];
        }        
        return ans;
    }
}
/*int ans[] = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            int mul = 1;
            for(int j = 0; j < nums.length; j++){
                if(nums[j] != num){
                    mul *= nums[j];
                }
            }
            ans[i] = mul;
        }
        return ans;*/