CREATE TABLE DEPARTMENT (
DEPT_CODE VARCHAR(1000) NOT NULL,
DEPT_NAME VARCHAR(500) NOT NULL,
DEPT_DESCRIPTION VARCHAR(2000) NOT NULL,
PRIMARY_CONTACT NUMBER,
SECONDARY_CONTACT NUMBER,
STATUS VARCHAR(1) NOT NULL DEFAULT 'A',
CREATED_BY VARCHAR(20),
CREATE_DATE DATETIME,
CONSTRAINT DEPT_CODE_PK PRIMARY KEY (DEPT_CODE)
);

CREATE TABLE PROJECT (
PROJ_ID NUMBER NOT NULL,
PROJ_CODE VARCHAR(1000) NOT NULL,
PROJ_NAME VARCHAR(500) NOT NULL,
PROJ_DESCRIPTION VARCHAR(2000) NOT NULL,
PRIMARY_CONTACT NUMBER,
SECONDARY_CONTACT NUMBER,
START_DATE DATETIME,
END_DATE DATETIME,
STATUS VARCHAR(1) NOT NULL DEFAULT 'A',
DEPT_CODE VARCHAR(1000) NOT NULL,
CREATED_BY VARCHAR(20),
CREATE_DATE DATETIME,
CONSTRAINT PROJ_ID_PK PRIMARY KEY (PROJ_ID),
CONSTRAINT DEPT_CODE_FK FOREIGN KEY(DEPT_CODE) REFERENCES DEPARTMENT(DEPT_CODE)
);

CREATE TABLE EMPLOYEE (
EMP_CODE VARCHAR(1000) NOT NULL,
EMP_NAME VARCHAR(500) NOT NULL,
DESIGNATION VARCHAR(100) NOT NULL,
EMP_CONTACT NUMBER,
START_DATE DATETIME NOT NULL,
END_DATE DATETIME,
STATUS VARCHAR(1) NOT NULL DEFAULT 'A',
CREATED_BY VARCHAR(20),
CREATE_DATE DATETIME,
CONSTRAINT EMPLOYEE_CODE_PK PRIMARY KEY (EMP_CODE)
);

CREATE TABLE EMP_PROJ_MAPPING(
EMP_CODE VARCHAR(1000) NOT NULL,
PROJ_ID NUMBER NOT NULL,
PROJ_START_DATE DATETIME NOT NULL,
PROJ_END_DATE DATETIME NOT NULL,
STATUS VARCHAR(1) NOT NULL DEFAULT 'A',
CONSTRAINT EMP_CODE_FK FOREIGN KEY(EMP_CODE) REFERENCES EMPLOYEE(EMP_CODE),
CONSTRAINT EMP_PROJ_ID_FK FOREIGN KEY(PROJ_ID) REFERENCES PROJECT(PROJ_ID)
);