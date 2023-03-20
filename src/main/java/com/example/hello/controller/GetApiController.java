package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {
    @GetMapping(path="/hello")
    public String hello() {
        return "get Hello";
    }

    @RequestMapping(path="/hi", method= RequestMethod.GET) //get/post/put/delete -> get http://localhost:9090/api/get/hi
    public String hi() {
        return "hi";

    }
}
