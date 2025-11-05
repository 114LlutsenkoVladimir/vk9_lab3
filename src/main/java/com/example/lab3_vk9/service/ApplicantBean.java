package com.example.lab3_vk9.service;

import com.example.lab3_vk9.entity.Applicant;
import com.example.lab3_vk9.repository.ApplicantRepository;

public class ApplicantBean extends AbstractCrudBean<Applicant, Long, ApplicantRepository> {

    protected ApplicantBean(ApplicantRepository repository) {
        super(repository);
    }

    public Applicant createFromDto(ApplicantCreateDto dto) {

    }
}
