<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="jndi.getinformation" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 2/6/18
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>jndi</title>
</head>
<body>
<%

    //Context context = new InitialContext();
    //DataSource dataSource= (DataSource) context.lookup("java:comp/env/jdbc/mydatabasesaeed");
    Connection connection=getinformation.get().getConnection();
    PreparedStatement preparedStatement= connection.prepareStatement("SELECT  * FROM food ");
    ResultSet resultSet=preparedStatement.executeQuery();
    while (resultSet.next())
    {
        out.print(resultSet.getString("name")+"   "+resultSet.getString("id")+"   "+resultSet.getString("price")+" "+
                resultSet.getString("code"));
        out.print("<br>");
    }
   Thread.sleep(10000);
    preparedStatement.close();
    connection.close();
%>

</body>
</html>
