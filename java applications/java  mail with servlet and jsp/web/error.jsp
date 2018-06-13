<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 6/25/17
  Time: 5:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>error</title>
</head>
<body bgcolor="#deb887">
<hr><br>
<%
    String name= (String) request.getAttribute("name");
%>
<center><h1>unable to send message to following address </h1></center><br>
<center><h2><%=name%></h2></center>
<hr><br>
<center><a href="index.jsp">main page</a> </center>
</body>
</html>
