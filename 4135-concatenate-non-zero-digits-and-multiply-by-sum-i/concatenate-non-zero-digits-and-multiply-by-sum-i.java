class Solution {
    public long sumAndMultiply(int n) {
        if (n == 0) return 0;
        StringBuilder sb = new StringBuilder();
        String num =  String.valueOf(n);
        int sum = 0;
        for(int i  = 0; i < num.length(); i++){
            char curr = num.charAt(i);
            if(curr != '0'){
                sb.append(curr);
                sum += Character.getNumericValue(curr);
            }
        }
        if (sb.length() == 0) return 0;
        long number = Long.parseLong(sb.toString());
        return number * sum;
    }
}