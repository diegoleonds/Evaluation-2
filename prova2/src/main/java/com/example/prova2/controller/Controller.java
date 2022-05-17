package com.example.prova2.controller;

import java.util.List;

public interface Controller<I, O> {
    O getBydId(long id);
    List<O> getByAll();
    void insert(I input);
    void delete(I input);
    void update(I input);
}
