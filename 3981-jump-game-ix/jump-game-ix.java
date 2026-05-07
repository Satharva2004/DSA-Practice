class Solution {
    public int[] maxValue(int[] nums) {
        int n = nums.length;
        int max[] = new int[n];
        int min[] = new int[n];
        max[0] = nums[0];
        for(int i = 1; i < n; i++){
            max[i] = Math.max(nums[i], max[i - 1]);
        }
        min[n-1] = nums[n-1];
        for(int i = n-2; i >= 0; i--){
            min[i] = Math.min(nums[i], min[i + 1]);
        }

        int ans[] = new int[n];
        ans[n-1] = max[n-1];
        for(int i = n-2; i >= 0; i--){
            if(max[i] > min[i+1]){
                ans[i] = ans[i+1];
            }else{
                ans[i] = max[i];
            }
        }
        return ans;
    }
}