CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    priority TINYINT NOT NULL DEFAULT 3,
    description TEXT,
    PRIMARY KEY (task_id)
);

INSERT INTO 
	tasks(title, priority, start_date)
VALUES("TASK1", DEFAULT, CURRENT_DATE() ); -- YYYY-MM-DD

CREATE TABLE projects(
	project_id INT AUTO_INCREMENT, 
	name VARCHAR(100) NOT NULL,
	start_date DATE,
	end_date DATE,
	PRIMARY KEY(project_id)
);


INSERT INTO 
	projects(name, start_date, end_date)
VALUES
	('AI for Marketing','2019-08-01','2023-02-31'),
	('ML for Sales','2019-05-15','2023-01-20');

SHOW VARIABLES LIKE 'max_allowed_packet';

SET GLOBAL max_allowed_packet=size;

create table devices(
	id int auto_increment primary key,
    name varchar(100)
);

insert into devices(name)
values ('Rourter f1'),('switch 1'), ('switch 3');

insert into devices(id, name)
values(4, 'printer')
on duplicate key update name = 'My printer';

create table subscribers(
	id int auto_increment primary key,
    email varchar(100) not null unique
);

insert into subscribers(email)
values('venkat.bvs@gmail.com');

insert into subscribers(email)
values('venkat.bvs@gmail.com'), ('venkat.bvs@gmail.com');

insert ignore into subscribers(email)
values('venkat.bvs@gmail.com'), ('venkat.bvs@gmail.com');

-- UPDATE 

select firstname, lastname, email from employees where employeeNumber = 1056;

UPDATE employees 
SET email = "mary@gmail.com"
where employeeNumber = 1056;

-- update multiple values
UPDATE employees 
SET 
    email = "mary@gmail.com",
    lastName = "Paterson"
where employeeNumber = 1056;


-- update and replace values
UPDATE employees 
SET 
    email = REPLACE(email,'@classicmodelcars.com', '@wileyedge.com')
where 
    jobTitle = 'Sales Rep' AND 
    officeCode = 0;

create table suppliers (
	supplierNumber int auto_increment,
    supplierName varchar(50) not null,
    phone varchar(50),
    addressLine1 varchar(50),
    addressLine2 varchar(50),
    city varchar(50),
    state varchar(50),
    postalcode varchar(50),
    country varchar(50),
    customerNumber int,
    primary key(supplierNumber)
);

SELECT 
    customerNumber,
    customerName,
    phone,
    addressLine1,
    addressLine2,
    city,
    state,
    postalCode,
    country
FROM
    customers
WHERE
    country = 'USA' AND 
    state = 'CA';

UPDATE employees
SET email = REPLACE(email,"mail@gmail.com","@wiley.com")
WHERE 
    jobTitle = 'Sales Rep' AND 
    officeCode = 0;
    
-- MySQL UPDATE JOIN 

CREATE DATABASE IF NOT EXISTS empdb;

USE empdb;

-- create tables
CREATE TABLE merits (
    performance INT(11) NOT NULL,
    percentage FLOAT NOT NULL,
    PRIMARY KEY (performance)
);

CREATE TABLE employees (
    emp_id INT(11) NOT NULL AUTO_INCREMENT,
    emp_name VARCHAR(255) NOT NULL,
    performance INT(11) DEFAULT NULL,
    salary FLOAT DEFAULT NULL,
    PRIMARY KEY (emp_id),
    CONSTRAINT fk_performance FOREIGN KEY (performance)
        REFERENCES merits (performance)
);
-- insert data for merits table
INSERT INTO merits(performance,percentage)
VALUES(1,0),
      (2,0.01),
      (3,0.03),
      (4,0.05),
      (5,0.08);
    
insert into employees(emp_name, performance, salary)
values('vankat', 1, 500000),
	  ('rishav' , 3, 650000),
      ('steve', 4, 769999),
      ('swati', 8, 73463);
    
update employees
inner join merits on employees.per = merits.performance
set salary = salary + salary * percentage;

-- MySQL DELETE JOIN with INNER JOIN
DROP TABLE IF EXISTS t1, t2;

CREATE TABLE t1 (
    id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE t2 (
    id VARCHAR(20) PRIMARY KEY,
    ref INT NOT NULL
);

INSERT INTO t1 VALUES (1),(2),(3);

INSERT INTO t2(id,ref) VALUES('A',1),('B',2),('C',3);

CREATE TABLE buildings (
    building_no INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE rooms (
    room_no INT PRIMARY KEY AUTO_INCREMENT,
    room_name VARCHAR(255) NOT NULL,
    building_no INT NOT NULL,
    FOREIGN KEY (building_no)
        REFERENCES buildings (building_no)
        ON DELETE CASCADE
);

INSERT INTO buildings(building_name,address)
VALUES('ACME Headquaters','3950 North 1st Street CA 95134'),
      ('ACME Sales','5000 North 1st Street CA 95134');

INSERT INTO rooms(room_name,building_no)
VALUES('Amazon',1),
      ('War Room',1),
      ('Office of CEO',1),
      ('Marketing',2),
      ('Showroom',2);

CREATE TABLE cities (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    population INT NOT NULL
);


INSERT INTO cities(name,population)
VALUES('New York',8008278),
	  ('Los Angeles',3694825),
	  ('San Diego',1223405);
