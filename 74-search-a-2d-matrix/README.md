<div align="center">

# Search a 2D Matrix

[![LeetCode](https://img.shields.io/badge/LeetCode-search--a--2d--matrix-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/search-a-2d-matrix)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/search-a-2d-matrix)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **0 ms** | Beats **100.00%** 🏆 Top 5% |
| 🧠 Memory | **43.9 MB** | Beats **43.25%** |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(m + log n)` | `O(1)` |
| **Explanation** | sequential loop over rows and binary search over a single row | using constant extra space |
| **Confidence** | High | High |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(m%20%2B%20log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(m%20%2B%20log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(m + log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

You are given an `m x n` integer matrix `matrix` with the following two properties:

- Each row is sorted in non-decreasing order.

- The first integer of each row is greater than the last integer of the previous row.

Given an integer `target`, return `true` *if* `target` *is in* `matrix` *or* `false` *otherwise*.

You must write a solution in `O(log(m * n))` time complexity.

 Example 1:**

```text

**Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
**Output:** true

```

 Example 2:**

```text

**Input:** matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
**Output:** false

```

**Constraints:**

- `m == matrix.length`

- `n == matrix[i].length`

- `1 <= m, n <= 100`

- `-10^4 <= matrix[i][j], target <= 10^4`

</details>

## 💡 Solution

```java
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int index = -1;
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        for(int i = 0; i < matrix.length; i++){
            int left = 0;
            int right = matrix[0].length-1;
            if(matrix[i][left] <= target && matrix[i][right] >= target){
                index = i;
                break;
            }
        }
        if (index == -1) {
            return false;
        }
        int left = 0;
        int right = matrix[index].length-1;
        while(left <= right){
            int mid  = left + (right-left)/2;
            if(matrix[index][mid] == target){
                return true;
            }else if(matrix[index][mid] < target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return false;
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 9, 2026</sub>
</div>
