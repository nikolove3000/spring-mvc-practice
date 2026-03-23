<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>File Upload Form</title>
</head>
<body>
<h2>Upload a File</h2>

<form action="/spring_mvc_practice_war_exploded/upload" method="post" enctype="multipart/form-data">
    <input type="file" name="file"/><br/><br/>
    <button type="submit">Upload</button>
</form>

</body>
</html>