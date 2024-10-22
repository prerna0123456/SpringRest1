**SpringActuator**
Purpose is to understand Spring Actuator by exposing all endpoints provided by 'Spring Actuator' dependency.
Spring Boot provides an actuator dependency that can be used to monitor and manage your Spring Boot application.

**SpringRestHateoas**
Purpose is to understand use of HATEOAS.
The key idea behind HATEOAS is that the client should be able to discover and interact with the API dynamically, without prior knowledge of the specific URLs or endpoints.
With HATEOAS, the system becomes loosely coupled as the URLs do not require hard-coding. Instead, the URLs are generated on the fly on the server-side and supplied to the client through the JSON responses.

**SpringRestXMLJSON**
Purpose is to send response in XML as well. In Postman, add key as 'Accept' in Headers & Value as 'application/xml' to get response in xml format.

**StudentRegistrationAOP**
Purpose is to understand concept of AOP(separation of concerns). Created a separate class & defined as @Aspect and added @Before, @After & @AfterThrowing 'Advice'. 

**TicketBookingAppGlobalExceptionHandling**
Another program made using concept of AOP where 'exception handler' code is separated from service class.
