package com.app.server.service.Impl;

import com.app.server.repository.BasicRepository;
import com.app.server.service.BasicService;

import java.util.List;

public abstract class BasicServiceImpl<T> implements BasicService<T> {

    private final BasicRepository<T> repository;

    protected BasicServiceImpl(BasicRepository<T> repository) {
        this.repository = repository;
    }

    @Override
    public List<T> getAllEntities() {
        return repository.findAll();
    }

    @Override
    public T getEntityById(int id) {
        return (T) repository.findById(id).get();
    }

    @Override
    public void deleteEntity(int id) {
        repository.deleteById(id);
    }

    @Override
    public T saveEntity(T entity) {
        return (T) repository.save(entity);
    }

    @Override
    public T createEntity(T entity) {
        return saveEntity(entity);
    }
}
