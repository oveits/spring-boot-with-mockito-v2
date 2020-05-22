# spring-boot-with-mockito-v2

We are following https://spring.io/guides/gs/testing-web/

This is an example with:
* ContextLoadsTest: tests that the context loads successfully
* controller
    * ControllerIsFoundTest: tests, that controller is found
    * IntegratedHttpRequestWithServerTest: starts the server and tests the HTTP response to a HTTP request. This is a fully integrated test.
    * ControllerWithMockMvcTest: does not start the server, but directly attaches to the controller via MockMVC. The test calls the GreetingService, and in this sense is an integrated test as well.
    * ControllerWithMockMvcMockitoTest: sames as ControllerWithMockMvcTest. However, instead of calling the GreetingService, a GreetingService Mock bean is called. Therefore, the GreetingService is not tested here.
*  service
    * GreetingServiceTest: tests the GreetingService.
    
## Best Practice
Combine controller tests with MockMVC and Mockito with ServiceTests.
