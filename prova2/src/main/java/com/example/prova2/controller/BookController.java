package com.example.prova2.controller;

import com.example.prova2.data.dao.BookDao;
import com.example.prova2.data.model.Book;

public class BookController extends SimpleController<Book> {
    @Override
    protected BookDao getDao() { return BookDao.getInstance(); }
}
