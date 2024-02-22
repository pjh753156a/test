CREATE DATABASE Company_Homework;
use Company_Homework;

-- 회사 (company) 데이터베이스

# 엔터티 및 속성:

#부서 (department)
-- 부서코드 (department_code): 
-- 유일한 식별자로 3자리의 문자열로 구성된다.
-- 부서명 (department_name): 
-- 부서의 이름으로 20자 이하의 문자열로 구성되며 
-- 필수로 입력되어야 한다.
-- 위치 (office_location): 
-- 부서 사무실의 위치로 150자 이하의 문자열로 구성되며 
-- 필수로 입력되어야 한다.
-- 부서장 사원번호 (head_employee_number): 
-- 부서장의 사원번호

#사원 (employee)
-- 사원번호 (employee_number): 유일한 식별자로 8자리의 숫자로 
-- 이루어진 문자열로 구성된다.
-- 이름 (name): 사원의 이름으로 20자 이하의 문자열로 
-- 구성되며 필수로 입력되어야 한다.
-- 주소 (address): 사원의 주소로 150자 이하의 문자열로 
-- 구성되며 필수로 입력되어야 한다.
-- 이메일 (email): 사원의 이메일 주소로 100자 이하의 문자열로 
-- 구성되며 고유한 값을 가지며 필수로 입력되어야 한다.
-- 직급 ID (position_id): 사원의 직급 ID로 필수로 
-- 입력되어야 한다.
-- 부서 ID (department_id): 사원이 속한 부서의 ID로 
-- 필수로 입력되어야 한다.
-- 상사 사원번호 (spervisor_id): 직속 상관의 사원번호

# 직급 (postion)
-- 직급 ID (position_id): 유일한 식별자로 5자리의 문자열로 
-- 구성된다.
-- 직급명 (title): 직급의 명칭으로 20자 이하의 문자열로 
-- 구성되며 고유한 값을 가지며 필수로 입력되어야 한다.
-- 역할 (rolo): 직급에 부여된 역할 설명으로 
-- 장문의 문자열로 구성된다.


#관계:
-- 부서와 사원: 한 부서에는 여러 사원이 속할 수 있으며 
-- 사원은 반드시 부서에 속해야 한다.
-- 부서와 사원: 한 부서에는 한 사원이 부서장으로 존재해야 한다.
-- 사원과 사원: 사원은 다른 사원을 직속 상관으로 가질 수 있다.
-- 직급과 사원: 한 직급은 여러 사원에게 할당될 수 있으며 
-- 사원은 반드시 하나의 직급을 가져야 한다.
-- 부서와 직급: 하나의 부서는 여러 직급을 가질 수 있으며 
-- 하나의 직급은 여러 부서에 포함될 수 있으며 
-- 부서와 직급의 조합에 따라 정수 형태의 필수로 
-- 입력되는 연봉(annual_income)이 결정된다.


-- 부서 테이블 생성
CREATE TABLE Department 
(
    department_code VARCHAR(3) PRIMARY KEY,
    department_name VARCHAR(20) NOT NULL,
    office_location VARCHAR(150) NOT NULL,
    head_employee_number VARCHAR(8) NOT NULL
   
);

ALTER TABLE Department
ADD CONSTRAINT fk_head_employee 
FOREIGN KEY (head_employee_number) 
REFERENCES Employee(employee_number);

-- 직급 테이블 생성 (테이블 이름을 Position에서 PositionTable로 변경)
CREATE TABLE PositionTable 
(
    position_id VARCHAR(5) PRIMARY KEY,
    title VARCHAR(20) UNIQUE NOT NULL,
    role TEXT
);

-- 사원 테이블 생성
CREATE TABLE Employee 
(
    employee_number VARCHAR(8) PRIMARY KEY,
    name VARCHAR(20) NOT NULL,
    address VARCHAR(150) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    position_id VARCHAR(5) NOT NULL,
    department_code VARCHAR(3) NOT NULL,
    supervisor_id VARCHAR(8)
);

ALTER TABLE Employee
ADD CONSTRAINT fk_position 
FOREIGN KEY (position_id) 
REFERENCES PositionTable(position_id),
ADD CONSTRAINT fk_department 
FOREIGN KEY (department_code) 
REFERENCES Department(department_code),
ADD CONSTRAINT fk_supervisor 
FOREIGN KEY (supervisor_id) 
REFERENCES Employee(employee_number);







