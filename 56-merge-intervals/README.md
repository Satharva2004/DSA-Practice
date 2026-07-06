<div align="center">

# Merge Intervals

[![LeetCode](https://img.shields.io/badge/LeetCode-merge--intervals-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/merge-intervals)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/merge-intervals)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **18 ms** | Beats **6.01%** |
| 🧠 Memory | **49.1 MB** | Beats **42.33%** |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(n log n)` | `O(n)` |
| **Explanation** | The sort operation dominates with n log n complexity | The list data structure can hold up to n elements |
| **Confidence** | Medium | Medium |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%20log%20n)%22%2C%22data%22%3A%5B17%2C33%2C50%2C67%2C83%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%20log%20n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n log n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

Given an array of `intervals` where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals, and return *an array of the non-overlapping intervals that cover all the intervals in the input*.

 Example 1:**

```text

**Input:** intervals = [[1,3],[2,6],[8,10],[15,18]]
**Output:** [[1,6],[8,10],[15,18]]
**Explanation:** Since intervals [1,3] and [2,6] overlap, merge them into [1,6].

```

 Example 2:**

```text

**Input:** intervals = [[1,4],[4,5]]
**Output:** [[1,5]]
**Explanation:** Intervals [1,4] and [4,5] are considered overlapping.

```

 Example 3:**

```text

**Input:** intervals = [[4,7],[1,4]]
**Output:** [[1,7]]
**Explanation:** Intervals [1,4] and [4,7] are considered overlapping.

```

**Constraints:**

- `1 <= intervals.length <= 10^4`

- `intervals[i].length == 2`

- `0 <= start_i <= end_i <= 10^4`

</details>

## 💡 Solution

```java
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        int prevs = 1;
        while(prevs < list.size()){
            int[] prev = list.get(prevs - 1);
            int[] curr = list.get(prevs);
            int prevStart = prev[0];
            int prevEnd = prev[1];
            int start = curr[0];
            int end = curr[1];
            if(start <= prevEnd){
                list.remove(prevs);
                list.remove(prevs - 1);
                list.add(prevs - 1, new int[]{
                    prevStart,
                    Math.max(prevEnd, end)
                });
            }else prevs++;
        }
        return list.toArray(new int[list.size()][]);
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 7, 2026</sub>
</div>
