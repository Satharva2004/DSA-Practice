class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() == 0) {
            return 0;
        }
        for(int i = 0; i <= haystack.length() - needle.length(); i++){
            char curr = haystack.charAt(i);
            if(curr == needle.charAt(0)){
                int j = 0;
                int m = i;
                while(j < needle.length()){
                    if(haystack.charAt(m) != needle.charAt(j)){
                        break;
                    }
                    m++;
                    j++;
                }
                if(j == needle.length()) return i;
            }
        }
        return -1;
    }
}