class Solution {
    public int numberOfSpecialChars(String word) {
        int lower[] = new int[26];
        int upper[] = new int[26];
        Arrays.fill(lower, -1);
        Arrays.fill(upper, -1);
        for(int i = 0 ; i < word.length(); i++){
            char cha = word.charAt(i);
            if(cha >= 'a' && cha<='z'){
                lower[cha-'a'] = i;
            }else{
                if(upper[cha-'A']== -1){
                    upper[cha-'A'] = i;
                }
            }
        }
        int count = 0;
        for(int i = 0; i < 26; i++){
            if(lower[i] != -1 && upper[i] != -1 && lower[i] < upper[i]){
                count++;
            }
        }
        return count;
    }
}