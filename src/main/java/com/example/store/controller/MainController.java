package com.example.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

    @GetMapping("/producto")
    public ModelAndView index() {
        ModelAndView vm = new ModelAndView();
        vm.setViewName("index");
        return vm;
    }
}
