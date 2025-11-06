package com.example.lab3_vk9.service;

import com.example.lab3_vk9.entity.Specialty;
import com.example.lab3_vk9.repository.SpecialtyRepository;

public class SpecialtyService extends AbstractCrudService<Specialty, Long, SpecialtyRepository> {
    protected SpecialtyService(SpecialtyRepository repository) {
        super(repository);
    }
}
