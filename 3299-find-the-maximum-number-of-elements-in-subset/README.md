<div align="center">

# Find the Maximum Number of Elements in Subset

[![LeetCode](https://img.shields.io/badge/LeetCode-find--the--maximum--number--of--elements--in--subset-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/find-the-maximum-number-of-elements-in-subset)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **46 ms** | Beats **90.36%** ✅ Excellent |
| 🧠 Memory | **65.3 MB** | Beats **77.68%** ✅ Great |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(n*sqrt(m))` | `O(n)` |
| **Explanation** | iterating through nums array and for each number, potentially iterating up to square root of the frequency of the number | storing frequency of each number in a hashmap |
| **Confidence** | Medium | Medium |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n*sqrt(m))%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n*sqrt(m))%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n*sqrt(m))" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

You are given an array of **positive** integers `nums`.

You need to select a subset of `nums` which satisfies the following condition:

- You can place the selected elements in a **0-indexed** array such that it follows the pattern: `[x, x^2, x^4, ..., x^k/2, x^k, x^k/2, ..., x^4, x^2, x]` (**Note** that `k` can be be any **non-negative** power of `2`). For example, `[2, 4, 16, 4, 2]` and `[3, 9, 3]` follow the pattern while `[2, 4, 8, 4, 2]` does not.

Return *the **maximum** number of elements in a subset that satisfies these conditions.*

 Example 1:**

```text

**Input:** nums = [5,4,1,2,2]
**Output:** 3
**Explanation:** We can select the subset {4,2,2}, which can be placed in the array as [2,4,2] which follows the pattern and 2^2 == 4. Hence the answer is 3.

```

 Example 2:**

```text

**Input:** nums = [1,3,2,4]
**Output:** 1
**Explanation:** We can select the subset {1}, which can be placed in the array as [1] which follows the pattern. Hence the answer is 1. Note that we could have also selected the subsets {2}, {3}, or {4}, there may be multiple subsets which provide the same answer.

```

**Constraints:**

- `2 <= nums.length <= 10^5`

- `1 <= nums[i] <= 10^9`

</details>

## 💡 Solution

```java
class Solution {
    private static final int MAX_BASE = 31622;

    public int maximumLength(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>();
        for (int n : nums)
            freq.merge(n, 1, Integer::sum);

        int one = freq.getOrDefault(1, 0);
        int res = (one - 1) | 1;
        freq.remove(1);

        for (int f : freq.keySet()) {
            int sq = (int) Math.sqrt(f);
            if (sq * sq == f && freq.getOrDefault(sq, 0) > 1)
                continue;

            int n = 0, x = f;

            while (x < 31623 && freq.containsKey(x) && freq.get(x) > 1) {
                n += 2;
                x *= x;
            }

            res = Math.max(res, n + (freq.containsKey(x) ? 1 : -1));
        }

        return res;
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on June 29, 2026</sub>
</div>
