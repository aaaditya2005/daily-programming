# Link - https://leetcode.com/problems/monthly-transactions-i/?envType=study-plan-v2&envId=top-sql-50
select 
CONCAT(YEAR(t.trans_date), '-', LPAD(MONTH(t.trans_date), 2, '0')) AS month,
t.country as country,
count(t.amount) as trans_count,
sum(case when t.state = 'approved' then 1 else 0 end) AS approved_count,
sum(t.amount) as trans_total_amount,
sum(case when t.state = 'approved' then t.amount else 0 end) as approved_total_amount
from Transactions t
group by CONCAT(YEAR(t.trans_date), '-', LPAD(MONTH(t.trans_date), 2, '0')) ,country;
