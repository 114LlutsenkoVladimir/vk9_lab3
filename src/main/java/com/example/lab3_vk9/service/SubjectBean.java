package com.example.lab3_vk9.service;

import com.example.lab3_vk9.entity.Subject;
import com.example.lab3_vk9.repository.SubjectRepository;

public class SubjectBean extends AbstractCrudBean<Subject, Long, SubjectRepository>{
    protected SubjectBean(SubjectRepository repository) {
        super(repository);
    }
}
