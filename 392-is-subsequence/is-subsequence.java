class Solution {
    public boolean isSubsequence(String s, String t) {
        int count = s.length()-1;
        if (s.length() == 0) return true;
        for(int i = t.length()-1; i >= 0 ; i--){
            if(s.charAt(count) == t.charAt(i)){
                count--;
            }
            if (count < 0) return true;
        }
        return false; 
    }
}