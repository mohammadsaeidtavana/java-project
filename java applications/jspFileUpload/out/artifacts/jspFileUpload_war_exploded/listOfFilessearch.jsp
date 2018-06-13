<%@ page import="java.net.Inet4Address" %>
<%@ page import="java.util.List" %>
<%@ page import="java.io.File" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 5/16/18
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>My upload center</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style>
        .card {
            box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
            transition: 0.3s;
            width:40%;
            display: block
        }

        .card:hover {
            box-shadow: 0 8px 16px 0 rgba(0,0,0,0.2);
        }

        .container {

        }
        ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;

        }

        li {
            float: left;
        }

        li a {
            display: block;

            text-align: center;
            padding: 16px;
            text-decoration: none;
        }

        li a:hover {

        }
        input[type=submit] {
            width: 50%;
            background-color: #4CAF50;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: #45a049;
        }
    </style>
</head>
<body bgcolor="#faebd7">
<br>
<center><h1>M.SAEED TAVANA Upload center </h1></center>
<br>
<center>
    <img src="view.jpeg" height="100" width="100" style="border-radius: 50px"><br>
</center>
<center>
    <fieldset style="width: 1200px">
        <legend ALIGN="center">&nbsp;Uploaded file &nbsp;</legend>
        <ul>
        <%
            Inet4Address inet4Address= (Inet4Address) Inet4Address.getLocalHost();
            String path="http://"+inet4Address.getHostAddress()+":8082/images/my/uploadcenter"+ File.separator;
            List<String> list= (List<String>) request.getSession().getAttribute("listfilesearch");
        %>
        <%
            for (String name:list) {


        %>
            <li>
             <a href='<%=path+name%>' target="_blank" ><img src="file.png" width="60" height="80"></a><br>
                <center><%=" / "+name%></center>
            </li>

        <%
            }
        %>
        </ul>
    </fieldset>
    <br>
    <form action="index.jsp">

        <input type="submit" value="Back main page">
    </form>
</center>



</body>
</html>
