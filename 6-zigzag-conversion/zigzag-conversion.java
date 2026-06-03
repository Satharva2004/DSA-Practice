class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        StringBuilder sb = new StringBuilder("");
        int i = 0;
        while(i < numRows){
            int increment = 2 * (numRows - 1);
            for(int j = i; j < s.length(); j += increment){
                sb.append(s.charAt(j));
                if(i > 0 && i < numRows - 1 && j + increment - 2*i < s.length()){
                    sb.append(s.charAt(j + increment - 2*i));
                }
            }
            i++;
        }
        return sb.toString();
    }
}