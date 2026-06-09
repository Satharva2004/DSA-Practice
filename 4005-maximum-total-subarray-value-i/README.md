<h2><a href="https://leetcode.com/problems/maximum-total-subarray-value-i">Maximum Total Subarray Value I</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><div align="center">

# Maximum Total Subarray Value I

[![Difficulty](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/maximum-total-subarray-value-i)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/1%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-100.00%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/62.3%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-52.21%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Maximum Total Subarray Value I](https://leetcode.com/problems/maximum-total-subarray-value-i) | Medium | Java | 1 ms | 62.3 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **1 ms** | Beats **100.00%** |
| Memory | **62.3 MB** | Beats **52.21%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |
| **`O(n)`**<br>single loop through the array<br><sub>Confidence: High</sub> | **`O(1)`**<br>using a constant amount of space<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given an integer array `nums` of length `n` and an integer `k`.

 You need to choose **exactly** `k` non-empty subarrays `nums[l..r]` of `nums`. Subarrays may overlap, and the exact same subarray (same `l` and `r`) **can** be chosen more than once.

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

- Choose `nums[0..3] = [4, 2, 5, 1]`. The maximum is 5 and the minimum is 1, so the value is also `4`.

- Choose `nums[2..3] = [5, 1]`. The maximum is 5 and the minimum is 1, so the value is again `4`.

 Adding these gives `4 + 4 + 4 = 12`.

 **Constraints:**

- `1 ​​​​​​​4 `

- `0 9 `

- `1 5 `

</details>

## Code

```java
class Solution {
    public long maxTotalValue(int[] A, int k) {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        for(int i = 0; i < A.length; i++){
            min = Math.min(min, A[i]);
            max = Math.max(max, A[i]);
        }
        return (max-min)*k;
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
