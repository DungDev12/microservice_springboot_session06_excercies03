package com.exam.patientservice.repository;

import com.exam.patientservice.enitity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
