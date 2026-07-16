class Solution {
    public long gcdSum(int[] nums) {
        int max = -1;
        int n = nums.length;
        int[] prefixGCD = new int[n];
        for(int i =0; i < n; i++){
            max = Math.max(max, nums[i]);
            prefixGCD[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGCD);
        long ans = 0;
        int i = 0, j = n-1;
        while(i<j){
            ans += gcd(prefixGCD[i], prefixGCD[j]);
            i++;
            j--;
        }

        return ans;
    }
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}