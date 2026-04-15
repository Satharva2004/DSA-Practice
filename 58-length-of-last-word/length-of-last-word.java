class Solution {
    public int lengthOfLastWord(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                count++;
                stack.push(count);
            } else if (!stack.isEmpty()) {
                break;
            }
        }
        return stack.isEmpty() ? 0 : stack.peek();
    }
}