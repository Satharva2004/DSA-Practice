class Solution {
    public int maximumLength(int[] nums) {
        HashMap<Long, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put((long)nums[i], map.getOrDefault((long)nums[i], 0) +1);
        }
        int ans = 0;
        if(map.containsKey(1L)){
            int ones = map.get(1L);
            ans = (ones%2==0) ? ones-1 : ones;
            map.remove(1L);
        }
        for(long num: map.keySet()){
            int count = 0;
            long curr = num;
            while(map.containsKey(curr)){
                if (map.get(curr) >= 2) {
                    count += 2;
                } else {
                    count++;
                    break;
                }
                curr = curr*curr;
            }
            if(count%2==0) count--;
            ans = Math.max(ans, count);
        }
        return ans;
    }
}