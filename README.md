# spring-security-demo-app
A demo application, using spring security module to illustrate authenticate and authorize for certain endpoints.
Refer '**master**' brach for complete code.

**Objective of this application:**

In this Spring Boot application, we just created following 3 endpoints:
1).  /
2). /user
3). /admin

In backend, we created one table named as 'user_master' inside MySQL database 'microservicelearning'.

Now objective is that anyone can access home page i.e. localhost:8080/

But only user, mapped to role 'ROLE_USER' in database 'user_master' table can access endpoint 'localhost:8080/user'.

Also admin user, mapped to role 'ROLE_ADMIN' in database can access both 'localhost:8080/user' and 'localhost:8080/admin'.

**Table Schema:**
id	int(11)
password	varchar(100)
roles	varchar(50)
active	tinyint(1)
user_name	varchar(255)

**Important Points To Note:**
1). As per the constriant of Spring security, role must always have prefix "ROLE_".
