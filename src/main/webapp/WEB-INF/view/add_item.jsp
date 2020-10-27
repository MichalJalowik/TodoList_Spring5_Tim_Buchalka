<%--
  Created by IntelliJ IDEA.
  User: MJ
  Date: 26.10.2020
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page import="academy.learnprogramming.config.util.AtributesNames " %>
<html>
<head>
    <title>Add Items</title>
</head>
<body>
<div align="center">
    <%--@elvariable id="${AtributesNames.TODO_ITEM}" type="academy"--%>
    <form:form method="POST" modelAttribute="${AtributesNames.TODO_ITEM}">
        <table>
            <tr>
                <td><label>ID</label></td>
                <td>
                    <form:input path="id" disabled="true" />
                </td>
            </tr>
            <tr>
                <td><label>Title</label></td>
                <td><form:input path="title"/></td>
            </tr>
            <tr>
                <td><label>Deadline</label></td>
                <td><form:input path="deadline"/></td>
            </tr>
            <tr>
                <td><label>Details</label></td>
                <td><form:textarea path="details"/></td>
            </tr>
            <tr>
                <td><input type="submit" value="Submit"/></td>
            </tr>
        </table>
    </form:form>

</div>
</body>
</html>

