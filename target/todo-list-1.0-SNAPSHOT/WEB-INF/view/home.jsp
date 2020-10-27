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
    <title>ToDo List App</title>
</head>
<body>
    <div align="center">
        <c:url var="itemsLink" value="${Mappings.ITEMS}"/>
        <h2><a href="${itemsLink}">Show Todo Items></a></h2>


    </div>
</body>
</html>
