class Solution {
    public int strStr(String haystack, String needle) {
        HashMap<Integer, Character> map = new HashMap<>();
        for(int i = 0; i < haystack.length();i++){
            map.put(i, haystack.charAt(i));
        }

        for(int i = 0; i < haystack.length();i++){
            if(map.get(i) == needle.charAt(0)){
                int k = i;
                boolean found = true;
                for(int j = 0; j < needle.length(); j++){
                    if(k >= haystack.length() || map.get(k) != needle.charAt(j)){
                        found = false;
                        break;
                    }
                    k++;
                }
                if(found) return i;
            }
        }
        return -1;
    }
}