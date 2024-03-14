package com.Prototype.servlet;

import java.io.*;
import java.util.*;
import com.Prototype.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/AddBookServlet")
public class AddBookServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddBookServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String title = request.getParameter("title");
        String author = request.getParameter("author");

        List<book> books = (List<book>) getServletContext().getAttribute("books");
        if (books == null) {
            books = new ArrayList<>();
            getServletContext().setAttribute("books", books);
        }

        book book = new book(id, title, author);
        books.add(book);

        response.sendRedirect("listBooks.jsp");
    }
}

