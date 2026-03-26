class Solution {
    public void rotate(int[] nums, int k) {
        Stack<Integer> stack = new Stack<>();
        k = k%nums.length;
        int n = nums.length;
        for(int i = n - k - 1; i >= 0; i--){
            stack.push(nums[i]);
        }
        for(int i = n - 1; i >= n - k; i--){
            stack.push(nums[i]);
        }
        for(int i = 0; i < nums.length;i++){
            nums[i] = stack.pop();
        }
    }
}