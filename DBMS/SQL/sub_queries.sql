SELECT lastName, firstName FROM employees
WHERE `officeCode` IN (
    SELECT officeCode FROM offices WHERE country="USA"
);

SELECT 
    customerNumber, checkNumber, amount
    FROM payments
    WHERE amount=(SELECT MAX(amount) FROM payments);
SELECT 
    customerNumber, checkNumber, amount
    FROM payments
    WHERE amount > (SELECT AVG(amount) FROM payments);

-- customers with no orders
SELECT 
    customerName
    FROM customers WHERE 
    `customerNumber` NOT IN 
    (SELECT DISTINCT customerNumber FROM orders);

select customerName
from customers
where customerName not in (
	select distinct customerNumber from orders
);

select max(items), min(items), floor(avg(items))
from (
	select orderNumber, count(orderNumber) as items from orderdetails group by orderNumber
) as lineitems;

select productName, buyprice
from products p1
where buyPrice > (
	select avg(buyPrice) from products where productLine = p1.productLine
);

SELECT
    orderNumber,
    SUM(priceEach * quantityOrdered) total
FROM
    orderdetails
    INNER JOIN orders USING (orderNumber)
GROUP BY
    orderNumber
HAVING
    SUM(priceEach * quantityOrdered) > 60000;

select customerName, customerNumber
from customers
where exists(
	select orderNumber, sum(priceEach * quantityOrdered)
    from orderdetails
    inner join orders using(orderNumber)
    where customerName = cutomers.customerNumber
    group by orderNumber
    having sum(priceEach * quantityOrdered) > 60000
);

SELECT
    select_list
FROM
    (
        SELECT
            select_list
        FROM
            table_1
    ) derived_table_name
WHERE
    derived_table_name.c1 > 0;

-- Get the top five products by sales revenue in 2003 from the orders and orderdetails tables
SELECT
    productCode,
    SUM(quantityOrdered * priceEach) sales
FROM
    orderdetails
    INNER JOIN orders USING(orderNumber)
WHERE
    YEAR(shippedDate) = 2003
GROUP BY
    productCode
ORDER BY
    sales DESC
LIMIT
    5;

-- Use the result of this query as a derived table and join it with the products table
SELECT
    productName,
    sales
FROM
    (
        SELECT
            productCode,
            ROUND(SUM(quantityOrdered * priceEach)) sales
        FROM
            orderdetails
            INNER JOIN orders USING(orderNumber)
        WHERE
            YEAR(shippedDate) = 2003
        GROUP BY
            productCode
        ORDER BY
            sales DESC
        LIMIT
            5
    ) top5Product2003
    INNER JOIN products USING(productCode);

-- complex MySQL derived table 
/*
 Classify the customers who bought products in 2003 into 3 groups: platinum, gold, and silver. 
 And we need to know the number of customers in each group with the following conditions:
 
 Platinum customers who have orders with the volume greater than 100K.
 Gold customers who have orders with the volume between 10K and 100K.
 Silver customers who have orders with the volume less than 10K.
 */
SELECT
    customerNumber,
    ROUND(SUM(quantityOrdered * priceEach)) sales,
    (
        CASE
            WHEN SUM(quantityOrdered * priceEach) < 10000 THEN 'Silver'
            WHEN SUM(quantityOrdered * priceEach) BETWEEN 10000
            AND 100000 THEN 'Gold'
            WHEN SUM(quantityOrdered * priceEach) > 100000 THEN 'Platinum'
        END
    ) customerGroup
FROM
    orderdetails
    INNER JOIN orders USING(orderNumber)
WHERE
    YEAR(shippedDate) = 2003
GROUP BY
    customerNumber;

-------------------------------------------------
SELECT
    customerGroup,
    COUNT(cg.customerGroup) AS groupCount
FROM
    ( SELECT
        customerNumber,
        ROUND(SUM(quantityOrdered * priceEach)) sales,
        (
            CASE
                WHEN SUM(quantityOrdered * priceEach) < 10000 THEN 'Silver'
                WHEN SUM(quantityOrdered * priceEach) BETWEEN 10000
                AND 100000 THEN 'Gold'
                WHEN SUM(quantityOrdered * priceEach) > 100000 THEN 'Platinum'
            END
        ) customerGroup
        FROM
            orderdetails
            INNER JOIN orders USING(orderNumber)
        WHERE
            YEAR(shippedDate) = 2003
        GROUP BY
            customerNumber
    ) cg
GROUP BY
    cg.customerGroup;

-- MySQL EXISTS operator
/*
 The EXISTS operator is a Boolean operator that returns either true or false. 
 The EXISTS operator is often used to test for the existence of rows returned by the subquery.
 */
-- Syntax of the EXISTS operator
SELECT
    select_list
FROM
    a_table
WHERE
    [NOT] EXISTS(subquery);

-- Use customers and orders tables 
-- Find the customer who has at least one order using EXISTS operator
-- Find customers who do not have any orders using EXISTS operator
-- Select all employees who work at the office in San Francisco.

-- MySQL UPDATE EXISTS 
-- Update the phone’s extensions of the employees who work at the office in San Francisco.
-- Find employees who work at the office in San Franciso

SELECT 
    employeenumber,
    firstname, 
    lastName,
    extension
FROM
    employees
WHERE EXISTS(
    SELECT 1 FROM offices WHERE city = 'San Francisco' AND
    offices.officeCode = employees.officeCode
);

-------- UPDATE 
UPDATE employees
SET 
    extension = CONCAT(extension, '1')
WHERE EXISTS(
    SELECT 1 FROM offices WHERE city = 'San Francisco' AND
    offices.officeCode = employees.officeCode
);


-- MySQL INSERT EXISTS
-- Archive customers who don’t have any sales order in a separate table. 

CREATE TABLE customers_archive LIKE customers;

INSERT INTO customers_archive 
SELECT * FROM customers 
WHERE NOT EXISTS (
    SELECT 
        1 
    FROM 
        orders 
    WHERE 
        orders.customerNumber = customers.customerNumber
    );
---------------------------------------------------------------------------------------------
-- MySQL DELETE EXISTS 
-- Archiving the customer data is to delete the customers that exist in 
    -- the customers_archive table from the customers table

DELETE FROM customers 
WHERE EXISTS(
    SELECT 1 
    FROM customers_archive a 
    WHERE a.customerNumber = customers.customerNumber
);

------------------------------------------------------------------------------------------------
-- MySQL EXISTS operator vs. IN operator
-- find the customer who has placed at least one order, you can use the IN operator

SELECT 
    customerNumber, 
    customerName
FROM
    customers
WHERE
    customerNumber IN (
        SELECT 
            customerNumber
        FROM
            orders);
            
------------
SELECT 
    customerNumber,
    customerName
FROM
    customers 
WHERE 
EXISTS (
    SELECT 1 FROM orders WHERE orders.customerNumber = customers.customerNumber
);

-- QUERY COST

EXPLAIN SELECT 
    customerNumber,
    customerName
FROM
    customers 
WHERE 
EXISTS (
    SELECT 1 FROM orders WHERE orders.customerNumber = customers.customerNumber
);
