package com.sportive.sportiveserver.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class TestController {

    @GetMapping("/helloWorld/{name}")
    public String helloWorld(@PathVariable final String name) {
        System.out.println("\n\n---- Hello World ----\n\n");
        return "Hello " + name;
    }

}
