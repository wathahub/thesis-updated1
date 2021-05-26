package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactCtrl {

    @GetMapping("/contact")
    public String contactPage(Model model) {
        return "contact";
    }

}
