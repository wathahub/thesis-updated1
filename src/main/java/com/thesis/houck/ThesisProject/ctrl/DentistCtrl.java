package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dentist")
public class DentistCtrl {



    @GetMapping("/DentistDash")
    public String dentistDashboardPage(){
        return "dashboard/dentist/dashboard";
    }

    @GetMapping("/diagnosis")
    public String dentistDiagnosisPage(){
        return "dashboard/dentist/Diagnosis";
    }

    @GetMapping("/schedule")
    public String dentistSchedulePage(){
        return "dashboard/dentist/Sched";
    }

    @GetMapping("/updatesched")
    public String dentistUpdateSchedulePage(){
        return "dashboard/dentist/Update";
    }

    @GetMapping("/viewpatientinfo")
    public String dentistPatientInfoPage() { return "dashboard/dentist/PatientInfo"; }

    @GetMapping("/updatepatientinfo")
    public String dentistUpdatePatientInfoPage(){
        return "dashboard/dentist/UpdatePatientInfo";
    }

}
