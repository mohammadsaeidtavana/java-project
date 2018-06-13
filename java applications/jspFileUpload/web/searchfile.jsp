<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 5/16/18
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>search file</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <style>
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
<body bgcolor="#faebd7"><br>
<center>
    <h1>search files</h1>
</center><br>
<center>
    <img src="search.png" height="100" width="100" style="border-radius: 30px"><br><br>
</center>
<center>
<fieldset style="width: 600px">
<legend align="center">&nbsp;search file with name &nbsp;</legend><br>
    <form action="/seachFile" method="post">
        <label> file name  :</label>&nbsp;&nbsp;
        <input type="text" name="nameOFfile" value=" " placeholder="please enter file name">
        <br><br>
        <input type="submit" value="seach">
    </form>

</fieldset>
    <br>
    <fieldset style="width: 600px">
        <legend align="center">&nbsp;search file with type &nbsp;</legend><br>
        <form action="/seachFileExtention" method="post">
            <label> file type  :</label>&nbsp;&nbsp;
            <select name="typee">
                <option value=".pdf">pdf</option>
                <option value=".jpg">jpg</option>
                <option value=".jpeg">jpeg</option>
                <option value=".docx">docx</option>
                <option value=".pptx">pptx</option>
                <option value=".mov">mov</option>
                <option value=".mp4">mp4</option>
                <option value=".png">png</option>
                <option value="dir">directory</option>
            </select>
            <br><br>
            <input type="submit" value="seach">
        </form>

    </fieldset>
    <br>
    <br>
    <form action="index.jsp">

        <input type="submit" value="Back main page">
    </form>
</center>
</body>
</html>
