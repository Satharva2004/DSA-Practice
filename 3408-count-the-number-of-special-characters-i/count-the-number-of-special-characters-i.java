class Solution {
    public int numberOfSpecialChars(String word) {
        Set<Character> set = new HashSet<>();
        Set<Character> counted = new HashSet<>();
        int count =0;
        for(int i = 0; i < word.length(); i++){
            set.add(word.charAt(i));
            char upper = Character.toUpperCase(word.charAt(i));
            char lower = Character.toLowerCase(word.charAt(i));
            if(set.contains(upper) && set.contains(lower) && !counted.contains(upper)){
                count++;
                counted.add(upper);
            }
        }
        return count;
    }
}