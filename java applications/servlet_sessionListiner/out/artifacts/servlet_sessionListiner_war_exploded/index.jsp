<%@ page import="conf.sessionListiner" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 7/7/17
  Time: 7:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  online <%=sessionListiner.getOnline()%><br>
  visited <%=sessionListiner.getVisited()%>
  </body>
</html>
