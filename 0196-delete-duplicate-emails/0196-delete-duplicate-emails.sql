# Write your MySQL query statement below
delete p from Person p
join Person p2
where p.id>p2.id and p.email=p2.email;