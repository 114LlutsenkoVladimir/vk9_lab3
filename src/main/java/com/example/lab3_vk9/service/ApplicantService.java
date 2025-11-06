package com.example.lab3_vk9.service;

import com.example.lab3_vk9.dto.applicant.ApplicantBySpecialtyDto;
import com.example.lab3_vk9.entity.Applicant;
import com.example.lab3_vk9.repository.ApplicantRepository;

import java.util.List;

public class ApplicantService extends AbstractCrudService<Applicant, Long, ApplicantRepository> {

    protected ApplicantService(ApplicantRepository repository) {
        super(repository);
    }

    public List<ApplicantBySpecialtyDto> findAllApplicantSpecialties(Long applicantId) {
        return repository.findAllApplicantSpecialties(applicantId);
    }

    public List<ApplicantBySpecialtyDto> findAllBySpecialty(Long specialtyId) {
        return repository.findAllBySpecialty(specialtyId);
    }
}
