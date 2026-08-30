# Problem lnk:  https://leetcode.com/problems/queries-quality-and-percentage/?envType=study-plan-v2&envId=top-sql-50

# Write your MySQL query statement below
select q.query_name,
round(avg(q.rating/q.position),2) as quality,
round(avg(q.rating<3)*100, 2) as poor_query_percentage
from Queries q
group by query_name;