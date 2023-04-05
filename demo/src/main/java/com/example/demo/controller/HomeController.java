package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

// RestController vs Controller

@Controller
public class HomeController {
    // Method to return data
    @GetMapping("/index")
    public ModelAndView getIndex(){
        ModelAndView obj = new ModelAndView();
        obj.setViewName("index");
        return obj;
    }

//    @GetMapping("/getstudent")
//    public Student getstudent{
//
//    }
}
