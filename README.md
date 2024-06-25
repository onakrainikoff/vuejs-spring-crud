# vuejs-spring-crud


## Demo
#### Run
```
cd docker
docker-compose up
#open in browser http://localhost:80/ 
```


## Develop
#### DataBase
```
cd database

#run database
docker-compose up -d

#stop database
docker-compose down
```

#### Backend
```
cd backend

#run backend
mvn spring-boot:run

#run tests
mvn clean verify
```

#### Frontend
```
cd frontend

#run frontend
npm run dev
```


## Build
#### Build Docker (Frontend+Backend)
```
cd docker
docker build -t vuejs-spring-crud:latest .
```
#### Build Backend
```
cd backend
mvn clean install -Pdocker
```
#### Build Frontend
```
cd frontend
npm run build-docker
```


## Used Technologies
- Vue 3
- CoreUI
- Spring Boot
- Spring Data Rest
- PostgreSQL


## Links
https://vuejs.org/guide/quick-start
https://docs.spring.io/spring-data/rest/reference/
https://start.spring.io/