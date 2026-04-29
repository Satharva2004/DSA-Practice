class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> hehe = new ArrayList<>();
        int i = 0 , j = 1;
        int temp = i;
        while(i < nums.length){
            j = i;
            while(j+1 < nums.length && nums[j+1] == nums[j]+1){
                j++;
            }
            if(i == j){
                hehe.add(String.valueOf(nums[i]));
            }else{
                hehe.add(nums[i]+"->"+nums[j]);
            }
            i = j+1;
        }
        return hehe;
    }
}