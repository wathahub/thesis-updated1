package com.thesis.houck.ThesisProject.service;

import com.thesis.houck.ThesisProject.beans.ParentGuardianBean;
import com.thesis.houck.ThesisProject.model.ParentGuardian;
import com.thesis.houck.ThesisProject.model.Patient;
import com.thesis.houck.ThesisProject.repository.ParentGuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParentGuardianServiceImpl implements ParentGuardianService {

    @Autowired
    private ParentGuardianRepository parentGuardianRepository;

    @Override
    public ParentGuardian createParentGuardian(ParentGuardianBean bean, List<Patient> patients) {
        ParentGuardian parentGuardian = new ParentGuardian();
        parentGuardian.setName(bean.getName());
        parentGuardian.setOccupation(bean.getOccupation());
        parentGuardian.setPatientList(patients);
        return parentGuardianRepository.save(parentGuardian);
    }
}
