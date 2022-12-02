package com.example.jsptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    @GetMapping("/")
    public String hello()
    {
        return"index";
    }

}
