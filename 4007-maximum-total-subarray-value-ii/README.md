<h2><a href="https://leetcode.com/problems/maximum-total-subarray-value-ii">Maximum Total Subarray Value II</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr><div align="center">

# Maximum Total Subarray Value II

[![Difficulty](https://img.shields.io/badge/Hard-ef4444?style=flat-square)](https://leetcode.com/problems/maximum-total-subarray-value-ii)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/388%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-43.75%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/199.5%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-34.38%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Maximum Total Subarray Value II](https://leetcode.com/problems/maximum-total-subarray-value-ii) | Hard | Java | 388 ms | 199.5 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **388 ms** | Beats **43.75%** |
| Memory | **199.5 MB** | Beats **34.38%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%20log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%20log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n%20log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n%20log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n log n)" /> |
| **`O(n log n)`**<br>SparseTable construction has two nested loops with total complexity O(n log n) and tree set operations have a total complexity of O(n log n)<br><sub>Confidence: High</sub> | **`O(n log n)`**<br>SparseTable uses two 2D arrays of size n x log n, and a TreeSet of size n<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given an integer array `nums` of length `n` and an integer `k`.

 You must select **exactly** `k` **distinct** subarrays `nums[l..r]` of `nums`. Subarrays may overlap, but the exact same subarray (same `l` and `r`) **cannot** be chosen more than once.

 The **value** of a subarray `nums[l..r]` is defined as: `max(nums[l..r]) - min(nums[l..r])`.

 The **total value** is the sum of the **values** of all chosen subarrays.

 Return the **maximum** possible total value you can achieve.

 Example 1:**

 **Input:** nums = [1,3,2], k = 2

 **Output:** 4

 **Explanation:**

 One optimal approach is:

- Choose `nums[0..1] = [1, 3]`. The maximum is 3 and the minimum is 1, giving a value of `3 - 1 = 2`.

- Choose `nums[0..2] = [1, 3, 2]`. The maximum is still 3 and the minimum is still 1, so the value is also `3 - 1 = 2`.

 Adding these gives `2 + 2 = 4`.

 Example 2:**

 **Input:** nums = [4,2,5,1], k = 3

 **Output:** 12

 **Explanation:**

 One optimal approach is:

- Choose `nums[0..3] = [4, 2, 5, 1]`. The maximum is 5 and the minimum is 1, giving a value of `5 - 1 = 4`.

- Choose `nums[1..3] = [2, 5, 1]`. The maximum is 5 and the minimum is 1, so the value is also `4`.

- Choose `nums[2..3] = [5, 1]`. The maximum is 5 and the minimum is 1, so the value is again `4`.

 Adding these gives `4 + 4 + 4 = 12`.

 **Constraints:**

- `1 ​​​​​​​4 `

- `0 9 `

- `1 5 , n * (n + 1) / 2)`

</details>

## Code

```java
import java.util.*;

class SparseTable {
    int n;
    int[][] mn;
    int[][] mx;
    int[] logVal;

    public SparseTable(int[] a) {
        n = a.length;
        int maxLog = 32 - Integer.numberOfLeadingZeros(n);

        mn = new int[n][maxLog];
        mx = new int[n][maxLog];
        logVal = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            logVal[i] = logVal[i / 2] + 1;
        }

        for (int i = 0; i < n; i++) {
            mn[i][0] = a[i];
            mx[i][0] = a[i];
        }

        for (int j = 1; (1 << j) <= n; j++) {
            for (int i = 0; i + (1 << j) <= n; i++) {
                mn[i][j] = Math.min(
                    mn[i][j - 1],
                    mn[i + (1 << (j - 1))][j - 1]
                );

                mx[i][j] = Math.max(
                    mx[i][j - 1],
                    mx[i + (1 << (j - 1))][j - 1]
                );
            }
        }
    }

    public int queryMin(int l, int r) {
        int j = logVal[r - l + 1];
        return Math.min(
            mn[l][j],
            mn[r - (1 << j) + 1][j]
        );
    }

    public int queryMax(int l, int r) {
        int j = logVal[r - l + 1];
        return Math.max(
            mx[l][j],
            mx[r - (1 << j) + 1][j]
        );
    }
}

class Solution {

    static class Node {
        int value;
        int l;
        int r;

        Node(int value, int l, int r) {
            this.value = value;
            this.l = l;
            this.r = r;
        }
    }

    public long maxTotalValue(int[] nums, int k) {
        int n = nums.length;
        long ans = 0;

        SparseTable st = new SparseTable(nums);

        TreeSet<Node> set = new TreeSet<>((a, b) -> {
            if (a.value != b.value)
                return Integer.compare(a.value, b.value);
            if (a.l != b.l)
                return Integer.compare(a.l, b.l);
            return Integer.compare(a.r, b.r);
        });

        for (int i = 0; i < n; i++) {
            int diff = st.queryMax(0, i) - st.queryMin(0, i);
            set.add(new Node(diff, 0, i));
        }

        while (k-- > 0) {
            Node cur = set.pollLast();

            ans += cur.value;

            if (cur.l + 1 <= cur.r) {
                int diff = st.queryMax(cur.l + 1, cur.r)
                         - st.queryMin(cur.l + 1, cur.r);

                set.add(new Node(diff, cur.l + 1, cur.r));
            }
        }

        return ans;
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
