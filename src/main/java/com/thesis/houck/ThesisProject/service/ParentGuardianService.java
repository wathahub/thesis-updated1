package com.thesis.houck.ThesisProject.service;

import com.thesis.houck.ThesisProject.beans.ParentGuardianBean;
import com.thesis.houck.ThesisProject.model.ParentGuardian;
import com.thesis.houck.ThesisProject.model.Patient;

import java.util.List;

public interface ParentGuardianService {
    public ParentGuardian createParentGuardian(ParentGuardianBean bean, List<Patient> patientList);
}
