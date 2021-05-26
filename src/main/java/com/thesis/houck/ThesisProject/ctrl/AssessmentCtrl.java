package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AssessmentCtrl {

    //TODO: Identify what this is.
    @GetMapping("/assessment")
    public String assessmentPage() {
        return "assesment";
    }

}
