
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/form" method="post" modelAttribute="product">
    <form:input path="name"/>
    <form:errors path="name"/>
    <form:input path="price"/>
    <form:errors path="price"/>
    <button type="submit">Submit</button>
</form:form>
</body>
</html>
