select status
from orders
group by status;

select status, sum(quantityOrdered * priceEach) as amount
from orders
inner join orderdetails using (orderNumber)
order by status;

-- total sales of each year
select year(orderDate), sum(quantityOrdered * priceEach) as amount
from orders
inner join orderdetails using (orderNumber)
where status = 'shipped'
group by year(orderDate)
order by status;

select year(orderDate) as year, sum(quantityOrdered * priceEach) as amount
from orders
inner join orderdetails using (orderNumber)
where status = 'shipped'
group by year
having year > 2003
order by status;

-- number of orders per year
select year(orderDate) as year, count(*) as TotalOrders
from orders
group by year;

select year(orderDate) as year, count(*) as TotalOrders
from orders
where status = 'shipped'
group by year
order by status desc;

select year(orderDate) as year, count(*) as TotalOrders
from orders
where status = 'shipped'
group by year
order by status desc;

SELECT
    orderNumber,
    SUM(quantityOrdered) AS itemsCount,
    SUM(priceEach * quantityOrdered) AS total
FROM
    orderDetails
GROUP BY
    orderNumber;

select a.orderNumber, status, sum(priceEach * quantityOrdered) as total
from orderDetails a
inner join orders b on b.orderNumber = a.orderNumber
group by orderNumber, status
having status = 'shipped' and total > 1500;

-- create table sales
create table sales
select productline, year(orderDate) orderYear, sum(priceEach * quantityOrdered) as orderValue
from orderDetails
inner join orders Using(orderNumber)
inner join products using(productCode)
group by productline, orderYear;

select productline, sum(orderValue) totalOrderValue
from sales
group by productline;

select productline, sum(ordervalue) totalOrderValue
from sales
group by productline
UNION ALL
select null, sum(ordervalue) totalOrderValue
from sales;

select productline, sum(ordervalue) totalOrderValue
from sales
group by productline with rollup;

select orderYear, productline, sum(ordervalue) totalOrderValue
from sales
group by orderYear, productline with rollup;

select 
	if(Grouping(orderYear), 'All Years', orderYear) oderYear,
	if(grouping(productline), 'All product line', productline) productline,
    sum(orderValue) totalOrderValue
from sales
group by orderYear, productline with rollup;