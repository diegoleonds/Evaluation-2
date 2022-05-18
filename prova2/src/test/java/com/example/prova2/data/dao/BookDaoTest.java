package com.example.prova2.data.dao;

import com.example.prova2.data.model.Author;
import com.example.prova2.data.model.Book;
import org.junit.jupiter.api.Test;

class BookDaoTest {

    private BookDao dao = BookDao.getInstance();

    @Test
    public void getAll() {
        dao.getAll();
    }

    @Test
    public void insertBooks() {
        Author author = AuthorDao.getInstance().getBydId(1L);
        Book book = new Book("Manifesto Comunista", author);

        dao.insert(book);
    }
}