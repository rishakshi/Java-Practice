drop database mydatabase;

show databases;

create database WileyEdge;

use WileyEdge;

-- Qyerying the data
-- Sorting the data
-- Filter data
-- Joins
-- Groups Data
-- SubQueries
-- CME common table expression
-- Set operators
-- Modify data
-- MySQL Transaction
-- Manage database
-- ....

/* Create Table*/
create table course_list (
    course_id INT NOT NULL AUTO_INCREMENT,
    course_title VARCHAR(100) NOT NULL,
    course_author VARCHAR(40) NOT NULL,
    creation_date DATE,
    PRIMARY KEY (course_id)
);

/* Drop Table*/
drop table course_list;

/** Insert into table **/

INSERT INTO course_list (course_title, course_author, creation_date) 
    VALUES
    ("Java", "Venkat", NOW()),
    ("Python", "Trupthi", NOW()),
    ("MySQL", "Deepak", NOW());

-- Querying Data
-- Select queries 

SELECT select_list FROM table_name;

SELECT lastName
FROM employees;

SELECT 
    lastName, 
    firstName, 
    jobTitle
FROM
    employees;


SELECT * 
FROM employees;

SELECT 1 + 1;    

SELECT NOW();

SELECT CONCAT('John',' ','Doe');

-- column alias
SELECT expression AS column_alias;
SELECT CONCAT('John',' ','Doe') AS name;
SELECT CONCAT('Jane',' ','Doe') AS 'Full name';