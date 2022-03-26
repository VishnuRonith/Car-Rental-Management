# Springapplication

Car Rental Management
Create a Car Rental Management using Spring Boot for the following Endpoints.



Add a new Car

POST - /saveCar

Request Body: 

{

    "carId":"12212",

    "carModel":"baleno",

    "carNo":"TN 38 CJ 6636",

    "status":"available"

}



Edit a Car Details

POST - /editCar?id=carId

Request Body:

{

    "carModel":"Verna",

    "carNo":"TN 33 DD JJJJ",

    "status":"booked"

}



Delete a Car

GET - /deleteCar?id=carId



Get All Cars

GET - /getCars

  
  
Get Car By ID

GET - /getCar?id=carId


Note:
Store the value in the MySQL
