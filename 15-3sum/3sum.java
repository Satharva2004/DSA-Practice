class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            int l = i+1;
            int r = nums.length-1;
            while(l < r){
                int three = nums[i] + nums[l] + nums[r];
                if(three < 0){
                    l++;
                }else if(three > 0){
                    r--;
                }
                else{
                    list.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    l++;
                    while(nums[l] == nums[l-1] && l < r){
                        l++;
                    }
                }
            }
        }
        return list;
    }
}