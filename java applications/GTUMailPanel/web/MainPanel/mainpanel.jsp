<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 3/22/18
  Time: 6:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 3/1/18
  Time: 6:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>sms / mail pannel</title>
    <link rel="stylesheet" href="universal.css">
    <link rel="icon" href="https://cdn2.iconfinder.com/data/icons/flatte-social-networks-part-1/80/14_-_SMS-512.png">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <style type="text/css">
        div.tab {
            overflow: hidden;
            justify-content: center;
        }
        div.tabcontent{
            display: none;
        }
        body{
            background: url(../picture/bg.jpg) no-repeat center center fixed;
            -webkit-background-size: cover;
            -moz-background-size: cover;
            -o-background-size: cover;
            background-size: cover;
        }
    </style>
</head>
<script type="text/javascript">
    function opent(evt, Name) {
        if (Name == "Doctor"){
            document.body.style.backgroundImage = "url(../picture/bg.jpg)";
        }else{
            document.body.style.backgroundImage = "url(../picture/bg1.jpg)";
        }
        // Declare all variables
        var i, tabcontent, tablinks;

        // Get all elements with class="tabcontent" and hide them
        tabcontent = document.getElementsByClassName("tabcontent");
        for (i = 0; i < tabcontent.length; i++) {
            tabcontent[i].style.display = "none";
        }

        // Get all elements with class="tablinks" and remove the class "active"
        tablinks = document.getElementsByClassName("tablinks");
        for (i = 0; i < tablinks.length; i++) {
            tablinks[i].className = tablinks[i].className.replace(" active", "");
        }

        // Show the current tab, and add an "active" class to the button that opened the tab
        document.getElementById(Name).style.display = "block";
        evt.currentTarget.className += " active";
    }
    function checkvalid()
    {
        var user=document.forms["myForm"]["user"].value;
        var pass=document.forms["myForm"]["pass"].value;
        if(user =="" || pass == "")
        {
            alert("warning \nusername or password must not empty ...")
            return false;
        }

    }
    function checkvalid1()
    {
        var user=document.forms["myForm1"]["user2"].value;
        var pass=document.forms["myForm1"]["pass2"].value;
        if(user =="" || pass == "")
        {
            alert("warning \nusername or password must not empty ...")
            return false;
        }

    }
</script>
<body onload="opent(event, 'Doctor')">
<header>
    <div class="container">
        <h1><a href="#">Announcement Panel </a>&nbsp;<a href="../index.jsp">LogOut</a></h1>
    </div>
</header>
<div class="tab" id="menu">
    <input type="submit" value="SMS" onclick="opent(event, 'Doctor')" class="tablinks">
    <input type="submit" value="Mail" onclick="opent(event, 'Nurse')" class="tablinks">
</div>
<div id="Doctor" class="tabcontent">

</div>
<div id="Nurse" class="tabcontent">

</div>

</body>
</html>
