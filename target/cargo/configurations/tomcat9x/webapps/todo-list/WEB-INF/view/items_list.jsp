<%--
  Created by IntelliJ IDEA.
  User: MJ
  Date: 26.10.2020
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="academy.learnprogramming.config.util.Mappings" %>

<html>
<head>
    <title>ToDo Items</title>
</head>
<body>
<div align="center">
    <c:url var="addUrl" value="${Mappings.ADD_ITEM}"/>
    <a href="${addUrl}">New</a>

    <table border="1" cellpadding="5">
        <caption>
            <h2>ToDo List</h2>
        </caption>

        <tr>
            <th>Title</th>
            <th>Deadline</th>
            <th>View</th>
            <th>Edit</th>
            <th>Delete</th>
        </tr>

        <c:forEach var="item" items="${toDoData.items}">

            <c:url var="viewUrl" value="${Mappings.VIEW_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>

            <c:url var="editUrl" value="${Mappings.ADD_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>

            <c:url var="deleteUrl" value="${Mappings.DELETE_ITEM}">
                <c:param name="id" value="${item.id}"/>
            </c:url>


            <tr>
                <td><c:out value="${item.title}"/></td>
                <td><c:out value="${item.deadline}"/></td>
                <td><a href="${viewUrl}">View</a></td>
                <td><a href="${editUrl}">Edit</a></td>
                <td><a href="${deleteUrl}">Delete</a></td>
            </tr>

        </c:forEach>

    </table>
</div>
</body>
</html>
