package com.thesis.houck.ThesisProject.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminCtrl {



    @GetMapping("/admindash")
    public String adminDashPage(){
        return "dashboard/admin/admindash";
    }

    @GetMapping("/manageusers")
    public String adminManageUsersPage(){
        return "dashboard/admin/manageusers";
    }

    @GetMapping("/reports")
    public String adminReportsPage(){
        return "dashboard/admin/reports";
    }

    @GetMapping("/services")
    public String adminServicesPage() { return "dashboard/admin/services"; }

    @GetMapping("/update")
    public String adminUpdatePage(){
        return "dashboard/admin/update";
    }

}
