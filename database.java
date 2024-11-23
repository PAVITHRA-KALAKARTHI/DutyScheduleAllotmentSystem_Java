CREATE DATABASE IF NOT EXISTS DutyScheduleDB;
USE DutyScheduleDB;

CREATE TABLE IF NOT EXISTS EmployeeSchedules (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employee_name VARCHAR(255) NOT NULL,
    schedule VARCHAR(255) NOT NULL
);









