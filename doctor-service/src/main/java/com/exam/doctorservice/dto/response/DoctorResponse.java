package com.exam.doctorservice.dto.response;

public record DoctorResponse(
        Long id,
        String name,
        String specialization
) {
}
