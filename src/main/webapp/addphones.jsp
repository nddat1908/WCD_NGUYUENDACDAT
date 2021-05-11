<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 5/11/2021
  Time: 3:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Phone</title>
</head>
<body>
<form method="post" action="addphone">
    <input class="form-control form-control-lg mb-3" type="text" placeholder="Name " name="name">
    <select name="brand">
        <option value="Apple">Apple</option>
        <option value="Samsung">Samsung</option>
        <option value="Nokia">Nokia</option>
        <option value="Others">Others</option>
    </select>
    <input  type="number" placeholder="Price" name="price">
    <input  type="text" placeholder="Description" name="description">
    <input class="btn btn-primary" type="submit" value="Submit">
</form>
</body>
</html>
