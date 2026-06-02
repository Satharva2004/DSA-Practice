class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        int land_water = Integer.MAX_VALUE;
        int water_land = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i = 0; i < n; i++){
            land = Math.min(land, landStartTime[i] + landDuration[i]);
        }
        for(int j = 0; j < m; j++){
            water = Math.min(water,waterStartTime[j] + waterDuration[j]);
            land_water = Math.min(land_water, Math.max(land, waterStartTime[j])+waterDuration[j]);
        }
        for(int c = 0; c < n; c++){
            water_land = Math.min(
                water_land,
                Math.max(water, landStartTime[c]) + landDuration[c]
            );
        }
        return Math.min(land_water, water_land);
    }
}