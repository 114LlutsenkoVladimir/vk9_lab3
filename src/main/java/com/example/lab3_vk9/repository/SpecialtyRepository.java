package com.example.lab3_vk9.repository;

import com.example.lab3_vk9.entity.Specialty;

public class SpecialtyRepository extends GenericRepository<Specialty, Long>{
    protected SpecialtyRepository(Class<Specialty> entityClass) {
        super(entityClass);
    }
}
