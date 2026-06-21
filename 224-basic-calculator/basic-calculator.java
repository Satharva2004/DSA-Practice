class Solution {
    int i = 0;
    char[] arr;

    public int calculate(String s) {
        arr = s.toCharArray();
        i = 0;
        return (int) dfs();
    }

    public long dfs() {
        long sum = 0;
        int op = 1;

        while (i < arr.length) {
            char curr = arr[i];

            if (curr == ' ') {
            } else if (curr == '+') {
                op = 1;
            } else if (curr == '-') {
                op = -1;
            } else if (curr == ')') {
                break;
            } else if (curr == '(') {
                i++;
                sum += op * dfs();
            } else if (Character.isDigit(curr)) {
                long num = 0;
                while (i < arr.length && Character.isDigit(arr[i])) {
                    num = num * 10 + (arr[i] - '0');
                    i++;
                }
                i--;
                sum += op * num;
            }

            i++;
        }

        return sum;
    }
}