class Solution {
    public int maxSum(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = -1;
        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
            int max = 0;
            int temp = curr;
            while(temp > 0){
                int num = temp%10;
                max = Math.max(num, max);
                temp = temp/10;
            }
            if(map.containsKey(max)){
                int sum  = map.get(max)+curr;
                res = Math.max(res, sum);
                map.put(max, Math.max(map.get(max), curr));
            }else{
                map.put(max, curr);
            }
        }
        return res;
    }
}