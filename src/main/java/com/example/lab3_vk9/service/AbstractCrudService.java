package com.example.lab3_vk9.service;

import com.example.lab3_vk9.repository.GenericRepository;

import java.util.List;

public class AbstractCrudService<T, ID, RP extends GenericRepository<T, ID>> {

    private RP repository;

    protected AbstractCrudService(RP repository) {
        this.repository = repository;
    }

    public void create(T entity) {
        repository.create(entity);
    }

    public T findById(ID id) {
        return repository.findById(id);
    }

    public List<T> findAll() {
        return repository.findAll();
    }

    public T update(T entity) {
        return repository.update(entity);
    }

    public void delete(ID id) {
        repository.delete(id);
    }

}
