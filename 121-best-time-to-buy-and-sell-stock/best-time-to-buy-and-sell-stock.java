class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int curr = prices[0];
        for(int i = 1; i < prices.length; i++){
            int profit = prices[i] - curr;
            max = Math.max(max, profit);
            if(curr > prices[i]){
                curr = prices[i];
            }
        }
        return max;
    }
}