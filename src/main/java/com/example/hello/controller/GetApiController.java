package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    //http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name="name") String pathName) {
        System.out.println("PathVariable:" + pathName);
        return pathName;

    }
    @GetMapping(path="query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam) {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry-> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+"="+entry.getValue()+"\n");
        });
        return sb.toString();
    }
}
