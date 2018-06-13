<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 7/11/17
  Time: 7:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#5f9ea0">
<%
    String ans=(String) request.getSession().getAttribute("ans");
    String ans1=(String) request.getSession().getAttribute("ans1");
%>
<center><h1><%=ans%></h1></center><br>
<center><img src='<%=ans1%>' height="300" width="400"></center>
<applet class="arrow-button">

</applet>
</body>
</html>
