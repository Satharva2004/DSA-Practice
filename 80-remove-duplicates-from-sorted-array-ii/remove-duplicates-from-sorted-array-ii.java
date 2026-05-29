class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 0;
        int i = 1;
        int j = 1;

        while (i < nums.length) {
            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 0;
            }

            if (count < 2) {
                nums[j] = nums[i];
                j++;
            }

            i++;
        }

        return j;
    }
}