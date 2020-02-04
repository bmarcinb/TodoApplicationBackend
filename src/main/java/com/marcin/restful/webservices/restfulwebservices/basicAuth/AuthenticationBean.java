package com.marcin.restful.webservices.restfulwebservices.basicAuth;
import java.util.*;
public class AuthenticationBean {

    private String message;

    public AuthenticationBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message){
        this.message = message;
    }

    public String toString(){
        return String.format("HelloWorldBean [message=%s]",message);
    }

}
