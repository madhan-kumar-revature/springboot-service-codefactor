package com.example.demo.controllers;

import com.example.demo.models.ResponseModel;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    @Value("${org.server.url}")
    private String serverURL;

    @GetMapping("/hello")
    public ResponseModel sayHello() {
        // Create a response object with a message and status code and return it
        return new ResponseModel("Hello, this is a JSON response with a model class from feat-dev!", 200);
    }

    @GetMapping("/serviceName")
    public ResponseModel getServiceName(){
        return  new ResponseModel(serverURL,200);
    }
}
