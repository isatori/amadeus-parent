# README

This is a cheapest hotel search Spring Boot application that uses MVC and REST api.  It connects to Amadeus API (Sandbox) for hotel listings given IATA Airport codes and Check-in & Check-out dates. 

## Amadeus API

It connects to the following URL and documentation can be found https://sandbox.amadeus.com/travel-innovation-sandbox/apis/get/hotels/search-airport
~~~~https://api.sandbox.amadeus.com/v1.2/hotels/search-airport~~~~

## Data Models

* Address
* Airport
* Amount
* Contact
* HotelPropertyResponse
* HotelReservation - used as request object
* HotelSearchResponse - used to understand response object

## Architecture

Its a combination of Spring + Angular. There are 2 modules, amadeus (server side that does REST connection to Amadeus and exposes REST service) and the amadeus-webapp (frontend side that uses Angular framework)

## Setup 

Repository:
~~~~
git clone https://github.com/isatori/amadeus-parent.git
~~~~

Requirements:
1. Maven
2. Node.js
3. Npm

Running the tests:
~~~~
mvn clean install <-- this will also run npm install and build
mvn test
~~~~


NOTE: An effort has been made to merge both backend and frontend at runtime for production, but for the most part, this is an architectural decision which will be different from team to teams. So maven producing a single WAR or JAR file for deployment will be left out.

Running it (server):
~~~~
cd amadeus
mvn spring-boot:run
~~~~

Running the web (frontend):
1. Open another Terminal
~~~~
cd amadeus-webapp
ng serve	<-- or if you have http-server, use port 4200 then point to amadeus-webapp/dist
~~~~

Go to your web-browser:
~~~~
http://localhost:4200
~~~~
