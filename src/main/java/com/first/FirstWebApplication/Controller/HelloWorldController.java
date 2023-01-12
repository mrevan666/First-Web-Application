package com.first.FirstWebApplication.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

    @GetMapping(path = "/hello")
    public String hello(Model model){
        model.addAttribute("x","salam purrengi kafe");
        return "hello";
    }

    @PostMapping(path = "/post")
    public String fullname(Model model, @RequestParam String name,@RequestParam String surname){
        String fullname = name + " " +surname;
        fullname= "Xos gelmisiniz " + fullname.toUpperCase() + ", Deve durmeyimiz meshurdu!!!";
        model.addAttribute("o",fullname);
        return "fullname";
    }
}
