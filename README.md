# springboot-routing-write-read-db

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Jonascsoliveira/springboot-routing-write-read-db/blob/main/LICENSE) 

# About
A solution to access a mirrored databases wich includes operations of read and write data. With this you can persist data in a write database and get data form a read-only connection. When use @Tranctional(readOnly = true) annotation on a service that retrieve some info from database, this consult 
will be routed for read only database. When use only @Transactional annotation on a service, it means the operation will be routed for write database.

## Design
![routing-design](https://github.com/Jonascsoliveira/assets/blob/master/routingdb/imagerouting.png)


# Related Technologies
- Java
- Spring Boot
- Maven
- JPA
- SQL

# How to run

Requirements: Java 11

```bash
# clonar repositório
git clone https://github.com/Jonascsoliveira/springboot-routing-write-read-db.git

# entrar na pasta chess-sytem/bin
cd springboot-routing-write-read-db

# executar o comando
./mvnw spring-boot:run
```

# Author

Jonas Carlos Silva Oliveira

https://www.linkedin.com/in/jonascsoliveira/
