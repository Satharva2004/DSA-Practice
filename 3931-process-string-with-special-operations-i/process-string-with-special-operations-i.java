class Solution {
    public String processStr(String s) {
        StringBuilder sb  = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char curr = s.charAt(i);
            if(Character.isLowerCase(curr) && Character.isLetter(curr)){
                sb.append(curr);
            }else if(curr == '#'){
                sb.append(sb);
            }else if(curr == '%'){
                sb.reverse();
            }else if(curr == '*'){
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}