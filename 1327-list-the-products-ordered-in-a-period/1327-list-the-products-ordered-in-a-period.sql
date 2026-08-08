# Write your MySQL query statement below
select product_name, sum(unit) as unit from Products as p
inner join Orders as o
on o.product_id=p.product_id
where order_date like '2020-02-%'
group by o.product_id
having sum(unit)>=100;