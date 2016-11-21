package com.cognizantminds.rws.resources.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldResource {
	
    @RequestMapping("/helloWorld")
    public String helloWorld() {
        return "Hello World!!!";
    }

}
