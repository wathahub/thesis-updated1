package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/patient")
public class PatientCtrl {



    @GetMapping("/appointment")
    public String patientAppointmentPage(){
        return "dashboard/patient/Appointment";
    }

    @GetMapping("/assessment")
    public String patientAssessmentPage(){
        return "dashboard/patient/Assessment";
    }

    @GetMapping("/dashboard")
    public String patientDashPage(){
        return "dashboard/patient/PatientDash";
    }

    @GetMapping("/diagnosis")
    public String patientDiagnosisPage() { return "dashboard/patient/Diagnosis"; }

    @GetMapping("/services")
    public String patientServicesPage(){
        return "dashboard/patient/Services";
    }

}
