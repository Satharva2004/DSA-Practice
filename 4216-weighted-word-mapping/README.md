<h2><a href="https://leetcode.com/problems/weighted-word-mapping">Weighted Word Mapping</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><div align="center">

# Weighted Word Mapping

[![Difficulty](https://img.shields.io/badge/Easy-2ea44f?style=flat-square)](https://leetcode.com/problems/weighted-word-mapping)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/2%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-96.85%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/46.6%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-33.48%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Weighted Word Mapping](https://leetcode.com/problems/weighted-word-mapping) | Easy | Java | 2 ms | 46.6 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **2 ms** | Beats **96.85%** |
| Memory | **46.6 MB** | Beats **33.48%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n*m)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n*m)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n*m)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(n)" /> |
| **`O(n*m)`**<br>two nested loops over words and characters in each word<br><sub>Confidence: High</sub> | **`O(n)`**<br>space used by the StringBuilder to store the result<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given an array of strings `words`, where each string represents a word containing lowercase English letters.

 You are also given an integer array `weights` of length 26, where `weights[i]` represents the weight of the `i th ` lowercase English letter.

 The **weight** of a word is defined as the **sum** of the weights of its characters.

 For each word, take its weight modulo 26 and map the result to a lowercase English letter using reverse alphabetical order (`0 -> 'z', 1 -> 'y', ..., 25 -> 'a'`).

 Return a string formed by concatenating the mapped characters for all words in order.

 Example 1:**

 **Input:** words = ["abcd","def","xyz"], weights = [5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2]

 **Output:** "rij"

 **Explanation:**

- The weight of `"abcd"` is `5 + 3 + 12 + 14 = 34`. The result modulo 26 is `34 % 26 = 8`, which maps to `'r'`.

- The weight of `"def"` is `14 + 1 + 2 = 17`. The result modulo 26 is `17 % 26 = 17`, which maps to `'i'`.

- The weight of `"xyz"` is `7 + 7 + 2 = 16`. The result modulo 26 is `16 % 26 = 16`, which maps to `'j'`.

 Thus, the string formed by concatenating the mapped characters is `"rij"`.

 Example 2:**

 **Input:** words = ["a","b","c"], weights = [1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1]

 **Output:** "yyy"

 **Explanation:**

 Each word has weight 1. The result modulo 26 is `1 % 26 = 1`, which maps to `'y'`.

 Thus, the string formed by concatenating the mapped characters is `"yyy"`.

 Example 3:**

 **Input:** words = ["abcd"], weights = [7,5,3,4,3,5,4,9,4,2,2,7,10,2,5,10,6,1,2,2,4,1,3,4,4,5]

 **Output:** "g"

 **Explanation:​​​​​​​**

 The weight of `"abcd"` is `7 + 5 + 3 + 4 = 19`. The result modulo 26 is `19 % 26 = 19`, which maps to `'g'`.

 Thus, the string formed by concatenating the mapped characters is `"g"`.

 **Constraints:**

- `1

</details>

## Code

```java
class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        StringBuilder res = new StringBuilder();
        for(int i =0; i < words.length; i++){
            int sum = 0;
            String curr = words[i];
            for(int j = 0; j < curr.length(); j++){
                sum += weights[curr.charAt(j) - 'a'];
            }
            int mod = sum%26;
            char ch = (char)('z' - mod);
            res.append(ch);
        }
        return res.toString();
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
