<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 5/29/17
  Time: 2:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script>
        function show()
        {
            Document.getElementById("x1").innerHTML="sssss"
            alert("hello one.js")

        }
    </script>
</head>
<body>
<p id="x1"></p>

<a href="javascript:show()">click</a>

<br>
</body>
</html>
