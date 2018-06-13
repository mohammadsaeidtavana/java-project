<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 6/25/17
  Time: 4:56 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>messagae</title>
</head>
<body bgcolor="#ffe4c4">
<hr size="3" align="center">
<br>
<%
    String name= (String) request.getAttribute("name");
%>
<center><h1>mail has been successfully  sent to <%=name%> </h1></center>
<br><hr size="3" align="center">
<center><a href="index.jsp">main page </a> </center>
</body>
</html>
