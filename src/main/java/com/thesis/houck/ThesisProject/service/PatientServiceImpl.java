package com.thesis.houck.ThesisProject.service;

import com.thesis.houck.ThesisProject.beans.PatientBean;
import com.thesis.houck.ThesisProject.model.Patient;
import com.thesis.houck.ThesisProject.model.UserAccount;
import com.thesis.houck.ThesisProject.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public Patient createPatient(PatientBean bean, UserAccount account) {
        Patient patient = new Patient();
        patient.setFirstName(bean.getFirstName());
        patient.setMiddleName(bean.getMiddleName());
        patient.setLastName(bean.getLastName());
        patient.setNickName(bean.getNickName());
        patient.setGender(bean.getGender());
        patient.setBirthDate(bean.getBirthDate());
        patient.setReligion(bean.getReligion());
        patient.setNationality(bean.getNationality());
        patient.setAddress(bean.getHomeAddress());
        patient.setLandLine(bean.getLandlineNumber());
        patient.setOccupation(bean.getOccupation());
        patient.setOfficePhone(bean.getOfficeNumber());
        patient.setPhone(bean.getMobileNumber());
        patient.setUserAccount(account);
        return patientRepository.save(patient);
    }
}
