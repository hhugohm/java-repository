CREATE SCHEMA rh;

CREATE TABLE rh.employees (
  id_employee INT NOT NULL,
  name VARCHAR(45) NULL,
  last_name VARCHAR(45) NULL);
  
ALTER TABLE rh.employees 
CHANGE COLUMN id_employee id_employee INT(11) NOT NULL AUTO_INCREMENT ,
ADD PRIMARY KEY (id_employee);
