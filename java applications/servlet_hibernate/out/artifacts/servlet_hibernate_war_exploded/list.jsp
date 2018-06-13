
<%@ page import="model.to.person" %>
<%@page import="java.util.*"%>
<%@ page import="java.util.List" %>
<%@ page import="model.to.book" %><%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/9/2017
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#5f9ea0">
<h1><center>list all perosns</center></h1>
<table border="2" align="center">
    <tr>
        <th>id</th>
        <th>name</th>
        <th>family</th>
        <th>age</th>
        <th>comments</th>
        </tr>
        <%
          List<person> list= (List<person>) request.getAttribute("list");
            for (person person : list) {

        %>
    <tr>
     <td><%=person.getId()%></td>
        <td><%=person.getName()%></td>
        <td><%=person.getFmily()%></td>
        <td><%=person.getAge()%></td>
        <td><%=person.getComment()%></td>

    </tr>
    <%
        }
    %>

</table>
<hr><br>
<br><hr>
<center><a href="index.jsp"> main page</a></center>
</body>
</html>
