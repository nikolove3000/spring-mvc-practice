
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h2>Step 2: Confirm Your Order</h2>

    <p>Product Name: ${order.productName}</p>
    <p>Quantity: ${order.quantity}</p>

    <form action="/spring_mvc_practice_war_exploded/order/complete" method="post">
        <button type="submit">Confirm</button>
    </form>
</body>
</html>
