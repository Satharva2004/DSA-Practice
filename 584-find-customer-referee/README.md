<h2><a href="https://leetcode.com/problems/find-customer-referee">Find Customer Referee</a></h2> <img src='https://img.shields.io/badge/Difficulty-Easy-brightgreen' alt='Difficulty: Easy' /><hr><div align="center">

# Find Customer Referee

[![Difficulty](https://img.shields.io/badge/Easy-2ea44f?style=flat-square)](https://leetcode.com/problems/find-customer-referee)
![Language](https://img.shields.io/badge/MySQL-111111?style=flat-square)
![Runtime](https://img.shields.io/badge/483%20ms-ff5a1f?style=flat-square)
![Runtime Beats](https://img.shields.io/badge/beats-64.26%25-22c55e?style=flat-square)
![Memory](https://img.shields.io/badge/0B-2563eb?style=flat-square)
![Memory Beats](https://img.shields.io/badge/beats-100.00%25-22c55e?style=flat-square)

</div>

## Quick View

| Problem | Difficulty | Language | Runtime | Memory |
| --- | --- | --- | --- | --- |
| [Find Customer Referee](https://leetcode.com/problems/find-customer-referee) | Easy | MySQL | 483 ms | 0B |

## Performance

| Metric | Your result | Standing |
| --- | --- | --- |
| Runtime | **483 ms** | Beats **64.26%** |
| Memory | **0B** | Beats **100.00%** |

## Complexity

<sub>Estimated from submitted code patterns. Each graph is normalized on its own x/y plane; lower and flatter is better.</sub>

| Time | Space |
| --- | --- |
| <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Time%20O(n)%22%2C%22data%22%3A%5B3%2C6%2C13%2C25%2C50%2C100%5D%2C%22borderColor%22%3A%22%23ff6b35%22%2C%22backgroundColor%22%3A%22rgba(255%2C107%2C53%2C0.12)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Time%3A%20O(n)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Time complexity graph for O(n)" /> | <img src="https://quickchart.io/chart?width=310&height=190&backgroundColor=white&c=%7B%22type%22%3A%22line%22%2C%22data%22%3A%7B%22labels%22%3A%5B1%2C2%2C4%2C8%2C16%2C32%5D%2C%22datasets%22%3A%5B%7B%22label%22%3A%22Space%20O(1)%22%2C%22data%22%3A%5B100%2C100%2C100%2C100%2C100%2C100%5D%2C%22borderColor%22%3A%22%232563eb%22%2C%22backgroundColor%22%3A%22rgba(37%2C99%2C235%2C0.1)%22%2C%22borderWidth%22%3A3%2C%22pointRadius%22%3A3%2C%22tension%22%3A0.35%2C%22fill%22%3Atrue%7D%5D%7D%2C%22options%22%3A%7B%22title%22%3A%7B%22display%22%3Atrue%2C%22text%22%3A%22Space%3A%20O(1)%22%2C%22fontSize%22%3A14%2C%22fontColor%22%3A%22%23111827%22%7D%2C%22legend%22%3A%7B%22display%22%3Atrue%2C%22position%22%3A%22bottom%22%2C%22labels%22%3A%7B%22boxWidth%22%3A10%2C%22fontSize%22%3A10%7D%7D%2C%22scales%22%3A%7B%22xAxes%22%3A%5B%7B%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22input%20size%20n%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%2C%22yAxes%22%3A%5B%7B%22ticks%22%3A%7B%22min%22%3A0%2C%22max%22%3A100%2C%22stepSize%22%3A25%7D%2C%22scaleLabel%22%3A%7B%22display%22%3Atrue%2C%22labelString%22%3A%22relative%20cost%22%7D%2C%22gridLines%22%3A%7B%22color%22%3A%22rgba(17%2C24%2C39%2C0.08)%22%7D%7D%5D%7D%7D%7D" width="310" alt="Space complexity graph for O(1)" /> |
| **`O(n)`**<br>linear scan of the Customer table<br><sub>Confidence: High</sub> | **`O(1)`**<br>constant space used for query execution<br><sub>Confidence: High</sub> |

<details>
<summary>Problem statement</summary>

## Problem Statement

Table: `Customer`

```text

+-------------+---------+
| Column Name | Type |
+-------------+---------+
| id | int |
| name | varchar |
| referee_id | int |
+-------------+---------+
In SQL, id is the primary key column for this table.
Each row of this table indicates the id of a customer, their name, and the id of the customer who referred them.

```

 Find the names of the customer that are either:

- **referred by** any customer with `id != 2`.

- **not referred by** any customer.

 Return the result table in **any order**.

 The result format is in the following example.

 Example 1:**

```text

**Input:**
Customer table:
+----+------+------------+
| id | name | referee_id |
+----+------+------------+
| 1 | Will | null |
| 2 | Jane | null |
| 3 | Alex | 2 |
| 4 | Bill | null |
| 5 | Zack | 1 |
| 6 | Mark | 2 |
+----+------+------------+
**Output:**
+------+
| name |
+------+
| Will |
| Jane |
| Bill |
| Zack |
+------+

```

</details>

## Code

```mysql
# Write your MySQL query statement below
SELECT name 
FROM Customer 
WHERE referee_id != 2 OR ISNULL(referee_id);
```

---

<div align="center">
<sub>Generated by <strong>LitCode</strong></sub>
</div>
