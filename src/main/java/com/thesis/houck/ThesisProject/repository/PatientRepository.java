package com.thesis.houck.ThesisProject.repository;

import com.thesis.houck.ThesisProject.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
