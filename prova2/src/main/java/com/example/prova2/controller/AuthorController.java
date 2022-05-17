package com.example.prova2.controller;

import com.example.prova2.data.dao.AuthorDao;
import com.example.prova2.data.dao.Dao;
import com.example.prova2.data.model.Author;

public class AuthorController extends SimpleController<Author> {
    @Override
    protected Dao<Author> getDao() {
        return AuthorDao.getInstance();
    }
}
