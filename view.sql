USE mysql;

CREATE TABLE deptpartment (
    deptNo VARCHAR(20) PRIMARY KEY,
    Dname VARCHAR(20),
    location VARCHAR(20)
);
desc deptpartment;
create table employee3(empid varchar(20),empname varchar(25),empsal varchar(20),empage varchar(20),empdept varchar(20),empcity varchar(20),mobileno varchar(30));
desc employee3;
ALTER TABLE employee3
ADD deptNo VARCHAR(20);
desc employee;
INSERT INTO deptpartment (deptNo, Dname, location)
VALUES 
    ('D002', 'Finance', 'London'),
    ('D003', 'IT', 'San Francisco'),
    ('D004', 'Marketing', 'Tokyo');
SELECT * FROM deptpartment;
INSERT INTO employee3 (empId, empName, empsal ,empage ,empdept ,empcity,mobileno) 
VALUES (1, 'John Doe', '200000','18','IT','pune','9881342274'),
(2,'shrinath rajput','500000','20','HR','Mumbai','9404974098'),
(3,'virat kohli','10000000','30','SR','Dubai','7385023373');
UPDATE employee3
SET deptNo = 'D004'
WHERE empId = 3;
SELECT * FROM employee3;

SELECT 
    employee2.empId,
    employee2.empName,
    employee2.empSal,
    employee2.deptNo,
    deptpartment.Dname
FROM 
    employee2
INNER JOIN 
   deptpartment
ON
    employee2.deptNo = deptpartment.deptNo;    
SELECT 
    employee2.empId,
    employee2.empName,
    employee2.empSal,
    employee2.deptNo,
    deptpartment.Dname
FROM 
    employee2
LEFT OUTER JOIN 
    deptpartment
ON 
    employee2.deptNo = deptpartment.deptNo;
    SELECT 
    employee2.empId,
    employee2.empName,
    employee2.empSal,
    employee2.deptNo,
    deptpartment.Dname
FROM 
    employee2
RIGHT OUTER JOIN 
    deptpartment
ON 
    employee2.deptNo =  deptpartment.deptNo;
SELECT 
    employee2.empName,
    employee2.empSal,
    deptpartment.Dname
FROM 
    employee2
INNER JOIN 
   deptpartment
ON 
    employee2.deptNo = deptpartment.deptNo
WHERE 
    deptpartment.Dname = 'Finance';
    
    SELECT 
    employee2.empName,
    employee2.empSal,
   deptpartment.Dname,
    employee2.deptNo
FROM 
    employee2
INNER JOIN 
   deptpartment
ON 
    employee2.deptNo = deptpartment.deptNo
WHERE 
    employee2.empsal = '500000';
    select * from employee2;
    SELECT 
    employee2.empName,
    employee2.empSal,
    deptpartment.Dname
FROM 
    employee2
INNER JOIN 
 deptpartment
ON 
    employee2.deptNo =  deptpartment.deptNo
ORDER BY 
    employee2.empSal DESC;
    SELECT 
    employee2.*
FROM 
    employee2
INNER JOIN 
 deptpartment
ON 
    employee2.deptNo =  deptpartment.deptNo
WHERE 
    deptpartment.Dname = 'it'
    AND employee2.empid = '2';
    SELECT 
    employee2.empName ,
    employee2.deptNo,
    deptpartment.Dname
FROM 
    employee2
INNER JOIN 
  deptpartment
ON 
    employee2.deptNo = deptpartment.deptNo
WHERE 
    employee2.empName LIKE 'S%';

SELECT *
FROM employee2
WHERE empSal = (SELECT MIN(empSal) FROM employee2);

SELECT *
FROM employee2
WHERE empsal = (SELECT MAX(empsal) FROM employee2);

SELECT *
FROM employee2
WHERE empsal = 'Developer'
  AND empsal = (SELECT MAX(empsal) FROM employee2 WHERE empsal = 'Developer');
  
  SELECT MAX(employee2.empSal) AS highest_salary
FROM employee2
INNER JOIN deptpartment
ON employee2.deptNo =deptpartment.deptNo
WHERE deptpartment.Dname = 'IT';

SELECT MAX(empSal) AS maximum_salary
FROM employee2
WHERE deptNo = (SELECT deptNo FROM deptpartment WHERE Dname = 'IT');

SELECT *
FROM employee2
WHERE empSal = (SELECT MIN(empSal) FROM employee2 WHERE deptNo = (SELECT deptNo FROM deptpartment WHERE Dname = 'IT'));

SELECT 
    employee2.*, 
   deptpartment.*
FROM 
    employee2
INNER JOIN 
  deptpartment
ON 
    employee2.deptNo = deptpartment.deptNo;
    SELECT 
    employee2.empId, 
    employee2.empName, 
    employee2.empsal, 
    employee2.deptNo, 
    deptpartment.Dname
FROM 
    employee2
RIGHT OUTER JOIN 
  deptpartment
ON 
    employee2.deptNo = deptpartment.deptNo;
    
    SELECT 
    employee3.* 
FROM 
    employee3
INNER JOIN deptpartment ON employee3.deptNo = deptpartment.deptNo 
WHERE 
    deptpartment.Dname = 'HR' AND employee3.empcity = 'Mumbai';
    
    SELECT  
    employee3.* 
FROM  
    employee3
INNER JOIN  
   deptpartment ON employee3.deptNo = deptpartment.deptNo 
WHERE  
    deptpartment.Dname = 'HR' AND employee3.empcity = 'Mumbai';
    
    SELECT 
    employee3.empName, 
    employee3.deptNo, 
    deptpartment.Dname 
FROM 
    employee3
INNER JOIN   deptpartment ON employee3.deptNo = deptpartment.deptNo 
WHERE 
    employee3.empName LIKE 'S%';
    
    SELECT * 
FROM employee3 
WHERE empsal = 'empsal' 
  AND empage = (SELECT MAX(empage) FROM employee3 WHERE empsal = '500000');
  select * from employee3;
  
  
  SELECT * 
FROM employee3 
WHERE empSal = (SELECT MIN(empSal) 
    FROM employee3 
    WHERE deptNo = (SELECT deptNo 
        FROM deptpartment 
        WHERE Dname = 'IT')
);
SELECT * FROM deptpartment;
ALTER TABLE employee3
ADD mobileno VARCHAR(20);
select * from employee3;
INSERT INTO employee3 (empId, empName, empsal ,empage ,empdept ,empcity,mobileno) 
VALUES (1, 'John Doe', '200000','18','IT','pune','9881342274'),
(2,'shrinath rajput','500000','20','HR','Mumbai','9404974098'),
(3,'virat kohli','10000000','30','SR','Dubai','7385023373');

ALTER TABLE employee3
ADD experience VARCHAR(20);
ALTER TABLE employee3
ADD DOB VARCHAR(20);