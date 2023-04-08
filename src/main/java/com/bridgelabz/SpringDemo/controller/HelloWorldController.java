package com.bridgelabz.SpringDemo.controller;

import com.bridgelabz.SpringDemo.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloWorldController {

    @GetMapping("/Vinayak")
    public String sayHello() {
        return "Hello From Bridgelabz";
    }

    @RequestMapping(value = {"/query"}, method = RequestMethod.GET)
    public String sayHello(@RequestParam(value = "name") String name) {
        return "Hello" + name + "!";
    }

    @GetMapping("/param/{name}")
    public String sayHelloParam(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @PostMapping("/post")
    public String sayHello(@RequestBody User user) {
        return "Hello" + user.getFirstName() + " " + user.getLastName() + "!";
    }

    @PutMapping("/put/{firstname}")
    public String sayHello(@PathVariable String firstname,
                           @RequestParam(value = "lastname") String lastname) {
        return "Hello" + firstname + " " + lastname + "!";
    }
}
