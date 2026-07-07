class Solution {
    public long sumAndMultiply(int n) {
        String num = String.valueOf(n);
        long x = 0;
        int sum = 0;
        for (int i = 0; i < num.length(); i++) {
            char curr = num.charAt(i);
            
            if (curr != '0') {
                int digit = curr - '0';
                x = (x * 10) + digit;
                sum += digit;
            }
        }
        return x*sum;
    }
} 