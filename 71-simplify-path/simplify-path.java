class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String demo[] = path.split("/+");
        for(int i = 0; i < demo.length; i++){
            if(demo[i].equals("..")){
                if(!stack.isEmpty()){
                    stack.pop();
                }
            }else if(demo[i].equals("") || demo[i].equals(".")){
                continue;
            }else{
                stack.push(demo[i]);
            }
        }
        return "/" + String.join("/", stack);
    }
}