<h2><a href="https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i">Earliest Finish Time for Land and Water Rides I</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><div align="center">

# Earliest Finish Time for Land and Water Rides I

<sub>A clean accepted solution with the key tradeoffs surfaced up front.</sub>

[![Difficulty](https://img.shields.io/badge/Easy-2ea44f?style=flat-square)](https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i)
![Language](https://img.shields.io/badge/Java-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/1%20ms-ff5a1f?style=flat-square)
![Memory](https://img.shields.io/badge/47.1%20MB-2563eb?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Earliest Finish Time for Land and Water Rides I](https://leetcode.com/problems/earliest-finish-time-for-land-and-water-rides-i) | Easy | Java | 1 ms | 47.1 MB |

## Approach

| View | Notes |
| --- | --- |
| **Code uses** | Direct simulation |
| **Better pattern** | Problem-specific optimal pattern |
| **Current** | The submitted solution follows a direct accepted path for the problem constraints. |
| **Should use instead** | Confirm whether the same result can be reached with fewer passes or less auxiliary state. |

## Complexity

<sub>Free complexity insight. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n%5E2)%22%2C%22data%22%3A%5B1%2C1%2C2%2C6%2C25%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n%5E2)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n^2)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |
| **`O(n^2)`**<br>The submitted code contains multiple loops, so review nesting to confirm the exact bound. | **`O(1)`**<br>Only a constant amount of extra state is apparent from the submitted code. |

## Checks

- Smallest valid input
- Boundary values
- Inputs that trigger carry or empty-result behavior

<details>
<summary>Problem statement</summary>

## Problem Statement

You are given two categories of theme park attractions: land rides** and water rides**.

 Land rides**

 landStartTime[i]` &ndash; the earliest time the `i th ` land ride can be boarded.
 landDuration[i]` &ndash; how long the `i th ` land ride lasts.

- Water rides**

- waterStartTime[j]` &ndash; the earliest time the `j th ` water ride can be boarded.

- waterDuration[j]` &ndash; how long the `j th ` water ride lasts.

 A tourist must experience exactly one** ride from each** category, in either order**.

 A ride may be started at its opening time or any later moment**.
 If a ride is started at time t`, it finishes at time t + duration`.
 Immediately after finishing one ride the tourist may board the other (if it is already open) or wait until it opens.

 Return the earliest possible time** at which the tourist can finish both rides.

 Example 1:**

 **Input:** landStartTime = [2,8], landDuration = [4,1], waterStartTime = [6], waterDuration = [3]

 **Output:** 9

 **Explanation:**​​​​​​​

 Plan A (land ride 0 &rarr; water ride 0):

 Start land ride 0 at time landStartTime[0] = 2`. Finish at 2 + landDuration[0] = 6`.
 Water ride 0 opens at time waterStartTime[0] = 6`. Start immediately at 6`, finish at 6 + waterDuration[0] = 9`.

 Plan B (water ride 0 &rarr; land ride 1):

 Start water ride 0 at time waterStartTime[0] = 6`. Finish at 6 + waterDuration[0] = 9`.
 Land ride 1 opens at landStartTime[1] = 8`. Start at time 9`, finish at 9 + landDuration[1] = 10`.

 Plan C (land ride 1 &rarr; water ride 0):

 Start land ride 1 at time landStartTime[1] = 8`. Finish at 8 + landDuration[1] = 9`.
 Water ride 0 opened at waterStartTime[0] = 6`. Start at time 9`, finish at 9 + waterDuration[0] = 12`.

 Plan D (water ride 0 &rarr; land ride 0):

 Start water ride 0 at time waterStartTime[0] = 6`. Finish at 6 + waterDuration[0] = 9`.
 Land ride 0 opened at landStartTime[0] = 2`. Start at time 9`, finish at 9 + landDuration[0] = 13`.

 Plan A gives the earliest finish time of 9.

 Example 2:**

 **Input:** landStartTime = [5], landDuration = [3], waterStartTime = [1], waterDuration = [10]

 **Output:** 14

 **Explanation:**​​​​​​​

 Plan A (water ride 0 &rarr; land ride 0):

 Start water ride 0 at time waterStartTime[0] = 1`. Finish at 1 + waterDuration[0] = 11`.
 Land ride 0 opened at landStartTime[0] = 5`. Start immediately at 11` and finish at 11 + landDuration[0] = 14`.

 Plan B (land ride 0 &rarr; water ride 0):

 Start land ride 0 at time landStartTime[0] = 5`. Finish at 5 + landDuration[0] = 8`.
 Water ride 0 opened at waterStartTime[0] = 1`. Start immediately at 8` and finish at 8 + waterDuration[0] = 18`.

 Plan A provides the earliest finish time of 14.**​​​​​​​**

 **Constraints:**

 1 landStartTime.length == landDuration.length == n`
 waterStartTime.length == waterDuration.length == m`
 1

</details>

## Code

```java
class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int land = Integer.MAX_VALUE;
        int water = Integer.MAX_VALUE;
        int land_water = Integer.MAX_VALUE;
        int water_land = Integer.MAX_VALUE;
        int n = landStartTime.length;
        int m = waterStartTime.length;
        for(int i = 0; i < n; i++){
            land = Math.min(land, landStartTime[i] + landDuration[i]);
        }
        for(int j = 0; j < m; j++){
            water = Math.min(water,waterStartTime[j] + waterDuration[j]);
            land_water = Math.min(land_water, Math.max(land, waterStartTime[j])+waterDuration[j]);
        }
        for(int c = 0; c < n; c++){
            water_land = Math.min(
                water_land,
                Math.max(water, landStartTime[c]) + landDuration[c]
            );
        }
        return Math.min(land_water, water_land);
    }
}
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
