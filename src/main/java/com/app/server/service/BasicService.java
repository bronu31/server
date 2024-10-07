package com.app.server.service;


import org.springframework.stereotype.Service;

import java.lang.annotation.Inherited;
import java.util.List;
@Service
public interface BasicService <T> {

    List<T> getAllEntities();
    T getEntityById(int id);
    void deleteEntity(int id);
    T saveEntity(T entity);
    T createEntity(T entity);
}
