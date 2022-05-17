package com.example.prova2.data.dao;

import com.example.prova2.data.model.Book;

public class BookDao extends HibernateDao<Book> {

    private static BookDao instance;

    public static BookDao getInstance() {
        if (instance == null) {
            instance = new BookDao();
        }
        return instance;
    }

    private BookDao() {

    }

    @Override
    protected Class<Book> getEntityClass() { return Book.class; }
}
