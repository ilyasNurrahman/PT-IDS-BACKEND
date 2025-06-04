"# PT-IDS-BACKEND" 

SQL Database - Mysql - Look at application.properties

CREATE DATABASE testdb;

USE testdb;

CREATE TABLE transactions (
  id INT PRIMARY KEY,
  productID VARCHAR(20),
  productName VARCHAR(100),
  amount VARCHAR(20),
  customerName VARCHAR(100),
  status INT,
  transactionDate DATETIME,
  createBy VARCHAR(100),
  createOn DATETIME
);

CREATE TABLE status (
  id INT PRIMARY KEY,
  name VARCHAR(50)
);

-- Insert status data
INSERT INTO status VALUES (0, 'SUCCESS'), (1, 'FAILED');

-- Insert contoh data ke transactions (copy dari JSON contoh)
INSERT INTO transactions VALUES
(1372, '10001', 'Test 1', '1000', 'abc', 0, '2022-07-10 11:14:52', 'abc', '2022-07-10 11:14:52'),
(1373, '10002', 'Test 2', '2000', 'abc', 0, '2022-07-11 13:14:52', 'abc', '2022-07-10 13:14:52');


Running Backend :
mvnw spring-boot:run

Testing API  :
GET http://localhost:8080/api/viewData

