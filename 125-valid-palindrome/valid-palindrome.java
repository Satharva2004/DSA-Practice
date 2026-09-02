class Solution {
    public boolean isPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            char ch = s.charAt(i);
            char ch2 = s.charAt(j);
            if ((ch < 'A' || ch > 'Z') && (ch < 'a' || ch > 'z') && (ch < '0' || ch > '9')){
                i++;
                continue;
            }
            if ((ch2 < 'A' || ch2 > 'Z') && (ch2 < 'a' || ch2 > 'z')&& (ch2 < '0' || ch2 > '9')){
                j--;
                continue;
            }
            char lowerCh = ch;
            if (lowerCh >= 'A' && lowerCh <= 'Z') {
                lowerCh = (char) (lowerCh + 32);
            }
            char lowerCh2 = ch2;
            if (lowerCh2 >= 'A' && lowerCh2 <= 'Z') {
                lowerCh2 = (char) (lowerCh2 + 32);
            }
            if(lowerCh != lowerCh2) return false;
            j--;
            i++;
        }
        return true;
    }
}
