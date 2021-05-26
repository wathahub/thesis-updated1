package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AboutCtrl {

    @GetMapping("/about")
    public String aboutPage(Model model) {
        return "about";
    }

}
