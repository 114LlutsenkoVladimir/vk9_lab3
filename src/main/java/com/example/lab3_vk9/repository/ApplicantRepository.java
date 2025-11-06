package com.example.lab3_vk9.repository;

import com.example.lab3_vk9.entity.Applicant;

public class ApplicantRepository extends GenericRepository<Applicant, Long> {
    protected ApplicantRepository(Class<Applicant> entityClass) {
        super(entityClass);
    }

    public List<ApplicantBySpecialtyDto> findAllBySpecialty(Long specialtyId) {
        return em.createQuery("""
        SELECT new com.example.lab3_vk9.dto.applicant.ApplicantBySpecialtyDto(
            a.id, a.firstName, a.lastName, s.id, s.name
        )
        FROM Applicant a
        JOIN a.specialties s
        WHERE s.id = :specialtyId
        """, ApplicantBySpecialtyDto.class)
                .setParameter("specialtyId", specialtyId)
                .getResultList();
    }
}
