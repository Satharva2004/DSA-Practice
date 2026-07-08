<div align="center">

# Concatenate Non-Zero Digits and Multiply by Sum II

[![LeetCode](https://img.shields.io/badge/LeetCode-concatenate--non--zero--digits--and--multiply--by--sum--ii-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-ii)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/concatenate-non-zero-digits-and-multiply-by-sum-ii)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **18 ms** | Beats **80.00%** ✅ Great |
| 🧠 Memory | **131 MB** | Beats **26.67%** |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(n + q)` | `O(n + q)` |
| **Explanation** | sequential loops over string and queries | arrays of size n and q for storing intermediate results |
| **Confidence** | High | High |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%20%2B%20q)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%20%2B%20q)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n + q)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n%20%2B%20q)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n%20%2B%20q)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n + q)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

You are given a string `s` of length `m` consisting of digits. You are also given a 2D integer array `queries`, where `queries[i] = [l_i, r_i]`.

For each `queries[i]`, extract the ** substring ** `s[l_i..r_i]`. Then, perform the following:

- Form a new integer `x` by concatenating all the **non-zero digits** from the substring in their original order. If there are no non-zero digits, `x = 0`.

- Let `sum` be the **sum of digits** in `x`. The answer is `x * sum`.

Return an array of integers `answer` where `answer[i]` is the answer to the `i^th` query.

Since the answers may be very large, return them **modulo** `10^9 + 7`.

 Example 1:**

**Input:** s = "10203004", queries = [[0,7],[1,3],[4,6]]

**Output:** [12340, 4, 9]

**Explanation:**

- `s[0..7] = "10203004"`

- `x = 1234`

- `sum = 1 + 2 + 3 + 4 = 10`

- Therefore, answer is `1234 * 10 = 12340`.

- `s[1..3] = "020"`

- `x = 2`

- `sum = 2`

- Therefore, the answer is `2 * 2 = 4`.

- `s[4..6] = "300"`

- `x = 3`

- `sum = 3`

- Therefore, the answer is `3 * 3 = 9`.

 Example 2:**

**Input:** s = "1000", queries = [[0,3],[1,1]]

**Output:** [1, 0]

**Explanation:**

- `s[0..3] = "1000"`

- `x = 1`

- `sum = 1`

- Therefore, the answer is `1 * 1 = 1`.

- `s[1..1] = "0"`

- `x = 0`

- `sum = 0`

- Therefore, the answer is `0 * 0 = 0`.

 Example 3:**

**Input:** s = "9876543210", queries = [[0,9]]

**Output:** [444444137]

**Explanation:**

- `s[0..9] = "9876543210"`

- `x = 987654321`

- `sum = 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 = 45`

- Therefore, the answer is `987654321 * 45 = 44444444445`.

- We return `44444444445 modulo (10^9 + 7) = 444444137`.

**Constraints:**

- `1 <= m == s.length <= 10^5`

- `s` consists of digits only.

- `1 <= queries.length <= 10^5`

- `queries[i] = [l_i, r_i]`

- `0 <= l_i <= r_i < m`

</details>

## 💡 Solution

```java
class Solution {
    int mod = 1_000_000_007;
    public int[] sumAndMultiply(String s, int[][] queries) {
        int n = s.length();
        long[] presum = new long[n+1];
        long[] concat = new long[n+1];
        int[] count = new int[n+1];
        long[] pow10 = new long[n+1];
        presum[0] = 0;
        for(int i = 0; i < n; i++){
            int num = s.charAt(i) - '0';

            presum[i+1] = (presum[i] + num) % mod;

            if(num == 0){
                concat[i+1] = concat[i];
                count[i+1] = count[i];
            } else {
                concat[i+1] = (concat[i] * 10 + num) % mod;
                count[i+1] = count[i] + 1;
            }
        }
        pow10[0] = 1;
        for(int i = 1; i < pow10.length; i++){
            pow10[i] = (pow10[i-1] * 10) % mod;
        }
        int[] res = new int[queries.length];
        for(int i = 0; i < queries.length; i++){
            int left  = queries[i][0];
            int right = queries[i][1];
            long sum = (presum[right+1] - presum[left] + mod) % mod;
            long leftpart = concat[left];
            long rightpart = concat[right+1];
            int diff = count[right+1] - count[left];
            long power = pow10[diff];
            long range = (rightpart - (leftpart*power)%mod + mod)%mod; 
            long x = (range * sum)%mod;
            res[i] = (int)x;
        }
        return res;
        
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 8, 2026</sub>
</div>
