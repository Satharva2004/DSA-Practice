# Customers Who Never Order

![Difficulty: Easy](https://img.shields.io/badge/Difficulty-Easy-informational)

## Problem

Table: Customers +-------------+---------+ | Column Name | Type | +-------------+---------+ | id | int | | name | varchar | +-------------+---------+ id is the primary key (column with unique values) for this table. Each row of this table indicates the ID and name of a customer. Table: Orders +-------------+------+ | Column Name | Type | +-------------+------+ | id | int | | customerId | int | +-------------+------+ id is the primary key (column with unique values) for this table. customerId is a foreign key (reference columns) of the ID from the Customers table. Each row of this table indicates the ID of an order and the ID of the customer who ordered it. Write a solution to find all customers who never order anything. Return the result table in any order . The result format is in the following example. Example 1: Input: Customers table: +----+-------+ | id | name | +----+-------+ | 1 | Joe | | 2 | Henry | | 3 | Sam | | 4 | Max | +----+-------+ Orders table: +----+------------+ | id | customerId | +----+------------+ | 1 | 3 | | 2 | 1 | +----+------------+ Output: +-----------+ | Customers | +-----------+ | Henry | | Max | +-----------+

## Complexity

- Time Complexity: Grok analysis unavailable. Add xAI credentials to generate this automatically.
- Space Complexity: Grok analysis unavailable. Add xAI credentials to generate this automatically.

## Performance

- Runtime: 569 ms
- Memory: 0B

## Submitted Code

```mysql
# Write your MySQL query statement below
SELECT name AS Customers
FROM Customers
LEFT JOIN Orders ON Customers.id = Orders.customerId
WHERE Orders.customerId IS NULL;
```
