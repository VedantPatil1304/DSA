-- # Write your MySQL query statement below

-- time limit exceeds
-- SELECT v.customer_id as customer_id , Count(*) as count_no_trans 
-- from Visits as v Left Join Transactions as t 
-- On v.visit_id=t.visit_id
-- Where t.transaction_id IS NULL 
-- Group By customer_id
-- Order By count_no_trans;

SELECT customer_id, COUNT(*) AS count_no_trans
FROM Visits
WHERE visit_id NOT IN (
    SELECT DISTINCT visit_id FROM Transactions
)
GROUP BY customer_id
ORDER BY count_no_trans;
