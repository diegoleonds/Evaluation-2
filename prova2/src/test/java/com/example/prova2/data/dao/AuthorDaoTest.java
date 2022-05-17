package com.example.prova2.data.dao;

import com.example.prova2.data.model.Author;
import org.junit.jupiter.api.Test;

class AuthorDaoTest {

    @Test
    public void testInsert() {
        Author author = new Author("Karl Marx");
        AuthorDao.getInstance().insert(author);
    }
}