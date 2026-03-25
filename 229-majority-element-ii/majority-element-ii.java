class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        int fl = nums.length/3;
        for(int key : map.keySet()){
            if(fl < map.get(key)){
                list.add(key);
            }
        }
        return list;
    }
}