<h2><a href="https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii">Total Waviness of Numbers in Range II</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr><div align="center">

# Total Waviness of Numbers in Range II

[![Difficulty](https://img.shields.io/badge/Hard-ef4444?style=flat-square)](https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/23%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-96.25%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/42.8%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-100.00%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Total Waviness of Numbers in Range II](https://leetcode.com/problems/total-waviness-of-numbers-in-range-ii) | Hard | Java | 23 ms | 42.8 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **23 ms** | Beats **96.25%** |
| Memory | **42.8 MB** | Beats **100.00%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |
| **`O(log n)`**<br>The time complexity is dominated by the countWays function which has a loop with a multiplicative factor of 10, but the number of iterations is proportional to the number of digits in the input number<br><sub>Confidence: High</sub> | **`O(1)`**<br>The space complexity is constant because the code only uses a fixed amount of space to store the waves array and other variables, regardless of the input size<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given two integers `num1` and `num2` representing an **inclusive** range `[num1, num2]`.

 The **waviness** of a number is defined as the total count of its **peaks** and **valleys**:

- A digit is a **peak** if it is **strictly greater** than both of its immediate neighbors.

- A digit is a **valley** if it is **strictly less** than both of its immediate neighbors.

- The first and last digits of a number **cannot** be peaks or valleys.

- Any number with fewer than 3 digits has a waviness of 0.

Return the total sum of waviness for all numbers in the range `[num1, num2]`.

 Example 1:**

 **Input:** num1 = 120, num2 = 130

 **Output:** 3

 **Explanation:**

 In the range `[120, 130]`:

- `120`: middle digit 2 is a peak, waviness = 1.

- `121`: middle digit 2 is a peak, waviness = 1.

- `130`: middle digit 3 is a peak, waviness = 1.

- All other numbers in the range have a waviness of 0.

 Thus, total waviness is `1 + 1 + 1 = 3`.

 Example 2:**

 **Input:** num1 = 198, num2 = 202

 **Output:** 3

 **Explanation:**

 In the range `[198, 202]`:

- `198`: middle digit 9 is a peak, waviness = 1.

- `201`: middle digit 0 is a valley, waviness = 1.

- `202`: middle digit 0 is a valley, waviness = 1.

- All other numbers in the range have a waviness of 0.

 Thus, total waviness is `1 + 1 + 1 = 3`.

 Example 3:**

 **Input:** num1 = 4848, num2 = 4848

 **Output:** 2

 **Explanation:**

 Number `4848`: the second digit 8 is a peak, and the third digit 4 is a valley, giving a waviness of 2.

 **Constraints:**

- `1 15 `​​​​​​​

</details>

## Code

```java
class Solution {
    static final int[] waves = new int[570];

    static {
        int j = 0;
        for (int i = 0; i < 1000; i++) {
            int r = i % 10;
            int m = (i / 10) % 10;
            int l = (i / 100) % 10;
            if ((m > Math.max(l, r)) | (m < Math.min(l, r)))
                waves[j++] = i;
        }
    }

    public long totalWaviness(long A, long B) {
        return waveCount(B) - waveCount(A - 1);
    }

    private long waveCount(long num) {
        if (num < 100) return 0;
        long res = 0;
        for (int p : waves)
            res += countWays(num, p);            
        return res;
    }

    private long countWays(long num, int pattern) {
        long type = pattern < 100 ? 1 : 0;
        long count = 0, mult = 1;

        for (int i = 0; mult * 100 <= num; i++) {
            long pre = num / (mult * 1000);
            long cur = (num / mult) % 1000;
            long suf = num % mult;
            long ways = 0;

            if (cur > pattern)
                ways = pre - type + 1;
            else if (cur == pattern) {
                ways = Math.max(0L, pre - type);
                count += suf + 1;
            } else
                ways = Math.max(0L, pre - type);

            count += ways * mult;
            mult *= 10;
        }

        return count;
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
