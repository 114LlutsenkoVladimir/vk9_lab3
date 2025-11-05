package com.example.lab3_vk9.repository;

import com.example.lab3_vk9.entity.Subject;

public class SubjectRepository extends GenericRepository<Subject, Long>{
    protected SubjectRepository(Class<Subject> entityClass) {
        super(entityClass);
    }
}
