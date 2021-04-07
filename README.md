
# geolocation RESTful API - Java Spring boot

## Introduction

This is a spring boot  example code for using  RESTful API to get geolocation of 5 districts in bangldesh.

This example is written in Java using spring-boot-starter-data-jpa,h2database,jwt



## Getting started

Follow these steps to get started:

#### Step 1: Configuring Eclipse IDE for Java

You need to download the last version of Eclipse IDE for Java EE Developers, for example [Lunar](https://www.eclipse.org/downloads/packages/eclipse-ide-java-ee-developers/lunasr2) version. Make sure that Eclipse has installed the Maven plugin.


#### Step 2: Import Maven Project into Eclipse

To import an existing Maven project into Eclipse, just right-click the Package Explorer and go to:

`
Import... > Existing Maven Projects > Select root directory > Finish
`

It's possible that you need to update Maven project. To do it, just right-click the project and go to:

`
Maven > Update Project...
`


#### Step 3: Run Java application

Post
## Api Documentation

This include 2 api endpoint.These are:

#### geolocation/requesttoken[POST]
 * **Url**:
```
http://localhost:8095/geolocation/requesttoken
```
 * **Body**:
 ```
 {
    "username":"user1",
    "password":"123456"
}
    
   ```
   * **Response**:
 ```
{
    "jwt": "eyJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1c2VyMSIsImV4cCI6MTYxNzgyNjU4MiwiaWF0IjoxNjE3NzkwNTgyfQ.g1Z8_BxbTmq07vpsPU5ppuLSv8Mmqa2IAf445hI2BFQ"
}
    
   ```

#### geolocation/location[GET]

* **Url**:
```
http://localhost:8095/geolocation/location
```
 * **Body**:{}
 * Add Bearer Token from previous api

