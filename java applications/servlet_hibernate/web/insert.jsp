<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 6/9/2017
  Time: 11:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body bgcolor="#5f9ea0">
<h1><center>insert person</center></h1>
<form action="/insertp">
    name:&nbsp
    <input type="texte" name="name"><br>
    family:
    <input type="text" name="family"><br>
    age:
    <input type="text" name="age"><br>
    comments :
    <input type="text" name="com"><br>
    <br>
    <input type="submit" value="insert">
    <br><hr>
    book name :
    <input type="text" name="bookname"><br>
    book price :
    <input type="text" name="price">
    <br>

</form>
<br><hr>
<center><a href="index.jsp"> main page</a></center>
</body>
</html>
