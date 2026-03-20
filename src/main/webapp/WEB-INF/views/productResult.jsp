
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>Product Name: </h1>
    <ul>
        <c:out value="${product.name}"></c:out>
    </ul>

    <h1>Price: </h1>
    <ul>
        <c:out value="${product.price}"></c:out>
    </ul>

</body>
</html>
