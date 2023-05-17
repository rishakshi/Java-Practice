-- where
SELECT lastName, firstName, jobTitle
FROM employees
WHERE jobTitle = "Sales Rep";

select lastName, firstName, jobTitle, officeCode
from employees
where jobTitle = "Sales Rep" AND officeCode = 1
order by officeCode, jobTitle;

SELECT lastName, firstName, jobTitle, officeCode
FROM employees
WHERE jobTitle = "Sales Rep" AND officeCode = 1
ORDER BY officeCode, jobTitle;

-- BETWEEN
SELECT lastName, firstName, jobTitle, officeCode
FROM employees
WHERE officeCode BETWEEN 1 AND 3
ORDER BY officeCode; 

 -- LIKE
SELECT lastName, firstName
FROM employees
WHERE lastName LIKE "%son"
ORDER BY firstName;

-- in
SELECT  firstName,  lastName,  officeCode
FROM employees
WHERE officeCode IN (1 , 2, 3)
ORDER BY  officeCode;

-- IS NULL
select firstName, lastName, reportsTo
from employees
where reportsTo is null;

-- IS NOT NULL
select firstName, lastName, reportsTo
from employees
where reportsTo is not null;

-- <>
select firstName, lastName, reportsTo
from employees
where jobTitle <> 'Sales Rep';

-- >
select firstName, lastName, reportsTo
from employees
where officeCode > 5;

-- <=
select firstName, lastName, reportsTo
from employees
where officeCode <= 4;

-- distinct
select distinct state, city
from customers
where state is not null
order by state, city;

select customerName, country
from customers
where country = 'USA' AND state = 'CA' AND creditLimit > 1000000;