package com.example.prova2.data.dao;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookDaoTest {

    private BookDao dao = BookDao.getInstance();

    @Test
    public void getAll() {
        dao.getByAll();
    }
}