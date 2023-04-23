# Sakila Soap API
**Sakila** [its structure](https://dev.mysql.com/doc/sakila/en/sakila-structure.html)-->
  is a sample database created by MySQL that is used for testing, demonstrating, and experimenting with the features and functionality of MySQL's relational database management system.
The Sakila database is a nicely normalised schema modelling a DVD rental store featuring things like films, actors, film-actor relationships and a central inventory table that connects films, stores and rentals

**SOAP(Simple Object Access Protocol)** is a messaging protocol used for exchanging structured information between web services. Developers can use SOAP to create, update, retrieve or delete records. SOAP API has over 20 different calls that allow you to maintain passwords, perform searches and complete other tasks. It can also use any language that supports web services, meaning that web developers who use a range of languages can work with this API. The SOAP API provides a WSDL file that describes the available operations and data types. The API uses SOAP over HTTP as the transport protocol and XML as the data format. Sakila SOAP API is an interface that allows users to interact with the Sakila database through SOAP requests. It provides a standardized way of accessing and manipulating data within the database.


# Technologies used
* JAX-WS (Metro)
* Maven
* Tomcat
* Jakarta persistance (Hibernate)
* MySql
* Intellij IDEA
* Postman
* SOAP-UI

# Endpoints

| Service          | Endpoint          |
| ---------------- |:-----------------:|
| ActorService     | /sakila/actor     |
| AddressService   | /sakila/address   |
| CategoryService  | /sakila/category  |
| CityService      | /sakila/city      |
| CountryService   | /sakila/country   |
| CustomerService  | /sakila/customer  |
| FilmService      | /sakila/film      |
| InventoryService | /sakila/inventory |
| LanguageService  | /sakila/language  |
| PaymentService   | /sakila/payment   |
| RentalService    | /sakila/rental    |
| StaffService     | /sakila/staff     |
| StoreService     | /sakila/store     |
  
  
  
# Run with Maven
  Clone the project --> git clone https://github.com/SoadEhab/SakilaSoapAPI.git
  
  Go to the project directory --> cd SakilaSoapAPI
  
* Create db user and set the username and password values in the persistence.xml
* Create db named sakila in your MySql Server and it is available from [here](https://dev.mysql.com/doc/index-other.html)
* Run your tomcat apache server and then change the configuration of tomcat in pom.xml
* Deploy the application using the following maven command -->
    mvn clean install tomcat7:deploy
