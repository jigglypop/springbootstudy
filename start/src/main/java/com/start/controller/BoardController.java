package com.start.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BoardController {

    public BoardController() {
        System.out.println("===> BoardController Create");
    }

    @GetMapping("/")
    public String Home() {
        return "<h1>Spring Boot Run</h1>";
    }
}
