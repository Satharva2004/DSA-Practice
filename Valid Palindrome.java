//brute force logic 

class Solution {
    public boolean isPalindrome(String s) {
        String result = "";
        String reverse  = "";
        for(int i=0; i<s.length();i++){
            char current = s.charAt(i);
            if(Character.isLetterOrDigit(current)){
                result = result + Character.toLowerCase(current);
            }
        }
        for(int i=result.length()-1;i>=0;i--){
            char current = result.charAt(i);
            reverse = reverse + current;
        }
        if(result.equals(reverse)){
            return true;
        }
        return false;
    }
}
