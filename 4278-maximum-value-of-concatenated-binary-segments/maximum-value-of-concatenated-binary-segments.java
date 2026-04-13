import java.util.*;

class Solution {
    public int maxValue(int[] nums1, int[] nums0) {
        int n = nums1.length;
        String[] segments = new String[n];

        // Build binary strings
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder();

            // append 1s
            for (int j = 0; j < nums1[i]; j++) {
                sb.append('1');
            }

            // append 0s
            for (int j = 0; j < nums0[i]; j++) {
                sb.append('0');
            }

            segments[i] = sb.toString();
        }


        Arrays.sort(segments, (a, b) -> (b + a).compareTo(a + b));

        StringBuilder result = new StringBuilder();
        for (String s : segments) {
            result.append(s);
        }

        long res = 0;
        int MOD = 1000000007;

        for (char c : result.toString().toCharArray()) {
            res = (res * 2 + (c - '0')) % MOD;
        }

        return (int) res;
    }
}
