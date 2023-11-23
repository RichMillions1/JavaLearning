package com.skillup.api;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/name")
    public String getName(){
        return "Hello, here is String";
    }

    @GetMapping("/plus/{a}")
    public Integer plus(@PathVariable("a") Integer number){
        return number + 1;
    }

    @PostMapping("/user")
    public Person createUser(@RequestBody Person person){
        person.age = person.age + 1;
        return person;
    }
}
