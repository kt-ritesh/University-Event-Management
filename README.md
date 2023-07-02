<center>
<h1> 🏚️University Event Management</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center><br>
This project is a University Event Management built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The StudentModel Class And EventModel Class  is defined inside the model packages with validation anotation, which has the following attributes:
   
   inside StudentModel Class:-
   
   studentId : Student ID <br>
   title : Job title <br>
   firstName : Student First Name <br>
   lastName : Student Last Name <br>
   age : Student Age <br>
   department : Student Department <br>
   
   
   inside EventModel Class:- <br>
   
   eventId : Event Id <br>
   eventName : Event Name <br>
   locationOfEvent : Event Location <br>
   date : Event Date <br>
   startTime : Event Start Time <br>
   endTime : Event End Time <br>


---

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>
<b> Add Student </b>

* PostMapping: /addStudent

This endpoint makes a call to method in StudentService class which is connected to database. In database we add a new Student given through API.


* GetMapping: 

This endpoint returns data of specific Student based on id through API.


* PutMapping: 

This endpoint makes a call to method in StudentService class which is connected to database. In database we update Student.


* DeleteMapping: 

This endpoint makes a call to method in StudentService class which is connected to database. In database we delete Student through API.


---
<b> Add Event </b>

* PostMapping: 

This endpoint makes a call to method in EventService class which is connected to database. In database we add a new Event given through API.


* GetMapping: 

This endpoint returns Event.


* PutMapping: 

This endpoint makes a call to method in EventService class which is connected to database. In database we update Event.


* DeleteMapping: 

This endpoint makes a call to method in EventService class which is connected to database. In database we delete Event through API.


---

## CrudRepository extends by IJobRepository interface.


We have used CrudRepository to some CURD Operations.

---

## 📝Project Summary

I have created university events management project.  In this the user can add the student & Event.  Can delete, update.  can find.
