<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 5/28/17
  Time: 12:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="webserv.person"   %>
<%@ page import="javax.swing.text.Document" %>
<%@ page import="javax.ws.rs.core.Request" %>
<%@ page import="com.sun.jersey.api.representation.Form" %>
<%@ page import="javax.swing.plaf.basic.BasicInternalFrameTitlePane" %>

<!doctype html>
<html>
<head>
  <script>
    function ont()
    {
      window.open("https://www.google.com");
    }

  </script>
  <title>this is the saeed site</title>
  <link rel="stylesheet" href="saeed.css">
  <script>
    function test1()
    {
      var str=document.getElementById("na").value;
      var str2=document.getElementById("fa").value;
      var str3=document.getElementById("id").value;
      document.getElementById("txt").value=str;
      document.getElementById("txt1").value=str2;
      document.getElementById("txt2").value=str3;
      <%
        person person=new person();
        String name=request.getParameter("nam");
        person.setName(name);
        String fnamee ;
        fnamee = request.getParameter("fnam");
        person.setFamily(fnamee);
        person.setAge(55);
      %>
      document.getElementById("txt111").innerHTML=<%= person.getName()%>;
              document.getElementById("txt222").innerHTML=<%= person.getFamily()%>;
                      document.getElementById("txt333").innerHTML=<%= person.getAge()%>;


    }

  </script>
</head>
<body>

<h1> welcome to main controler</h1>
<hr>
<br><br>
<p class="sa">  this page is contain information about the person by adding the inforamtion about the person you can
find the how much is employee salary so lets start</p>
<br><br>

<fieldset>
  <legend>personal inforamtion</legend>
  <form id="myform">
    first name :<br>
    <input type="text" name="nam" value="" autofocus id="na"/><br>
    last name :<br>
    <input type="text" name="fnam" value=""  id="fa"/><br>
    age :<br>
    <input type="number" name="age" id="id"  /><br>
    <br>
    <input type="button" onclick="test1()" value="submit" >&nbsp;&nbsp;
    <input type="reset"/><br>
    <br><br>
    <p id="ss"></p>
  </form>
</fieldset>
<br>
<fieldset>
  <legend>output info</legend>
  <form>
    your name is : &nbsp;
    <input type="text" id="txt" value="" readonly /><br>
    your family is : &nbsp;
    <input type="text" id="txt1" value="" readonly/><br>
    age is : &nbsp;
    <input type="text" id="txt2" value="" readonly/>
    <br><hr>
  </form>
</fieldset>
<br>
<fieldset>
  <legend>jsp info</legend>
  <form> your name is : &nbsp;
    <input type="text" id="txt11" readonly ><br>
    your family is : &nbsp;
    <input type="text" id="txt22" readonly><br>
    age is : &nbsp;
    <input type="text" id="txt33" readonly>
    <br><hr></form>
</fieldset>
<br><hr>
your name is :
<p id="txt111"></p><br>
your family is :
<p id="txt222"></p><br>
your age is :
<p id="txt333"></p><br>
<br><hr>
<%
person p1=new person();
  p1.setName("reyhaneh");
  p1.setFamily("tavana");
  p1.setAge(23);
%>
<table border="3">
  <tr>
    <th>name</th>
    <th>family</th>
    <th>age</th>
  </tr>
  <tr>
  <td>saeed</td>
  <td>tavana</td>
  <td>22</td>
  </tr>
  <tr>
  <td><%= p1.getName()%></td>
  <td><%= p1.getFamily()%></td>
  <td><%= p1.getAge()%></td>
  </tr>
</table>
<br>
<%
  out.println("<hr><br>");
%>

<button onclick="javascript:ont()">second page</button>
</body>
</html>