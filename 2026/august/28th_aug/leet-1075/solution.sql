# Write your MySQL query state
select p.project_id,  round(avg(e.experience_years), 2) AS average_years
From Project p
left join Employee e
on e.employee_id  = p.employee_id
GROUP BY p.project_id;