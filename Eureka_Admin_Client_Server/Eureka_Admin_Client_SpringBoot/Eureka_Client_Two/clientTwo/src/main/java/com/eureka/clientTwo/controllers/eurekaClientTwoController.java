package com.eureka.clientTwo.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class eurekaClientTwoController {

    @RequestMapping(value="/helloEurekaEndpointClientTwo", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<String> helloEurekaEndpoint() {
        return ResponseEntity.ok().body("This is hello eureka endpoint from client Two");
    }
}