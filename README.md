# spring-boot-transaction example

This is a simple Spring Boot project that demonstrates implementation of transaction using JPA (Java Persistence API) and PostgreSQL Database.

## Prerequisites

Before running this project, make sure you have the following prerequisites:

- Java 11 or higher installed

## Setup

1. Clone the repository:

   ```bash
   git clone git@github.com:niteshsinghrajput/spring-boot-transaction.git

2. Navigate to the project directory:

    ```bash
    cd spring-boot-transaction

3. Build the project

    ```bash
    ./gradlew clean build

4. Run the application

   ```bash
    java -jar .\build\libs\spring-boot-transaction-0.0.1-SNAPSHOT.jar

## Usage
Once the application is running, you can access the API endpoints using a tool like Postman or cURL.

#### The API supports the following endpoints:

* POST `/bookFlight`: Book a flight
    * Sample URL: `http://localhost:8080/bookFlight`
    * Sample Request Payload:
      ```json
        {
            "passengerInfo": {
                "name": "Nitesh Rajput",
                "email": "Rajput.Nitesh012@gmail.com",
                "source": "Bangalore",
                "destination": "Delhi",
                "travelDate": "15-08-2023",
                "pickupTime": "06:05:00 AM",
                "arrivalTime": "08:00:00 AM",
                "fare": 7000.00
            },
            "paymentInfo": {
                 "accountNo": "acc1",
                 "cardType": "Credit Card"
            }
        }
      ```

## Configuration
The application configuration can be found in the application.properties file. You can modify the H2 connection details, such as the host, port, and database name, in this file.
   