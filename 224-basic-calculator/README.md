<h2><a href="https://leetcode.com/problems/basic-calculator">Basic Calculator</a></h2> <img src='https://img.shields.io/badge/Difficulty-Hard-red' alt='Difficulty: Hard' /><hr><div align="center">

# Basic Calculator

[![Difficulty](https://img.shields.io/badge/Hard-ef4444?style=flat-square)](https://leetcode.com/problems/basic-calculator)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/6%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-95.92%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/46.3%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-72.67%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Basic Calculator](https://leetcode.com/problems/basic-calculator) | Hard | Java | 6 ms | 46.3 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **6 ms** | Beats **95.92%** |
| Memory | **46.3 MB** | Beats **72.67%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |
| **`O(n)`**<br>single pass through the input string<br><sub>Confidence: Medium</sub> | **`O(n)`**<br>maximum recursion depth equals the number of nested parentheses<br><sub>Confidence: Medium</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

Given a string `s` representing a valid expression, implement a basic calculator to evaluate it, and return *the result of the evaluation*.

 **Note:** You are **not** allowed to use any built-in function which evaluates strings as mathematical expressions, such as `eval()`.

 Example 1:**

```text

**Input:** s = "1 + 1"
**Output:** 2

```

 Example 2:**

```text

**Input:** s = " 2-1 + 2 "
**Output:** 3

```

 Example 3:**

```text

**Input:** s = "(1+(4+5+2)-3)+(6+8)"
**Output:** 23

```

 **Constraints:**

- `1 5 `

- `s` consists of digits, `'+'`, `'-'`, `'('`, `')'`, and `' '`.

- `s` represents a valid expression.

- `'+'` is **not** used as a unary operation (i.e., `"+1"` and `"+(2 + 3)"` is invalid).

- `'-'` could be used as a unary operation (i.e., `"-1"` and `"-(2 + 3)"` is valid).

- There will be no two consecutive operators in the input.

- Every number and running calculation will fit in a signed 32-bit integer.

</details>

## Code

```java
class Solution {
    int i = 0;
    char[] arr;

    public int calculate(String s) {
        arr = s.toCharArray();
        i = 0;
        return (int) dfs();
    }

    public long dfs() {
        long sum = 0;
        int op = 1;

        while (i < arr.length) {
            char curr = arr[i];

            if (curr == ' ') {
            } else if (curr == '+') {
                op = 1;
            } else if (curr == '-') {
                op = -1;
            } else if (curr == ')') {
                break;
            } else if (curr == '(') {
                i++;
                sum += op * dfs();
            } else if (Character.isDigit(curr)) {
                long num = 0;
                while (i < arr.length && Character.isDigit(arr[i])) {
                    num = num * 10 + (arr[i] - '0');
                    i++;
                }
                i--;
                sum += op * num;
            }

            i++;
        }

        return sum;
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
