package com.thesis.houck.ThesisProject.service;

import com.sun.istack.Nullable;
import com.thesis.houck.ThesisProject.beans.PatientBean;
import com.thesis.houck.ThesisProject.model.Patient;
import com.thesis.houck.ThesisProject.model.UserAccount;

public interface PatientService {

    public Patient createPatient(PatientBean bean, @Nullable UserAccount account);

}
