class Solution {
    public int maxDistance(int[] colors) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < colors.length;i++){
            for(int j = i+1; j < colors.length; j++){
                int distance = Math.abs(i-j);
                if(colors[i] != colors[j]){
                    max = Math.max(max, distance);
                }
            }
        }
        return max;
    }
}