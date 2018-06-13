<%@ page import="model.to.book" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/11/2017
  Time: 5:45 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>book</title>
</head>
<body bgcolor="aqua">
<table bgcolor="#f0f8ff" border="2" align="center">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>price</th>
    </tr>
    <%
        book bool= (book) request.getAttribute("list2");

    %>
    <tr>
        <td><%=bool.getId()%></td>
        <td><%=bool.getName()%></td>
        <td><%=bool.getPrice()%></td>

    </tr>


</table>
<br><hr>
<center><a href="index.jsp"> main page</a></center>
</body>
</html>
