package com.example.prova2.data.dao;

import com.example.prova2.data.model.Author;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AuthorDaoTest {

    private AuthorDao dao = AuthorDao.getInstance();

    @Test
    public void testInsert() {
        Author author = new Author("Karl Marx");
        dao.insert(author);
    }

    @Test
    public void getAllTest() {
        assertEquals(2, dao.getAll().size());
    }
}