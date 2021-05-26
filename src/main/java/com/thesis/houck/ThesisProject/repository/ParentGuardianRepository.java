package com.thesis.houck.ThesisProject.repository;

import com.thesis.houck.ThesisProject.model.ParentGuardian;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParentGuardianRepository extends JpaRepository<ParentGuardian, Integer> {
}
