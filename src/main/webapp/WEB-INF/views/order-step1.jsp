<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form:form modelAttribute="order" action="/spring_mvc_practice_war_exploded/order/step1" method="post">
        productName: <form:input path="productName"/>
        quantity: <form:input path="quantity"/>
        <button type="submit">Next</button>
    </form:form>
</body>
</html>
