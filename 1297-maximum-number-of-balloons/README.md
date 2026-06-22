<h2><a href="https://leetcode.com/problems/maximum-number-of-balloons">Maximum Number of Balloons</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><div align="center">

# Maximum Number of Balloons

[![Difficulty](https://img.shields.io/badge/Easy-2ea44f?style=flat-square)](https://leetcode.com/problems/maximum-number-of-balloons)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/14%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-6.87%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/44.3%20MB-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-14.36%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Maximum Number of Balloons](https://leetcode.com/problems/maximum-number-of-balloons) | Easy | Java | 14 ms | 44.3 MB |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **14 ms** | Beats **6.87%** |
| Memory | **44.3 MB** | Beats **14.36%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%20%2B%20m)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%20%2B%20m)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n + m)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(m)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(m)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(m)" /> |
| **`O(n + m)`**<br>where n is the length of the text and m is the length of the string 'balloon'<br><sub>Confidence: High</sub> | **`O(m)`**<br>for storing the frequency of characters in the 'balloon' string<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

Given a string `text`, you want to use the characters of `text` to form as many instances of the word **"balloon"** as possible.

 You can use each character in `text` **at most once**. Return the maximum number of instances that can be formed.

 Example 1:**

 ** **

```text

**Input:** text = "nlaebolko"
**Output:** 1

```

 Example 2:**

 ** **

```text

**Input:** text = "loonbalxballpoon"
**Output:** 2

```

 Example 3:**

```text

**Input:** text = "leetcode"
**Output:** 0

```

 **Constraints:**

- `1 4 `

- `text` consists of lower case English letters only.

 **Note:** This question is the same as 2287: Rearrange Characters to Make Target String.

</details>

## Code

```java
class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < text.length(); i++){
            map.put(text.charAt(i), map.getOrDefault(text.charAt(i), 0)+1);
        }
        
        String n = "balloon";int minBalloons = Integer.MAX_VALUE;
        for(int i = 0; i < n.length(); i++){
            if(!map.containsKey(n.charAt(i))){
                return 0;
            }
        }
        for(int i = 0; i < n.length(); i++){
            int count = map.get(n.charAt(i));
            if (n.charAt(i) == 'l' || n.charAt(i) == 'o') {
                minBalloons = Math.min(minBalloons, count / 2);
            } else {
                minBalloons = Math.min(minBalloons, count);
            }
        }
        return minBalloons;
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
