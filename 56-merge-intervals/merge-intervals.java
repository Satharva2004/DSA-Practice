class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        int prevs = 1;
        while(prevs < list.size()){
            int[] prev = list.get(prevs - 1);
            int[] curr = list.get(prevs);
            int prevStart = prev[0];
            int prevEnd = prev[1];
            int start = curr[0];
            int end = curr[1];
            if(start <= prevEnd){
                list.remove(prevs);
                list.remove(prevs - 1);
                list.add(prevs - 1, new int[]{
                    prevStart,
                    Math.max(prevEnd, end)
                });
            }else prevs++;
        }
        return list.toArray(new int[list.size()][]);
    }
}