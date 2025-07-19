# Write your MySQL query statement below
SElECT u.name , Sum(t.amount) as balance 
FROM Users AS u 
JOIN Transactions as t
ON u.account=t.account
GROUP BY u.account,u.name
Having balance>10000;
