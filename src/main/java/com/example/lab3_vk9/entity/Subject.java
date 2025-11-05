package com.example.lab3_vk9.entity;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity(name = "Subject")
@Table(name = "subject", schema = "vk9_lab3")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "subject")
    private Set<SubjectForSpecialty> subjectForSpecialties = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<SubjectForSpecialty> getSubjectForSpecialties() {
        return subjectForSpecialties;
    }

    public void setSubjectForSpecialties(Set<SubjectForSpecialty> subjectForSpecialties) {
        this.subjectForSpecialties = subjectForSpecialties;
    }

}