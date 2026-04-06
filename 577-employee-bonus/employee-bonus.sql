-- Write your PostgreSQL query statement below
SELECT N.name, B.bonus
FROM Employee N
LEFT JOIN Bonus B
ON N.empID = B.empID
WHERE B.bonus < 1000
OR b.bonus IS NULL;