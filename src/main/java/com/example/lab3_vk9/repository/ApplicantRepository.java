package com.example.lab3_vk9.repository;

import com.example.lab3_vk9.dto.applicant.ApplicantBySpecialtyDto;
import com.example.lab3_vk9.entity.Applicant;

import java.util.List;

public class ApplicantRepository extends GenericRepository<Applicant, Long> {
    protected ApplicantRepository(Class<Applicant> entityClass) {
        super(entityClass);
    }

    public List<ApplicantBySpecialtyDto> findAllBySpecialty(Long specialtyId) {
        return em.createQuery("""
        SELECT new com.example.lab3_vk9.dto.applicant.ApplicantBySpecialtyDto(
            a.id, a.firstName, a.lastName, s.id, s.name
        )
        FROM SpecialtyForApplicant sfa
        JOIN sfa.applicant a
        JOIN sfa.specialty s
        WHERE s.id = :specialtyId
        """, ApplicantBySpecialtyDto.class)
                .setParameter("specialtyId", specialtyId)
                .getResultList();
    }

    public List<ApplicantBySpecialtyDto> findAllApplicantSpecialties(Long applicantId) {
        return em.createQuery("""
        SELECT new com.example.lab3_vk9.dto.applicant.ApplicantBySpecialtyDto(
            a.id, a.firstName, a.lastName, s.id, s.name
        )
        FROM SpecialtyForApplicant sfa
        JOIN sfa.applicant a
        JOIN sfa.specialty s
        WHERE a.id = :applicantId
        """, ApplicantBySpecialtyDto.class)
                .setParameter("applicantId", applicantId)
                .getResultList();
    }
}
