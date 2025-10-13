# Write your MySQL query statement below

SELECT max(salary) AS SecondHighestSalary  FROM Employee where salary < 
(SELECT max(salary) FROM Employee);
