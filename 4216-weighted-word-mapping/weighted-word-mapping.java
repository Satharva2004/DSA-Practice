class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(int i =0; i < words.length; i++){
            int sum = 0;
            String curr = words[i];
            for(int j = 0; j < curr.length(); j++){
                sum += weights[curr.charAt(j) - 'a'];
            }
            int mod = sum%26;
            char ch = (char)('z' - mod);
            res.append(ch);
        }
        return res.toString();
    }
}