<%--
  Created by IntelliJ IDEA.
  User: YEN
  Date: 6/15/2021
  Time: 10:23 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form  modelAttribute="e"  action="/employer/create" method="post" >

    <table border="1px">
        <tr>
            <td><form:label path="id">Employee ID: </form:label></td>
            <td><form:input path="id"/></td>
        </tr>
        <tr>
            <td><form:label path="name">Employee's name: </form:label></td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td><form:label path="contactNumber">Contact's number: </form:label></td>
            <td><form:input path="contactNumber"/></td>
        </tr>

        <tr>
            <td><input type="text" name = "add" value="10"/></td>

        </tr>
        <tr>
            <td><input type="submit" value="Submit"/></td>

        </tr>
    </table>


</form:form>

</body>
</html>
