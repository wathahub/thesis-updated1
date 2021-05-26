package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientCtrl {

    //TODO: ask bry about diagnosis page for patient
    //TODO: ask bry about services page for patient

    @GetMapping("/appointment")
    public String patientAppointmentPage(){
        return "dashboard/patient/appointment";
    }

    @GetMapping("/assessment")
    public String patientAssessmentPage(){
        return "dashboard/patient/assessment";
    }

    @GetMapping("/dashboard")
    public String patientDashPage(){
        return "dashboard/patient/patientDash";
    }

}
