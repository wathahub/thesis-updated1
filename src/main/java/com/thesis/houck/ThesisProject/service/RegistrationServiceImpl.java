package com.thesis.houck.ThesisProject.service;

import com.thesis.houck.ThesisProject.beans.RegistrationBean;
import com.thesis.houck.ThesisProject.model.Patient;
import com.thesis.houck.ThesisProject.model.UserAccount;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class RegistrationServiceImpl implements RegistrationService {

    @Autowired
    private PatientServiceImpl patientService;

    @Autowired
    private UserAccountServiceImpl userAccountService;

    @Autowired
    private ParentGuardianServiceImpl parentGuardianService;

    @Override
    public void registerPatient(RegistrationBean bean) {
        UserAccount account = userAccountService.createUserAccount(bean.getUserAccount());
        Patient patient = patientService.createPatient(bean.getPatient(), account);
        LocalDate birthDate = new LocalDate(bean.getPatient().getBirthDate());
        if (Years.yearsBetween(birthDate, new LocalDate(new Date())).getYears() < 18) {
            List<Patient> patientList = new ArrayList<Patient>();
            patientList.add(patient);
            parentGuardianService.createParentGuardian(bean.getParentGuardian(), patientList);
        }
    }
}
