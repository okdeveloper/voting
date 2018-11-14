package com.marchan.voting.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/testController")
public class TestController {

    @RequestMapping("/test")
    public String getTest() {
        return "test";
    }
}
