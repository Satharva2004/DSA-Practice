<h2><a href="https://leetcode.com/problems/evaluate-reverse-polish-notation">Evaluate Reverse Polish Notation</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><div align="center">

# Evaluate Reverse Polish Notation

[![Difficulty](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/evaluate-reverse-polish-notation)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/7%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-36.40%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/45.3%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-62.38%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Evaluate Reverse Polish Notation](https://leetcode.com/problems/evaluate-reverse-polish-notation) | Medium | Java | 7 ms | 45.3 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **7 ms** | Beats **36.40%** |
| Memory | **45.3 MB** | Beats **62.38%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |
| **`O(n)`**<br>single loop through tokens array<br><sub>Confidence: High</sub> | **`O(n)`**<br>stack size can grow up to tokens length in worst case<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given an array of strings `tokens` that represents an arithmetic expression in a Reverse Polish Notation .

 Evaluate the expression. Return *an integer that represents the value of the expression*.

 **Note** that:

- The valid operators are `'+'`, `'-'`, `'*'`, and `'/'`.

- Each operand may be an integer or another expression.

- The division between two integers always **truncates toward zero**.

- There will not be any division by zero.

- The input represents a valid arithmetic expression in a reverse polish notation.

- The answer and all the intermediate calculations can be represented in a **32-bit** integer.

 Example 1:**

```text

**Input:** tokens = ["2","1","+","3","*"]
**Output:** 9
**Explanation:** ((2 + 1) * 3) = 9

```

 Example 2:**

```text

**Input:** tokens = ["4","13","5","/","+"]
**Output:** 6
**Explanation:** (4 + (13 / 5)) = 6

```

 Example 3:**

```text

**Input:** tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
**Output:** 22
**Explanation:** ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22

```

 **Constraints:**

- `1 4 `

- `tokens[i]` is either an operator: `"+"`, `"-"`, `"*"`, or `"/"`, or an integer in the range `[-200, 200]`.

</details>

## Code

```java
class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String curr = tokens[i];
            if(curr.equals("+")){
                if(!stack.isEmpty()){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1+num2);
                }
            }else if(curr.equals("*")){
                if(!stack.isEmpty()){
                    int num1 = stack.pop();
                    int num2 = stack.pop();
                    stack.push(num1*num2);
                }
            }else if(curr.equals("/")){
                if(!stack.isEmpty()){
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(num1/num2);
                }
            }else if(curr.equals("-")){
                if(!stack.isEmpty()){
                    int num2 = stack.pop();
                    int num1 = stack.pop();
                    stack.push(num1-num2);
                }
            }else {
                int num = Integer.parseInt(curr);
                stack.push(num);
            }
        }
        return stack.peek();
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
