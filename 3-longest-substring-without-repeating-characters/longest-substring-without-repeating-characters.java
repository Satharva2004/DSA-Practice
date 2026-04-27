class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
             Set<Character> map = new HashSet<>();
            for(int j = i; j < s.length(); j++){
                if(!map.contains(s.charAt(j))){
                    map.add(s.charAt(j));
                    max = Math.max(max, j - i +1);
                }
                else{
                    break;
                }
            }
        }
        return max;
    }
}