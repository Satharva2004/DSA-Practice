//copied but learning
class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> map = new HashSet<>();
        for(int n:nums){
            if(!map.contains(n)){
                map.add(n);
            }
        }
        int sequence = 0;
        
        for(int n:nums){
            if(!map.contains(n-1)){
                int currentNum = n;
                int count = 1;
                while(map.contains(currentNum +1)){
                    currentNum++;
                    count++;
                }
                sequence = Math.max(sequence, count);
                if(sequence > nums.length/2){
                    return sequence;
                }
            }
        }
        return sequence;
    }
}



