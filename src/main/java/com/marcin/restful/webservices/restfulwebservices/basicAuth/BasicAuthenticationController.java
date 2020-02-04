package com.marcin.restful.webservices.restfulwebservices.basicAuth;


//Controller

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    //hello-world-bean
    @RequestMapping(method = RequestMethod.GET, path="/basicauth")
    public AuthenticationBean helloWorldBean(){
       // throw new RuntimeException("Some Error has Happened! Contact suppoat!");
        return new AuthenticationBean("Hello World - Changed");
    }



}
