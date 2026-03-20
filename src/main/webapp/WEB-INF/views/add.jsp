
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/add" method="post">
    <input type="text" name="productName" placeholder="Nhập tên sản phẩm"/>
    <button type="submit">Submit</button>
</form>
</body>
</html>
