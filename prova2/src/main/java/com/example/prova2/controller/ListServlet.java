package com.example.prova2.controller;

import com.example.prova2.data.dao.AuthorDao;
import com.example.prova2.data.model.Author;
import com.example.prova2.data.model.Book;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet(name = "ListServlet", value = "/ListServlet")
public class ListServlet extends HttpServlet {

    private final AuthorDao authorDao = AuthorDao.getInstance();

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        List<Author> authors = authorDao.getAll();

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        for (Author author : authors) {
            out.println("<h1> Author: " + author.getName() + "</h1>");
            out.println("<h2> Books: </h2>");
            for (Book book : author.getBooks()) {
                out.println("<h3>" + book.getTitle() + "</h3>");
            }
        }

        out.println("</body></html>");
    }
}
