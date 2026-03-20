<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Products</h1>
    <ul>
        <c:forEach items="${products}" var="product">
            <li>${product}</li>
        </c:forEach>
    </ul>
</body>
</html>
