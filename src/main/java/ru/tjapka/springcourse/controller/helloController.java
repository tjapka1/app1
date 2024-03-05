package ru.tjapka.springcourse.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class helloController {
    @GetMapping("/hi")
    public String sayHello(){
        return "hello";
    }

    @GetMapping("/by")
    public String sayBy(){
        return "by";
    }

}
