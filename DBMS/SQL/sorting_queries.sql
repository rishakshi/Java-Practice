-- select
--     select_list
-- from
--     table_name
-- order by
--     column1 [asc];

-- from select order by
select
    contactLastname,
    contactFirstname
from
    customers
order by
    contactLastname;

select
    contactLastname,
    contactFirstname
from
    customers
order by
    contactLastname desc;
    
select
    contactLastname,
    contactFirstname
from
    customers
order by
    contactLastname desc,
    contactFirstname ASC;

select
    orderNumber,
    orderlinenumber,
    quantityOrdered * priceEach as subtotal
from
    orderdetails
order by
    subtotal desc;
    
select 
orderNumber,status
from orders
order by field(status,"In process" , "Disputed", "On hold ","cancelled","resolved","shipped");

SELECT
    firstName, lastName, reportsTo
FROM
    employees
ORDER BY reportsTo;

-- if you use the ORDER BY with the DESC option, NULLs will appear last in the result set.
SELECT 
    firstName, lastName, reportsTo
FROM
    employees
ORDER BY reportsTo DESC;