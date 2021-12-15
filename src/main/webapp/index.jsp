<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%--<!DOCTYPE html>--%>
<%--<html>--%>
<%--<head>--%>
<%--    <title>JSP - Hello World</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<h1><%= "Hello World!" %>--%>
<%--</h1>--%>
<%--<br/>--%>
<%--<a href="hello-servlet">Hello Servlet</a>--%>
<%--</body>--%>
<%--</html>--%>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="q2/css/bootstrap.css">
    <script src="q2/js/bootstrap.min.js"></script>
    <title>Books Table</title>
</head>
<body>
<div class="p-2">
    <h1 class="text-center"><a href="book_form.html">Add New Book</a></h1>
    <br/>
    <table class="table table-bordered">
        <thead class="table-dark">
        <tr>
            <th scope="col">Row</th>
            <th scope="col">id</th>
            <th scope="col">name</th>
            <th scope="col">isbn</th>
            <th scope="col">author</th>
            <th scope="col">edition</th>
            <th scope="col">publisher</th>
            <th scope="col">published</th>
            <th scope="col">price</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${books}" var="book" varStatus="status">
            <tr class="table-light">
                <th scope="row">${status.index + 1}</th>
                <td>${book.id}</td>
                <td>${book.name}</td>
                <td>${book.isbn}</td>
                <td>${book.author}</td>
                <td>${book.edition}</td>
                <td>${book.publisher}</td>
                <td>${book.published}</td>
                <td>${book.price}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
</body>
</html>