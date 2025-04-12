class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket = new List[nums.length+1]; // making a list like an bucket which can hold multiple values for each index
        HashMap<Integer, Integer> frequency  = new HashMap<>(); //hashmap for storing the frquency of each element in the array by using getOrDefault
        for(int n:nums){
            frequency.put(n, frequency.getOrDefault(n,0)+1);
        }
        for(int key: frequency.keySet()){ //going through each character
            int frq = frequency.get(key); // finding the value with each character by using get function
            if(bucket[frq] == null){ //making each index in the list an ArrayList
                bucket[frq] = new ArrayList<>(); 
            }
            bucket[frq].add(key); //bucket chya index la to number taka crazy 
        }
        int arr[] = new int[k]; //the result array
        int index = 0;
        for(int i=bucket.length-1;i>=0 && index < k;i--){
            if(bucket[i] != null){ 
                for(Integer in : bucket[i]) //have to convert first
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

