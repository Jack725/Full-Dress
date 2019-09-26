package com.fulldress.darkpurple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class IndexController {

    @RequestMapping("index")
    public ModelAndView index() {
        System.out.println("enter index");
        return new ModelAndView("index.html");
    }
}
