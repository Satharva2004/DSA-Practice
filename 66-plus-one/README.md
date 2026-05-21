# Plus One

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-informational)

## Problem

You are given a large integer represented as an integer array digits , where each digits[i] is the i th digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0 &#39;s. Increment the large integer by one and return the resulting array of digits . Example 1: Input: digits = [1,2,3] Output: [1,2,4] Explanation: The array represents the integer 123. Incrementing by one gives 123 + 1 = 124. Thus, the result should be [1,2,4]. Example 2: Input: digits = [4,3,2,1] Output: [4,3,2,2] Explanation: The array represents the integer 4321. Incrementing by one gives 4321 + 1 = 4322. Thus, the result should be [4,3,2,2]. Example 3: Input: digits = [9] Output: [1,0] Explanation: The array represents the integer 9. Incrementing by one gives 9 + 1 = 10. Thus, the result should be [1,0]. Constraints: 1 <= digits.length <= 100 0 <= digits[i] <= 9 digits does not contain any leading 0 &#39;s.

## Complexity

| Metric | Complexity | Notes |
| --- | --- | --- |
| Time | `Review needed` | Groq analysis unavailable. Add Groq credentials to generate this automatically. |
| Space | `Review needed` | Groq analysis unavailable. Add Groq credentials to generate this automatically. |

## Performance

- Runtime: 1 ms
- Memory: 43.6 MB

## Submitted Code

```java
class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> result = new ArrayList<>();
        int carry = 1;
        for(int i = digits.length-1; i >= 0; i--){
            int sum = digits[i] + carry;
            result.add(sum % 10);
            carry = sum / 10;
        }
        if(carry != 0){
            result.add(carry);
        }
        Collections.reverse(result);

        int[] res = new int[result.size()];

        for (int i = 0; i < result.size(); i++) {
            res[i] = result.get(i);
        }
        return res;
    }
}
```
