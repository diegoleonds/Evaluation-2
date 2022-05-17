package com.example.prova2.data.config;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DbConfigTest {

    @Test
    public void testConnection() {
        assertNotNull(DbConfig.getSession());
    }
}