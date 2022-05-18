<%@page contentType="text/html" pageEncoding="UTF-8"
        import="java.util.*"
        import="com.example.prova2.data.model.Author"%>
<html>
<head>
    <title>Book register</title>
</head>
<body>
<form action="BookServlet" method="post">
    Title: <input type="text" name="title">
    <select name="authors">
        <%
            List<Author> authors = (List<Author>) request.getAttribute("authors");
            for (Author author : authors) {
        %>
        <option value="<%=author.getId()%>"><%=author.getName()%></option>
        <%
            }
        %>
    </select>
    <br>
    <input type="submit" value="Register">
</form>
</body>
</html>
