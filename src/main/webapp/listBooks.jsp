<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.Prototype.*" %>
    <%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	 <h2>List of Books</h2>
    <ul>
        <% 
            List<book> books = (List<book>) application.getAttribute("books");
            if (books != null) {
                for (book book : books) {
        %>
        <li><%= book.getId() %> - <%= book.getTitle() %> by <%= book.getAuthor() %></li>
        <%
                }
            }
        %>
    </ul>
    <form action="CloneBookServlet" method="post">
        ID to clone: <input type="text" name="id" /><br/>
        <input type="submit" value="Clone Book" />
    </form>
</body>
</html>