<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 6/15/2021
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Information</title>
</head>
<body>
<h2>Submitted Employee Information</h2>
<table>
    <tr>
        <td>Name:</td>
        <td>${e.name}</td>
    </tr>
    <tr>
        <td>ID:</td>
        <td>${e.id}</td>
    </tr>
    <tr>
        <td>Contact Number:</td>
        <td>${e.contactNumber}</td>
    </tr>
</table>
</body>
</html>