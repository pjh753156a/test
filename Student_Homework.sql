CREATE DATABASE Student_Homework;
use Student_Homework;

CREATE TABLE Department 
(
    department_id VARCHAR(5) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    office_location VARCHAR(150) NOT NULL,
    contact_number VARCHAR(15) UNIQUE NOT NULL
);

CREATE TABLE Student 
(
    student_number VARCHAR(7) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    year INT NOT NULL CHECK (year BETWEEN 1 AND 4),
    email VARCHAR(50) UNIQUE NOT NULL,
    department_id VARCHAR(5),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

CREATE TABLE Course 
(
    course_code VARCHAR(5) PRIMARY KEY,
    title VARCHAR(40) UNIQUE NOT NULL,
    credits FLOAT NOT NULL
);


CREATE TABLE Professor 
(
    professor_id VARCHAR(7) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    specialization VARCHAR(40) NOT NULL,
    office_location VARCHAR(150) NOT NULL,
    department_id VARCHAR(5),
    FOREIGN KEY (department_id) REFERENCES Department(department_id)
);

CREATE TABLE Professor_Course 
(
    professor_id VARCHAR(7),
    course_code VARCHAR(5),
    FOREIGN KEY (professor_id) REFERENCES Professor(professor_id),
    FOREIGN KEY (course_code) REFERENCES Course(course_code),
    PRIMARY KEY (professor_id, course_code)

);

CREATE TABLE Student_Course 
(
    student_number VARCHAR(7),
    course_code VARCHAR(5),
    grade FLOAT, -- 평점(grade)이 부동 소수점(floating-point) 값이라고 가정
    FOREIGN KEY (student_number) REFERENCES Student(student_number),
    FOREIGN KEY (course_code) REFERENCES Course(course_code),
    PRIMARY KEY (student_number, course_code)
);


