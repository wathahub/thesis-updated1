package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/loginpage")
public class LoginCtrl {

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "loginpage/login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        return "loginpage/register";
    }

}
