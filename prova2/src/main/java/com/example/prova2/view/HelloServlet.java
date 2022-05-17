package com.example.prova2.view;

import com.example.prova2.controller.AuthorController;
import com.example.prova2.data.model.Author;

import java.io.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        AuthorController controller = new AuthorController();
        Author author = controller.getBydId(1);

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + author.getName() + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}