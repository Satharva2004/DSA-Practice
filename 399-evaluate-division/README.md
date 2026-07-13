<div align="center">

# Evaluate Division

[![LeetCode](https://img.shields.io/badge/LeetCode-evaluate--division-FFA116?style=flat-square&logo=leetcode&logoColor=white)](https://leetcode.com/problems/evaluate-division)
[![Medium](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/evaluate-division)
[![Java](https://img.shields.io/badge/Java-ED8B00?style=flat-square&logo=openjdk&logoColor=white)](https://leetcode.com/problems/)

</div>

---

## 📊 Performance

| Metric | Result | Percentile |
|--------|--------|-----------|
| ⏱️ Runtime | **1 ms** | Beats **98.47%** 🏆 Top 5% |
| 🧠 Memory | **47.1 MB** | Beats **31.24%** |

## 🔬 Complexity

| | Time | Space |
|---|------|-------|
| **Complexity** | `O(V + Q * (V + E))` | `O(V + E)` |
| **Explanation** | where V is the number of distinct variables and E is the number of equations, due to nested loops and recursive DFS calls | for storing the adjacency list and recursion stack |
| **Confidence** | Medium | Medium |

<details>
<summary>📈 Complexity growth curves</summary>

| Time | Space |
|------|-------|
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(V%20%2B%20Q%20*%20(V%20%2B%20E))%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(V%20%2B%20Q%20*%20(V%20%2B%20E))%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(V + Q * (V + E))" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(V%20%2B%20E)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(V%20%2B%20E)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(V + E)" /> |

</details>

<details>
<summary>📄 Problem Statement</summary>

You are given an array of variable pairs `equations` and an array of real numbers `values`, where `equations[i] = [A_i, B_i]` and `values[i]` represent the equation `A_i / B_i = values[i]`. Each `A_i` or `B_i` is a string that represents a single variable.

You are also given some `queries`, where `queries[j] = [C_j, D_j]` represents the `j^th` query where you must find the answer for `C_j / D_j = ?`.

Return *the answers to all queries*. If a single answer cannot be determined, return `-1.0`.

**Note:** The input is always valid. You may assume that evaluating the queries will not result in division by zero and that there is no contradiction.

**Note: **The variables that do not occur in the list of equations are undefined, so the answer cannot be determined for them.

 Example 1:**

```text

**Input:** equations = [["a","b"],["b","c"]], values = [2.0,3.0], queries = [["a","c"],["b","a"],["a","e"],["a","a"],["x","x"]]
**Output:** [6.00000,0.50000,-1.00000,1.00000,-1.00000]
**Explanation:**
Given: *a / b = 2.0*, *b / c = 3.0*
queries are: *a / c = ?*, *b / a = ?*, *a / e = ?*, *a / a = ?*, *x / x = ? *
return: [6.0, 0.5, -1.0, 1.0, -1.0 ]
note: x is undefined => -1.0
```

 Example 2:**

```text

**Input:** equations = [["a","b"],["b","c"],["bc","cd"]], values = [1.5,2.5,5.0], queries = [["a","c"],["c","b"],["bc","cd"],["cd","bc"]]
**Output:** [3.75000,0.40000,5.00000,0.20000]

```

 Example 3:**

```text

**Input:** equations = [["a","b"]], values = [0.5], queries = [["a","b"],["b","a"],["a","c"],["x","y"]]
**Output:** [0.50000,2.00000,-1.00000,-1.00000]

```

**Constraints:**

- `1 <= equations.length <= 20`

- `equations[i].length == 2`

- `1 <= A_i.length, B_i.length <= 5`

- `values.length == equations.length`

- `0.0 < values[i] <= 20.0`

- `1 <= queries.length <= 20`

- `queries[i].length == 2`

- `1 <= C_j.length, D_j.length <= 5`

- `A_i, B_i, C_j, D_j` consist of lower case English letters and digits.

</details>

## 💡 Solution

```java
class Solution {
    class Neighbour{
        String v;
        double w;
        Neighbour(String v, double w){
            this.v = v;
            this.w = w;
        }
    }
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Neighbour>> adj = new HashMap<>();

        for(int i = 0; i < values.length; i++){
            List<String> edge = equations.get(i);
            List<Neighbour> nbrs = adj.getOrDefault(edge.get(0), new ArrayList<>());
            nbrs.add(new Neighbour(edge.get(1), values[i]));
            adj.put(edge.get(0), nbrs);
            nbrs = adj.getOrDefault(edge.get(1), new ArrayList<>());
            nbrs.add(new Neighbour(edge.get(0), 1 / values[i]));
            adj.put(edge.get(1), nbrs);
        }

        double[] ans = new double[queries.size()];

        for(int i = 0; i < queries.size(); i++){
            List<String> curr = queries.get(i);
            if(adj.containsKey(curr.get(0)) && adj.containsKey(curr.get(1))){
                ans[i] = solve(curr.get(0), 1.0, new HashSet<>(), curr.get(1), adj);
            }
            else{
                ans[i] = -1.0;
            }
        }
        return ans;
    }
    public double solve(String node, double ans, Set<String> vis, String target, Map<String, List<Neighbour>> adj){
        if(vis.contains(node)) return -1.0;
        if(node.equals(target)) return ans;
        vis.add(node);
        for(Neighbour nbr: adj.getOrDefault(node, new ArrayList<>())){
            double val = solve(nbr.v, ans * nbr.w, vis, target, adj);
            if(val != -1.0){
                return val;
            }
        }
        return -1.0;
    }
}
```

---

<div align="center">
<sub>Synced by <strong>LitCode</strong> on July 14, 2026</sub>
</div>
