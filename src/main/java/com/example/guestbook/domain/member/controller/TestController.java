package com.example.guestbook.domain.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @GetMapping("/")
    @ResponseBody
    public String mainApi() {
        return "success main";
    }

    @GetMapping("/test")
    @ResponseBody
    public String test() {
        return "Test successful!";
    }

    @GetMapping("/secured")
    @ResponseBody
    public String secured() {
        return "This is a secured endpoint";
    }
}


