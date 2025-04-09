class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int count[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }
        for(int n:count){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}

//using hashMap
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        //s = "racecar", t = "carrace"
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i),0)+1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i),0)-1);
        }
        for(int n: map.values()){
            if(n != 0){
                return false;
            }
        }
        return true;
    }
}
