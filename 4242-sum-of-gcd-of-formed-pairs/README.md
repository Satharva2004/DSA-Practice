<div align="center">

# Sum of GCD of Formed Pairs

[![LeetCode](https://img.shields.io/badge/LeetCode-sum--of--gcd--of--formed--pairs-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/sum-of-gcd-of-formed-pairs)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/sum-of-gcd-of-formed-pairs)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **60 ms** | Beats **32.50%** |
| 🧠 Memory | **107.9 MB** | Beats **73.50%** ✅ Good |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(n log n)` | `O(n)` |
| **Explanation** | dominated by Arrays.sort call | extra space used for prefixGCD array |
| **Confidence** | Medium | Medium |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%20log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%20log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

You are given an integer array `nums` of length `n`.

Construct an array `prefixGcd` where for each index `i`:

- Let `mx_i = max(nums[0], nums[1], ..., nums[i])`.

- `prefixGcd[i] = gcd(nums[i], mx_i)`.

After constructing `prefixGcd`:

- Sort `prefixGcd` in **non-decreasing** order.

- Form pairs by taking the **smallest unpaired** element and the **largest unpaired** element.

- Repeat this process until no more pairs can be formed.

- For each formed pair, **compute** the `gcd` of the two elements.

- If `n` is odd, the **middle** element in the `prefixGcd` array remains **unpaired** and should be ignored.

Return an integer denoting the **sum of the GCD** values of all formed pairs.

The term `gcd(a, b)` denotes the **greatest common divisor** of `a` and `b`.

 Example 1:**

**Input:** nums = [2,6,4]

**Output:** 2

**Explanation:**

Construct `prefixGcd`:

 `i`
 `nums[i]`
 `mx_i`
 `prefixGcd[i]`

 0
 2
 2
 2

 1
 6
 6
 6

 2
 4
 6
 2

`prefixGcd = [2, 6, 2]`. After sorting, it forms `[2, 2, 6]`.

Pair the smallest and largest elements: `gcd(2, 6) = 2`. The remaining middle element 2 is ignored. Thus, the sum is 2.

 Example 2:**

**Input:** nums = [3,6,2,8]

**Output:** 5

**Explanation:**

Construct `prefixGcd`:

 `i`
 `nums[i]`
 `mx_i`
 `prefixGcd[i]`

 0
 3
 3
 3

 1
 6
 6
 6

 2
 2
 6
 2

 3
 8
 8
 8

`prefixGcd = [3, 6, 2, 8]`. After sorting, it forms `[2, 3, 6, 8]`.

Form pairs: `gcd(2, 8) = 2` and `gcd(3, 6) = 3`. Thus, the sum is `2 + 3 = 5`.

**Constraints:**

- `1 <= n == nums.length <= 10^5`

- `1 <= nums[i] <= 10^​​​​​​​9`

</details>

## 💡 Solution

```java
class Solution {
    public long gcdSum(int[] nums) {
        int max = -1;
        int n = nums.length;
        int[] prefixGCD = new int[n];
        for(int i =0; i < n; i++){
            max = Math.max(max, nums[i]);
            prefixGCD[i] = gcd(nums[i], max);
        }
        Arrays.sort(prefixGCD);
        long ans = 0;
        int i = 0, j = n-1;
        while(i<j){
            ans += gcd(prefixGCD[i], prefixGCD[j]);
            i++;
            j--;
        }

        return ans;
    }
    public int gcd(int a, int b){
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 17, 2026</sub>
</div>
