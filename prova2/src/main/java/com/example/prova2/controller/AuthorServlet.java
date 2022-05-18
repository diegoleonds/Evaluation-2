package com.example.prova2.controller;

import com.example.prova2.data.dao.AuthorDao;
import com.example.prova2.data.model.Author;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "AuthorServlet", urlPatterns = {"/AuthorServlet"})
public class AuthorServlet extends HttpServlet {

    private final AuthorDao dao = AuthorDao.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Author author = new Author(req.getParameter("name"));
        dao.insert(author);
        getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);
    }
}























