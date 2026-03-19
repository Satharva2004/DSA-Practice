class Solution {
    public boolean isAnagram(String s, String t) {
        int[] alpa = new int[26];
        int n = s.length();
        int n1 = t.length();
        if(n1 != n) return false;
        for(int i = 0; i < n; i++){
            alpa[s.charAt(i)-'a']++;
            alpa[t.charAt(i)-'a']--;
        }
        for(Integer i: alpa){
            if(i != 0) return false;
        }
        return true;
    }
}