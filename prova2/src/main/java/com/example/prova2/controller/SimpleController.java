package com.example.prova2.controller;

import com.example.prova2.data.dao.Dao;
import com.example.prova2.data.model.BaseEntity;

import java.util.List;

public abstract class SimpleController<E extends BaseEntity> implements Controller<E, E> {

    protected abstract Dao<E> getDao();

    @Override
    public E getBydId(long id) {
        return getDao().getBydId(id);
    }

    @Override
    public List<E> getByAll() {
        return getDao().getByAll();
    }

    @Override
    public void insert(E input) {
        getDao().insert(input);
    }

    @Override
    public void delete(E input) {
        getDao().delete(input);
    }

    @Override
    public void update(E input) {
        getDao().update(input);
    }
}
