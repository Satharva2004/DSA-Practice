class Solution {
    public int removeDuplicates(int[] nums) {
        int left = 0, right = 0;
        int i = 0;
        int n = nums.length;
        while(i < n){
            int count = 1;
            while(i + count < n && nums[i] == nums[i + count]){
                count++;
            }
            int times = Math.min(2,count);
            for (int k = 0; k < times; k++) {
                nums[left++] = nums[i];
            }
            i += count;
        }
        return left;
    }
}