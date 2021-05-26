package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppointmentCtrl {

    @GetMapping("/appointment")
    public String appointmentPage(){
        return "appointment";
    }

}
