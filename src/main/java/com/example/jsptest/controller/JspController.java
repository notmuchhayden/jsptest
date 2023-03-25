package com.example.jsptest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JspController {
    @GetMapping("/")
    public String hello(Model model) {
        model.addAttribute("message", "환영합니다. JSP - Srping 연동이 성공했습니다.");
        return"index";
    }
}
