
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/form" method="post">
    <input type="text" name="name" placeholder="Nhập tên sản phẩm"/>
    <input type="number" name="price" placeholder="Nhập giá sản phẩm"/>
    <button type="submit">Submit</button>
</form>
</body>
</html>
