<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Upload Result</title>
</head>
<body>

<h2>File Upload Result</h2>
${not empty fileName ?
        "<p>File Name: " += fileName += "</p><p>File Size: " += fileSize += " bytes</p>"
        : "<p>No file was uploaded.</p>"}

</body>
</html>