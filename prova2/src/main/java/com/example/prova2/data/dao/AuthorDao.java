package com.example.prova2.data.dao;

import com.example.prova2.data.model.Author;

public class AuthorDao extends HibernateDao<Author> {

    private static AuthorDao instance;

    public static AuthorDao getInstance() {
        if (instance == null) {
            instance = new AuthorDao();
        }
        return instance;
    }

    private AuthorDao() {

    }

    @Override
    protected Class<Author> getEntityClass() { return Author.class; }
}
