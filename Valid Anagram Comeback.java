class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        int s_len = s.length();
        int t_len = t.length();
        if(s_len!=t_len){
            return false;
        }
        for(int i=0;i<s_len;i++){
            map1.put(s.charAt(i), map1.getOrDefault(s.charAt(i), 0) + 1);
            map2.put(t.charAt(i), map2.getOrDefault(t.charAt(i), 0) + 1);
        }
        if(map1.equals(map2)){
            return true;
        }
        return false;
    }
}
