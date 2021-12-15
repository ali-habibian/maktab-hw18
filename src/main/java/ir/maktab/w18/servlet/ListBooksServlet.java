package ir.maktab.w18.servlet;

import ir.maktab.w18.dao.BookDao;
import ir.maktab.w18.entity.Book;

import java.io.*;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "ListBookServlet", value = "")
public class ListBooksServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        BookDao bookDao = new BookDao();
        List<Book> bookList = bookDao.getAll();
        request.setAttribute("books", bookList);

        String listPage = "index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);

        requestDispatcher.forward(request, response);
    }

    public void destroy() {
    }
}