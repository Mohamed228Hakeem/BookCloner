<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h2>Add a New Book</h2>
    <form action="AddBookServlet" method="post">
        ID: <input type="text" name="id" /><br/>
        Title: <input type="text" name="title" /><br/>
        Author: <input type="text" name="author" /><br/>
        <input type="submit" value="AddBook" />
    </form>

</body>
</html>