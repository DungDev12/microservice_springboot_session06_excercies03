package com.exam.patientservice.dto.request;

import java.time.LocalDate;

public record PatientRequest(
        String fullName,
        String gender,
        LocalDate dateOfBirth,
        String phoneNumber,
        String address,
        String medicalHistory
) {
}
