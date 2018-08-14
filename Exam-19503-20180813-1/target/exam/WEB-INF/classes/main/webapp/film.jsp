<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2018/8/13
  Time: 18:54
  To change this template use File | Settings | File Templates.
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>film</title>
</head>
<body>
<table class="information">
    <thead>
    <tr>
        <th>film_id</th>
        <th>title</th>
        <th>description</th>
        <th>language</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach  items="${filmList}" var="films">
        <tr>
            <td>${films.film_id}</td>
            <td>${films.title}</td>
            <td>${films.description}</td>
            <td>${films.language}</td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>
