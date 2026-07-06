<div align="center">

# Remove Covered Intervals

[![LeetCode](https://img.shields.io/badge/LeetCode-remove--covered--intervals-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/remove-covered-intervals)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/remove-covered-intervals)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **7 ms** | Beats **51.91%** ✅ Good |
| 🧠 Memory | **46.6 MB** | Beats **43.64%** |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(n log n)` | `O(1)` |
| **Explanation** | due to sorting the intervals array | only using a constant amount of space |
| **Confidence** | High | High |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%20log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%20log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

Given an array `intervals` where `intervals[i] = [l_i, r_i]` represent the interval `[l_i, r_i)`, remove all intervals that are covered by another interval in the list.

The interval `[a, b)` is covered by the interval `[c, d)` if and only if `c Example 1:**

```text

**Input:** intervals = [[1,4],[3,6],[2,8]]
**Output:** 2
**Explanation:** Interval [3,6] is covered by [2,8], therefore it is removed.

```

 Example 2:**

```text

**Input:** intervals = [[1,4],[2,3]]
**Output:** 1

```

**Constraints:**

- `1 <= intervals.length <= 1000`

- `intervals[i].length == 2`

- `0 <= l_i < r_i <= 10^5`

- All the given intervals are **unique**.

</details>

## 💡 Solution

```java
class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a,b) -> {
            if(a[0] == b[0]){
                return b[1]-a[1];
            }
            return a[0]-b[0];
        });
        int remove = 0;
        int prevs = 0;
        for(int i = 1; i < intervals.length; i++){
            int start = intervals[i][0];
            int end = intervals[i][1];
            int prevStart = intervals[prevs][0];
            int prevEnd = intervals[prevs][1];
            if(start >= prevStart && end <= prevEnd){
                remove++;
            }else{
                prevs = i;
            }
        }
        return intervals.length-remove;
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 7, 2026</sub>
</div>
