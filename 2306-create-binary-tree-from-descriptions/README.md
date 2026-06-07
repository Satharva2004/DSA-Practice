<h2><a href="https://leetcode.com/problems/create-binary-tree-from-descriptions">Create Binary Tree From Descriptions</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><div align="center">

# Create Binary Tree From Descriptions

[![Difficulty](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/create-binary-tree-from-descriptions)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/56%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-93.97%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/79.1%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-92.10%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Create Binary Tree From Descriptions](https://leetcode.com/problems/create-binary-tree-from-descriptions) | Medium | Java | 56 ms | 79.1 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **56 ms** | Beats **93.97%** |
| Memory | **79.1 MB** | Beats **92.10%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |
| **`O(n)`**<br>two sequential loops iterating over the descriptions array<br><sub>Confidence: High</sub> | **`O(n)`**<br>HashSet and HashMap storing nodes, where n is the number of nodes in the descriptions<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given a 2D integer array `descriptions` where `descriptions[i] = [parent i , child i , isLeft i ]` indicates that `parent i ` is the **parent** of `child i ` in a **binary** tree of **unique** values. Furthermore,

- If `isLeft i == 1`, then `child i ` is the left child of `parent i `.

- If `isLeft i == 0`, then `child i ` is the right child of `parent i `.

 Construct the binary tree described by `descriptions` and return *its **root***.

 The test cases will be generated such that the binary tree is **valid**.

 Example 1:**

```text

**Input:** descriptions = [[20,15,1],[20,17,0],[50,20,1],[50,80,0],[80,19,1]]
**Output:** [50,20,80,15,17,19]
**Explanation:** The root node is the node with value 50 since it has no parent.
The resulting binary tree is shown in the diagram.

```

 Example 2:**

```text

**Input:** descriptions = [[1,2,1],[2,3,0],[3,4,1]]
**Output:** [1,2,null,null,3,4]
**Explanation:** The root node is the node with value 1 since it has no parent.
The resulting binary tree is shown in the diagram.

```

 **Constraints:**

- `1 4 `

- `descriptions[i].length == 3`

- `1 i , child i 5 `

- `0 i

</details>

## Code

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
    Set<Integer> children = new HashSet<>();
    Map<Integer, TreeNode> map = new HashMap<>();

    for (int[] node : descriptions) {
        int parent = node[0];
        int child = node[1];
        int isLeft = node[2];

        children.add(child);

        TreeNode parentNode = map.computeIfAbsent(parent, TreeNode::new);
        TreeNode childNode = map.computeIfAbsent(child, TreeNode::new);

        if (isLeft == 1) {
            parentNode.left = childNode;
        } else {
            parentNode.right = childNode;
        }
    }

    for (int[] node : descriptions) {
        int parent = node[0];
        if (!children.contains(parent)) {
            return map.get(parent);
        }
    }

    return null;
}
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
