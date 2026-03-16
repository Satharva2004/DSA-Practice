class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char current = s.charAt(i);
            if(Character.isLetterOrDigit(current)){
                result.append(Character.toLowerCase(current));
            }
        }
        String og = result.toString();
        String reversed = new StringBuilder(og).reverse().toString(); 
        int left = 0;
        while(left < og.length()){
            if(og.charAt(left) != reversed.charAt(left)){
                return false;
            }
            left++;
        }
        return true;
    }
}