package com.example.lab3_vk9.service;

import com.example.lab3_vk9.entity.Subject;
import com.example.lab3_vk9.repository.SubjectRepository;

public class SubjectService extends AbstractCrudService<Subject, Long, SubjectRepository> {
    protected SubjectService(SubjectRepository repository) {
        super(repository);
    }
}
