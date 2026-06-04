class Solution {
    int count = 0;
    public int totalWaviness(int num1, int num2) {
        for(int i = num1; i <= num2; i++){
           generator(i);
        }
        return count;
    }
    public int generator(int i)
    {
        String sb = Integer.toString(i);
        for (int j = 1; j < sb.length() - 1; j++) 
        {
            int prev = sb.charAt(j - 1) - '0';
            int curr = sb.charAt(j) - '0';
            int next = sb.charAt(j + 1) - '0';
            if(curr > prev && curr > next || curr < prev && curr < next){
                count++;
            }
        }
        return count;
    }
}