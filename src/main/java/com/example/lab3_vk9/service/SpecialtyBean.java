package com.example.lab3_vk9.service;

import com.example.lab3_vk9.entity.Specialty;
import com.example.lab3_vk9.repository.SpecialtyRepository;

public class SpecialtyBean extends AbstractCrudBean<Specialty, Long, SpecialtyRepository>{
    protected SpecialtyBean(SpecialtyRepository repository) {
        super(repository);
    }
}
