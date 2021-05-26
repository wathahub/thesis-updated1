package com.thesis.houck.ThesisProject.ctrl;

import com.thesis.houck.ThesisProject.beans.LoginBean;
import com.thesis.houck.ThesisProject.beans.RegistrationBean;
import com.thesis.houck.ThesisProject.service.RegistrationServiceImpl;
import com.thesis.houck.ThesisProject.service.UserAccountServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/loginpage")
public class LoginCtrl {

    @Autowired
    private RegistrationServiceImpl registrationService;

    @Autowired
    private UserAccountServiceImpl userAccountService;

    @GetMapping("/login")
    public String loginPage(Model model) {
        return "loginpage/login";
    }

    @GetMapping("/register")
    public String registerPage(Model model) {
        return "loginpage/register";
    }

    @PostMapping("/register")
    @ResponseBody
    public String registerAccount(@RequestBody RegistrationBean bean){
        registrationService.registerPatient(bean);
        return "ok";
    }

    @PostMapping("/login")
    @ResponseBody
    public String loginAccount(@RequestBody LoginBean bean){
        return userAccountService.findByUsernameAndPassword(bean).toString();
    }

}
