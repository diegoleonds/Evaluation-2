package com.example.prova2.controller;

import com.example.prova2.data.dao.AuthorDao;
import com.example.prova2.data.dao.BookDao;
import com.example.prova2.data.model.Book;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "BookServlet", urlPatterns = {"/BookServlet"})
public class BookServlet extends HttpServlet {

    private final BookDao bookDao = BookDao.getInstance();
    private final AuthorDao authorDao = AuthorDao.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("authors", authorDao.getAll());
        getServletContext().getRequestDispatcher("/bookRegister.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Book book = new Book();
        book.setTitle(req.getParameter("title"));
        book.setAuthor(AuthorDao.getInstance().getBydId(Long.parseLong(req.getParameter("authors"))));
        bookDao.insert(book);
        getServletContext().getRequestDispatcher("/success.jsp").forward(req, resp);
    }
}