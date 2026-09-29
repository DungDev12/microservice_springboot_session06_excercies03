package com.exam.patientservice.controller;

import com.exam.patientservice.dto.request.PatientRequest;
import com.exam.patientservice.enitity.Patient;
import com.exam.patientservice.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/patients")
@RequiredArgsConstructor
public class PatientController {

    private final PatientService patientService;

    @PostMapping()
    public ResponseEntity<Patient> createPatient(@RequestBody PatientRequest patient) {
        return ResponseEntity.ok(patientService.createPatient(patient));
    }
}
