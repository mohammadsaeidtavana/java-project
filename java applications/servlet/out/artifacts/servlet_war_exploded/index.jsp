<%@ page import="controler.session_listnerr" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 6/7/17
  Time: 7:58 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body bgcolor="aqua">

  <p> hello </p><br>
  <a href="one.jsp">user register</a>
  <a href="get.do"> see user list</a>

  <br><hr>
  <%=session_listnerr.getOnline()%><br>
  <%=session_listnerr.getVisited()%>

  </body>
</html>
