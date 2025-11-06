package com.example.lab3_vk9.controller;

import com.example.lab3_vk9.entity.Applicant;
import com.example.lab3_vk9.entity.Specialty;
import com.example.lab3_vk9.service.ApplicantService;
import com.example.lab3_vk9.service.SpecialtyService;
import jakarta.inject.Inject;
import java.util.List;

public class ApplicantController {
    @Inject
    private ApplicantService applicantService;

    @Inject
    private SpecialtyService specialtyService;

    private Applicant applicant = new Applicant();

    private List<Applicant> applicantList;

    private List<Specialty> allSpecialties;

    public Applicant getApplicant() {
        return applicant;
    }

    public void createApplicant() {
        applicantService.create(applicant);
        applicant = new Applicant();
    }

    public void findApplicantById(Long id) {
        applicant = applicantService.findById(id);
    }



}
