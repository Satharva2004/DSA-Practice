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

//Tried using array but understood the concept of bucket sort basically array overrides the new elements with same frequency but bucket sort converts the list into an ArrayList which can store multiple elements at single index

class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int n:nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        int arr[] = new int[nums.length+1];
        for(int key: map.keySet()){
            int frequency = map.get(key);
            arr[frequency] = key;
        } 
        int result[] = new int[k];
        int index = 0;
        for(int i=arr.length-1;i>=0 && index < k;i--){
            if(arr[i] != 0){
                result[index] = arr[i];
                index++;
            }
        }
        return result;
    }
}

