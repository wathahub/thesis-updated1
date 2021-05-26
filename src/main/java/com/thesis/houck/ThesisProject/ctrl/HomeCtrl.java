package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeCtrl {

    @GetMapping("/")
    public String greeting(Model model) {
        return "index";
    }

}