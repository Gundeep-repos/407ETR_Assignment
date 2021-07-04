Assignment: 407ETR Cost/Distance Calculation
Name: Gundeep Singh

Please find the entire J2EE project zipped in folder named 407. For convenient and better representation, I made a basic front also using Java Servlet Pages and the backend is made using Java Servlets.

The project is made using eclipse with default settings and port set at localhost:7070. For the project to build and run successfully, you will need following libraries:
Simple JSON 1.1 and JUNIT 4

The simple-json 1.1 library can be found in the root folder itself and the project is pointed to the library itself.

I have used Apache tomcat v9.0 server for my application

On resolving the above dependencies and loading jar files, run the index.jsp on localhost. 

Running successfully the index.js page should take you to the Application Home Page which consists of a table with the following input fields:
1)	Starting Point
2)	Destination point

To connect the JSP page to Java servlet, I have used Asynchronous JavaScript and XML (AJAX) request. A GET request is sent to Http Servlet (ServiceClass.java) along and the starting destination and End Destination are passed as a query parameter. To have a modular approach, the servlet uses a helper class (HelperClass.java) which consists of the entire logic to calculate the distance and cost of the trip.

On Passing the valid values of Start and Destination points and hitting the “Get Cost” button , you can see the columns: Distance and Cost being populated with appropriate values.

Appropriate validations are setup and are in place to catch errors like:
1)	Null Values
2)	Incorrect Spellings
3)	Unknown Values
4)	Case Insensitive: This is handled automatically and the program runs successfully with case insensitive data

The unit tests for the application can be found in the UnitTest.java class and to run the tests. Simply running the UnitTest class with “Junit test” as the run configurations.

Due to my default eclipse settings, the class path invocation is set to a different folder which prevented me in using relative path to the file “interchanges.json”. The path must be setup properly before running the application.
