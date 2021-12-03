INSERT INTO DEPARTMENT VALUES('D100','CommsMedia','Communication and Media',9893430033,null,'A','testuser',sysdate);
INSERT INTO DEPARTMENT VALUES('D101','Banking','Banking Domain',9893430034,null,'A','testuser',sysdate);
INSERT INTO DEPARTMENT VALUES('D102','Healthcare','Healthcare Domain',9893430035,null,'A','testuser',sysdate);
INSERT INTO DEPARTMENT VALUES('D103','Insurance','Insurance Domain',9893430036,null,'A','testuser',sysdate);
INSERT INTO DEPARTMENT VALUES('D104','Automobile','Automobile Domain',9893430037,null,'A','testuser',sysdate);
INSERT INTO DEPARTMENT VALUES('D105','Technology','Technology Domain',9893430038,null,'A','testuser',sysdate);

INSERT INTO PROJECT VALUES(1,'P1000','Project 1','Order Management Systems',9893430033,null,sysdate,sysdate+50,'A','D100','testuser',sysdate);
INSERT INTO PROJECT VALUES(2,'P1001','Project 2','Order Management Systems',9893430032,null,sysdate,sysdate+50,'A','D100','testuser',sysdate);
INSERT INTO PROJECT VALUES(3,'P1002','Project 3','Order Management Systems',9893430032,null,sysdate,sysdate+50,'A','D100','testuser',sysdate);
INSERT INTO PROJECT VALUES(4,'P1003','Project 1','Banking Management',9893430032,null,sysdate,sysdate+50,'A','D101','testuser',sysdate);
INSERT INTO PROJECT VALUES(5,'P1004','Project 2','Banking Management',9893430032,null,sysdate,sysdate+50,'A','D101','testuser',sysdate);
INSERT INTO PROJECT VALUES(6,'P1005','Project 3','Banking Management',9893430032,null,sysdate,sysdate+50,'A','D101','testuser',sysdate);
INSERT INTO PROJECT VALUES(7,'P1006','Project 1','Insurance Management',9893430032,null,sysdate,sysdate+50,'A','D103','testuser',sysdate);
INSERT INTO PROJECT VALUES(8,'P1007','Project 2','Insurance Management',9893430032,null,sysdate,sysdate+50,'A','D103','testuser',sysdate);
INSERT INTO PROJECT VALUES(9,'P1008','Project 3','Insurance Management',9893430032,null,sysdate,sysdate+50,'A','D103','testuser',sysdate);
INSERT INTO PROJECT VALUES(10,'P1007','Project 4','Financial Project',9893430032,null,sysdate,sysdate+50,'A','D100','testuser',sysdate);
INSERT INTO PROJECT VALUES(11,'P1007','Project 5','Financial Project',9893430032,null,sysdate,sysdate+50,'A','D101','testuser',sysdate);
INSERT INTO PROJECT VALUES(12,'P1007','Project 6','Financial Project',9893430032,null,sysdate,sysdate+50,'A','D103','testuser',sysdate);

INSERT INTO EMPLOYEE VALUES('E1000','Employee 1','Developer',98934300,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1001','Employee 2','Developer',98934301,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1002','Employee 3','Developer',98934302,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1003','Employee 4','Sr. Developer',98934303,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1004','Employee 5','Sr. Developer',98934304,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1005','Employee 6','Sr. Developer',98934305,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1006','Employee 7','Manager',98934306,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1007','Employee 8','Manager',98934307,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1008','Employee 9','Manager',98934308,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E1009','Employee 7','Manager',98934309,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10010','Employee 8','Sr. Developer',989343010,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10011','Employee 10','Sr. Developer',98934311,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10012','Employee 11','Sr. Developer',98934312,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10013','Employee 12','Sr. Developer',98934313,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10014','Employee 13','Sr. Developer',98934314,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10015','Employee 14','Manager',98934315,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10016','Employee 15','Manager',98934316,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10017','Employee 16','Developer',98934317,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10018','Employee 17','Developer',98934318,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10019','Employee 18','Developer',98934319,sysdate,sysdate+50,'A','testuser',sysdate);
INSERT INTO EMPLOYEE VALUES('E10020','Employee 19','Developer',98934320,sysdate,sysdate+50,'A','testuser',sysdate);

INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1000',1,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1001',1,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1002',1,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1003',3,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1004',3,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1005',3,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1006',4,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1007',4,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E1008',4,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10011',8,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10012',8,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10013',8,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10014',10,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10015',10,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10016',10,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10017',11,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10018',11,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10019',9,sysdate,sysdate+50,'A');
INSERT INTO EMP_PROJ_ASSOCIATE VALUES('E10020',9,sysdate,sysdate+50,'A');

COMMIT;