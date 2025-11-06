package com.example.lab3_vk9.service;

import com.example.lab3_vk9.entity.Applicant;
import com.example.lab3_vk9.repository.ApplicantRepository;

public class ApplicantService extends AbstractCrudService<Applicant, Long, ApplicantRepository> {

    protected ApplicantService(ApplicantRepository repository) {
        super(repository);
    }

    public Applicant createFromDto(ApplicantCreateDto dto) {

    }
}
