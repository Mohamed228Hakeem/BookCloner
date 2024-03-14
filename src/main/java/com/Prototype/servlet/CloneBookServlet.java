package com.Prototype.servlet;
import com.Prototype.*;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

@WebServlet("/CloneBookServlet")
public class CloneBookServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        List<book> books = (List<book>) getServletContext().getAttribute("books");
        
        if (books != null) {
            for (book book : books) {
			    if (book.getId().equals(id)) {
			        book clonedBook = (book) book.clone();
			        clonedBook.setId(UUID.randomUUID().toString()); // Assign a new unique ID to the clone
			        books.add(clonedBook);
			        break;
			    }
			}
        }

        getServletContext().setAttribute("books", books);
        response.sendRedirect("listBooks.jsp");
    }
}

