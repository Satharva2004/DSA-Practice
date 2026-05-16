class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char curr = s.charAt(i);
            if(curr == '('){
                stack.push(')');
            }else if(curr == '{'){
                stack.push('}');
            }else if(curr == '['){
                stack.push(']');
            }else if(stack.isEmpty() || curr != stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
}