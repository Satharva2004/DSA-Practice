class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1];
        HashMap<Integer, Integer> frequency  = new HashMap<>();
        for(int n:nums){
            frequency.put(n, frequency.getOrDefault(n,0)+1);
        }
        for(int key: frequency.keySet()){
            int frq = frequency.get(key);
            if(bucket[frq] == null){
                bucket[frq] = new ArrayList<>();
            }
            bucket[frq].add(key);
        }
        int arr[] = new int[k];
        int index = 0;
        for(int i=bucket.length-1;i>=0 && index < k;i--){
            if(bucket[i] != null){
                for(Integer in : bucket[i])
                {
                    arr[index] = in;
                    index++;
                }
            }
        }
        return arr;
    }
}
