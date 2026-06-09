class Solution {
    public long maxTotalValue(int[] A, int k) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        return (max-min)*k;
    }
}