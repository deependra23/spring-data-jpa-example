# spring-data-jpa-example
CRUD Operation Example Using Spring DATA JPA

#DEPENDENCIES REQUIREMENT
-spring-boot-starter-web
-mysql-connector-java
-spring-boot-starter-data-jpa
-lombok

#DATABASE DETAIL
server.port=9696
#Data Source Config Properties
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5Dialect
spring.jpa.properties.hibernate.show_sql = true
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/springjpa_db
spring.datasource.username=root
spring.datasource.password=Admin
