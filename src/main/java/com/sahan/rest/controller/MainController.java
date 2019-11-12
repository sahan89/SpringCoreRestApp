package com.sahan.rest.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/mainController")
public class MainController {
    private final String APPLICATION_JSON = "application/json";
    // Handler method to produce text response
    @RequestMapping(value = "/index", method = RequestMethod.GET, produces = {APPLICATION_JSON})
    public String index() {
        return "Spring MVC - REST Controller Hello World example.";
    }
}
