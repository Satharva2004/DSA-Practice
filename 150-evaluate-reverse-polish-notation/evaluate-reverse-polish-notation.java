class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String curr = tokens[i];
            if(curr.equals("+")){
                if(!stack.isEmpty()){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1+num2);
                }
            }else if(curr.equals("*")){
                if(!stack.isEmpty()){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1*num2);
                }
            }else if(curr.equals("/")){
                if(!stack.isEmpty()){
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(num1/num2);
                }
            }else if(curr.equals("-")){
                if(!stack.isEmpty()){
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(num1-num2);
                }
            }else {
                int num = Integer.parseInt(curr);
                stack.push(num);
            }
        }
        return stack.peek();
    }
}