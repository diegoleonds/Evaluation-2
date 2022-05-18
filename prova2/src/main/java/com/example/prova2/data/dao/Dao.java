package com.example.prova2.data.dao;

import com.example.prova2.data.model.BaseEntity;

import java.util.List;

public interface Dao<E extends BaseEntity> {
    E getBydId(long id);
    List<E> getAll();
    void insert(E entity);
    void delete(E entity);
    void update(E entity);
}
