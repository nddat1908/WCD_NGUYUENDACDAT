<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/11/2021
  Time: 3:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
    <title>Home</title>
</head>
<body>
<style>
    table {
        font-family: arial, sans-serif;
        border-collapse: collapse;
        width: 100%;
    }

    td, th {
        border: 1px solid #dddddd;
        text-align: left;
        padding: 8px;
    }

    tr:nth-child(even) {
        background-color: #dddddd;
    }
</style>
<c:url var="url_add" value="addphone">
</c:url>
<a href="${url_add}">Add Phone</a>

<table>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Price</th>
        <th>Description</th>

    </tr>
    <c:forEach var="p" items="${requestScope.phones}">
        <tr>
            <th>${p.id}</th>
            <th>${p.name}</th>
            <th>${p.brand}</th>
            <th>${p.price}</th>
            <th>${p.description}</th>
        </tr>
    </c:forEach>
</table>
</body>
</html>
