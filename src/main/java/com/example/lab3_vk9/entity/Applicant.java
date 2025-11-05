package com.example.lab3_vk9.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity(name = "Applicant")
@Table(name = "applicant", schema = "vk9_lab3")
public class Applicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 70)
    private String lastName;

    @OneToMany(mappedBy = "applicant")
    private Set<SpecialtyForApplicant> specialtyForApplicants = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<SpecialtyForApplicant> getSpecialtyForApplicants() {
        return specialtyForApplicants;
    }

    public void setSpecialtyForApplicants(Set<SpecialtyForApplicant> specialtyForApplicants) {
        this.specialtyForApplicants = specialtyForApplicants;
    }

}