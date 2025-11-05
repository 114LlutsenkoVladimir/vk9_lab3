package com.example.lab3_vk9.repository;

import com.example.lab3_vk9.entity.Applicant;

public class ApplicantRepository extends GenericRepository<Applicant, Long> {
    protected ApplicantRepository(Class<Applicant> entityClass) {
        super(entityClass);
    }
}
