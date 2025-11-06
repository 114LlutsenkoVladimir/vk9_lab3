package com.example.lab3_vk9.controller;

import com.example.lab3_vk9.dto.applicant.ApplicantBySpecialtyDto;
import com.example.lab3_vk9.entity.Applicant;
import com.example.lab3_vk9.service.ApplicantService;
import com.example.lab3_vk9.service.SpecialtyService;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import jakarta.enterprise.context.RequestScoped;

@Named("applicantBean")
@RequestScoped
public class ApplicantBean implements Serializable {
    @Inject
    private ApplicantService applicantService;

    @Inject
    private SpecialtyService specialtyService;

    private List<ApplicantBySpecialtyDto> dataTableList = new ArrayList<>();

    private Applicant form = new Applicant();

    private Long selectedApplicantId;

    private Long selectedSpecialtyId;

    public Applicant getForm() {
        return form;
    }


    public Long getSelectedSpecialtyId() {
        return selectedSpecialtyId;
    }

    public Long getSelectedApplicantId() {
        return selectedApplicantId;
    }

    public List<ApplicantBySpecialtyDto> getDataTableList() {
        return dataTableList;
    }

    public void createApplicant() {
        applicantService.create(form);
        dataTableList = applicantService.findAllApplicantSpecialties(form.getId());
        form = new Applicant();
    }

    public void findApplicantById() {
        dataTableList = applicantService.findAllApplicantSpecialties(selectedApplicantId);
    }

    public void updateApplicant() {
        Applicant applicant = applicantService.findById(selectedApplicantId);
        applicant.copy(form);
        applicantService.update(applicant);
    }

    public void updateDataTableBySpecialtyId() {
        dataTableList = applicantService.findAllBySpecialty(selectedSpecialtyId);
    }

    public void deleteApplicant() {
        applicantService.delete(selectedApplicantId);
        updateDataTableBySpecialtyId();
    }



}
