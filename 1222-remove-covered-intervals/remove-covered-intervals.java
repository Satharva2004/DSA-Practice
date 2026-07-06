class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] == b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int remove = 0;
        int prevs = 0;
        for(int i = 1; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int prevStart = intervals[prevs][0];
            int prevEnd = intervals[prevs][1];
            if(start >= prevStart && end <= prevEnd){
                remove++;
            }else{
                prevs = i;
            }
        }
        return intervals.length-remove;
    }
}