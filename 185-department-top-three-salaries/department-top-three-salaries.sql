# Write your MySQL query statement below
SELECT d.name AS Department,
    e.name as Employee,
    e.salary AS Salary
FROM Employee e INNER JOIN Department d
ON e.departmentID = d.id
WHERE 3 > (
    SELECT COUNT(DISTINCT(e1.salary))
    FROM Employee e1
    WHERE e1.salary > e.salary
    AND e.departmentId  = e1.departmentId 
)