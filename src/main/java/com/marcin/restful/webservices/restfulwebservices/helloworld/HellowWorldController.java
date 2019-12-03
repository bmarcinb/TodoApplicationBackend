package com.marcin.restful.webservices.restfulwebservices.helloworld;


//Controller

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class HellowWorldController {



    //GET

    //URI - /hello-world



    //method - "Hello World"
    //There's also GetMapping so you don't have to use RequestMethod.GET
    //PostMapping is for Posting requests
    @RequestMapping(method = RequestMethod.GET, path="/hello-world")
    public String helloWorld(){
        return "Hello World";
    }

    //hello-world-bean
    @RequestMapping(method = RequestMethod.GET, path="/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
       // throw new RuntimeException("Some Error has Happened! Contact suppoat!");
        return new HelloWorldBean("Hello World - Changed");
    }

    @RequestMapping(method = RequestMethod.GET, path="/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldPath(@PathVariable String name){
        return new HelloWorldBean(String.format("Hello World, %s",name));
    }

}
