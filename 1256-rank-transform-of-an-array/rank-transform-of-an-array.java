class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] sorted = Arrays.copyOf(arr, arr.length);
        Arrays.sort(sorted);
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 1;
        for(int i = 0; i < arr.length; i++){
            if(!map.containsKey(sorted[i])){
                map.put(sorted[i], count);
                count++;
            }
        }
        for(int i = 0 ; i < arr.length; i++){
            int curr = map.get(arr[i]);
            arr[i] = curr;
        }
        return arr;
    }
}