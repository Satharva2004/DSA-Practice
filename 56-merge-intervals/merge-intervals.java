class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        for(int i = 0; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1)[1]) {
                continue;
            }
            for(int j = i+1; j < intervals.length; j++){
                if(intervals[j][0] <= end){
                    end = Math.max(intervals[j][1], end);
                }else{
                    break;
                }
            }
            ans.add(new int[]{start, end});
        }
        int[][] result = new int[ans.size()][2];
        for(int i = 0 ; i < ans.size(); i++){
            result[i] = ans.get(i);
        }
        return result;
    }
}