<%@ page import="javax.naming.Context" %>
<%@ page import="javax.naming.InitialContext" %>
<%@ page import="javax.sql.DataSource" %>
<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %>
<%@ page import="java.sql.ResultSet" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 2/6/18
  Time: 1:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
  <head>
    <title>java realms example </title>
  </head>
  <body bgcolor="#a9a9a9">
  <h1 align="center">java authentication with realm </h1>
  <br><br>
  <p><b>programmer : mohammad saeid tavana </b>
    <br><b>project : checking user authentication with realm and mysql database </b>
  </p>
  <br><hr>
  <br>
  <fieldset >
    <legend align="left">login to system </legend>
    <center>
      <br>
      <form action="/checkUser">
        username : &nbsp;<input type="text" name="user">
        password : &nbsp;<input type="text" name="password">
        <br><br>
        <input type="submit" value="enter ">&nbsp;<input type="reset"><br>
        <br>
      </form>
    </center>
  </fieldset>
  <center><form action="/getsessioon">
    <input type="submit" value="get session values" />
  </form></center>
  <center><p>all right reserved to &copy; mohammad saeid tavana</p></center>

<a href="two.jsp">click me </a>
  </body>
</html>
