<h2><a href="https://leetcode.com/problems/process-string-with-special-operations-i">Process String with Special Operations I</a></h2> <img src='https://img.shields.io/badge/Difficulty-Medium-orange' alt='Difficulty: Medium' /><hr><div align="center">

# Process String with Special Operations I

[![Difficulty](https://img.shields.io/badge/Medium-f59e0b?style=flat-square)](https://leetcode.com/problems/process-string-with-special-operations-i)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/4%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-76.30%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/55%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-82.22%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Process String with Special Operations I](https://leetcode.com/problems/process-string-with-special-operations-i) | Medium | Java | 4 ms | 55 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **4 ms** | Beats **76.30%** |
| Memory | **55 MB** | Beats **82.22%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%5E2)%22%2C%22data%22%3A%5B1%2C1%2C2%2C6%2C25%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%5E2)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n^2)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |
| **`O(n^2)`**<br>nested string operation in the loop when character '#' is encountered<br><sub>Confidence: Medium</sub> | **`O(n)`**<br>string builder used to build the output string<br><sub>Confidence: Medium</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given a string `s` consisting of lowercase English letters and the special characters: `*`, `#`, and `%`.

 Build a new string `result` by processing `s` according to the following rules from left to right:

- If the letter is a **lowercase** English letter append it to `result`.

- A `'*'` **removes** the last character from `result`, if it exists.

- A `'#'` **duplicates** the current `result` and **appends** it to itself.

- A `'%'` **reverses** the current `result`.

 Return the final string `result` after processing all characters in `s`.

 Example 1:**

 **Input:** s = "a#b%*"

 **Output:** "ba"

 **Explanation:**

 `i`
 `s[i]`
 Operation
 Current `result`

 0
 `'a'`
 Append `'a'`
 `"a"`

 1
 `'#'`
 Duplicate `result`
 `"aa"`

 2
 `'b'`
 Append `'b'`
 `"aab"`

 3
 `'%'`
 Reverse `result`
 `"baa"`

 4
 `'*'`
 Remove the last character
 `"ba"`

 Thus, the final `result` is `"ba"`.

 Example 2:**

 **Input:** s = "z*#"

 **Output:** ""

 **Explanation:**

 `i`
 `s[i]`
 Operation
 Current `result`

 0
 `'z'`
 Append `'z'`
 `"z"`

 1
 `'*'`
 Remove the last character
 `""`

 2
 `'#'`
 Duplicate the string
 `""`

 Thus, the final `result` is `""`.

 **Constraints:**

- `1

</details>

## Code

```java
class Solution {
    public String processStr(String s) {
        StringBuilder sb  = new StringBuilder();
        for(int i = 0 ; i < s.length(); i++){
            char curr = s.charAt(i);
            if(Character.isLowerCase(curr) && Character.isLetter(curr)){
                sb.append(curr);
            }else if(curr == '#'){
                sb.append(sb);
            }else if(curr == '%'){
                sb.reverse();
            }else if(curr == '*'){
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            }
        }
        return sb.toString();
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
