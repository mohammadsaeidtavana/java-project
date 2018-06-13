<%@ page import="java.net.Inet4Address" %><%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 5/11/18
  Time: 11:32 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>saeed upload center</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
      input[type=text], select {
        width: 100%;
        padding: 12px 20px;
        margin: 8px 0;
        display: inline-block;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
      }

      input[type=submit] {
        width: 70%;
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

      div {
        border-radius: 5px;
        background-color: #f2f2f2;
        padding: 20px;
      }
    </style>
  </head>
  <body bgcolor="#87cefa">
  <center><h3>Saeed Upload Center</h3></center>
  <br>
  <%
    Inet4Address inet4Address= (Inet4Address) Inet4Address.getLocalHost();
    String path="http://"+inet4Address.getHostAddress()+":"+request.getServerPort()+"/images/my/uploadcenter/";
  %>
  <center><img src='<%=path+"saeed.jpg"%>'   width="175px"/></center>
  <br>
  <center>
  <fieldset style="width: 500px">
    <legend align="center">&nbsp;select file &nbsp;</legend>
    <br>

  Select a file to upload: <br /><br>

    <center><img src="upload.png" width="100" height="100" style="border-radius: 50px" ></center>
    <br>
  <form action = "/uploadfile" method = "post" enctype="multipart/form-data">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<input type = "file" name = "file" size = "50" />
    <br /><br>
    <input type = "submit" value = "Upload File" />
  </form>
    <br>
  </fieldset >
  </center>
  <br>
  <center>
  <fieldset style="width: 500px">
    <legend align="center">&nbsp;View Files &nbsp;</legend>
    <br>
    <form action="/getlist">
      <input type="submit" value="View list of Uploaded file">
    </form>

    <form action="/searchfile.jsp">
      <input type="submit" value="Search among  Uploaded file">
    </form>


   <br>
  </fieldset>
    <br>
    <h2>All Right Reserved TO &copy;Mohammad Saeid Tavana</h2>
  </center>
<br>

  </body>
</html>
