<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/9/2017
  Time: 11:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String name= (String) request.getAttribute("error");
%>
<h1><%=name%></h1>

</body>
</html>
