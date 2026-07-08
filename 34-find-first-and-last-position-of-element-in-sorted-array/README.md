<div align="center">

# Find First and Last Position of Element in Sorted Array

[![LeetCode](https://img.shields.io/badge/LeetCode-find--first--and--last--position--of--element--in--sorted--array-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **0 ms** | Beats **100.00%** 🏆 Top 5% |
| 🧠 Memory | **47.9 MB** | Beats **86.86%** ✅ Great |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(log n)` | `O(1)` |
| **Explanation** | two separate binary search loops over the input array | constant space used to store the result and loop variables |
| **Confidence** | High | High |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

Given an array of integers `nums` sorted in non-decreasing order, find the starting and ending position of a given `target` value.

If `target` is not found in the array, return `[-1, -1]`.

You must write an algorithm with `O(log n)` runtime complexity.

 Example 1:**

```text
**Input:** nums = [5,7,7,8,8,10], target = 8
**Output:** [3,4]

```
 Example 2:**

```text
**Input:** nums = [5,7,7,8,8,10], target = 6
**Output:** [-1,-1]

```
 Example 3:**

```text
**Input:** nums = [], target = 0
**Output:** [-1,-1]

```

**Constraints:**

- `0 <= nums.length <= 10^5`

- `-10^9 <= nums[i] <= 10^9`

- `nums` is a non-decreasing array.

- `-10^9 <= target <= 10^9`

</details>

## 💡 Solution

```java
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1,-1};
        int left = 0;
        int right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                res[0] = mid;
                right = mid - 1;
            }else if(nums[mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        left = 0;
        right = nums.length-1;
        while(left <= right){
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                res[1] = mid;
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return res;
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 8, 2026</sub>
</div>
