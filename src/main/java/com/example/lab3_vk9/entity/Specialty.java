package com.example.lab3_vk9.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity(name = "Specialty")
@Table(name = "specialty", schema = "vk9_lab3")
public class Specialty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name", length = 50)
    private String name;

    @OneToMany(mappedBy = "specialty")
    private Set<SpecialtyForApplicant> specialtyForApplicants = new LinkedHashSet<>();

    @OneToMany(mappedBy = "specialty")
    private Set<SubjectForSpecialty> subjectForSpecialties = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<SpecialtyForApplicant> getSpecialtyForApplicants() {
        return specialtyForApplicants;
    }

    public void setSpecialtyForApplicants(Set<SpecialtyForApplicant> specialtyForApplicants) {
        this.specialtyForApplicants = specialtyForApplicants;
    }

    public Set<SubjectForSpecialty> getSubjectForSpecialties() {
        return subjectForSpecialties;
    }

    public void setSubjectForSpecialties(Set<SubjectForSpecialty> subjectForSpecialties) {
        this.subjectForSpecialties = subjectForSpecialties;
    }

}