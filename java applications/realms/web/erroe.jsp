<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 2/6/18
  Time: 2:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.*" %>
<%@ page import="java.util.Enumeration" %>
<html>
<head>
    <title>error</title>
</head>
<body bgcolor="#ffe4c4">
<%
    String error=(String) request.getSession().getAttribute("error");
%>
<center><h1><%= error%></h1></center>


</body>
</html>
