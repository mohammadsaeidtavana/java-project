<%@ page import="java.util.ArrayList" %>
<%@ page import="model.person" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 6/8/17
  Time: 1:41 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1">
    <tr>
        <td>ID</td>
        <td>NAME</td>
    </tr>
    <%
        ArrayList<person> personTOs = (ArrayList<person>) request.getAttribute("list");
        for (person personTO : personTOs) {
    %>
    <tr>
        <td><%=personTO.getName()%>
        </td>
        <td><%=personTO.getFmaily()%>
        </td>
        <td><%=personTO.getId()%></td>
    </tr>
    <%
        }
    %>
    <br>
    <a href="index.jsp">main page</a>
</table>
</body>
</html>
