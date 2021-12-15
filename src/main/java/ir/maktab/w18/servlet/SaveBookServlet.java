package ir.maktab.w18.servlet;

import ir.maktab.w18.dao.BookDao;
import ir.maktab.w18.entity.Book;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

@WebServlet(name = "SaveBookServlet", value = "/SaveBookServlet")
public class SaveBookServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String isbn = request.getParameter("isbn");
        String author = request.getParameter("author");
        Integer edition = Integer.parseInt(request.getParameter("edition"));
        String publisher = request.getParameter("publisher");
        Date published = Date.valueOf(request.getParameter("published"));
        Double price = Double.parseDouble(request.getParameter("price"));

        Book book = new Book(name, isbn, author, edition, publisher, published, price);

        BookDao bookDao = new BookDao();
        bookDao.save(book);

        List<Book> bookList = bookDao.getAll();
        request.setAttribute("books", bookList);

        String listPage = "index.jsp";
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(listPage);

        requestDispatcher.forward(request, response);
    }
}
