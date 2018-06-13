<%--
  Created by IntelliJ IDEA.
  User: saeedtavana
  Date: 6/25/17
  Time: 2:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>java mail </title>
  </head >
  <body bgcolor="#add8e6">
  <center><h1>sending email in java </h1></center><br>
  <center> <img src="picture/g.jpg" height="200" width="400"></center><br>
  <p>this project is the simple send mail project which is used in many
  transactional system such as EHRs or other systems . i used java mail api and
  java Activation framework to send and recive email in this project . in this
  page we will see architecture of java mail apt which contains 2 part
  first part is java mail API , this part is platform independent and second part is
   server protocol layer(spi) this part is communicate with SMTP (simple mail transfer protocol)
  we can use many SMTP such as gmail . i used gmail smtp in this project . also this project has ip filtering methods
   to prevent spesific ip to access resourcess</p><br>
  <center><img src="picture/12.png" height="180" width="180"></center><br>
  <center><h2>this is  the architecture of java mail API</h2></center><br>
  <center><img src="picture/Javamail1.jpg" width="500" height="400"></center><br><br>
  <hr size="3" align="center"><br>
  <fieldset>
    <legend align="center"> send mail using Gmail </legend>
    <form action="/sendmail">
      <br>
      TO : &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
      <input type="text" name="to"> &nbsp;&nbsp;
      <select name="host">
        <option selected>gmail.com</option>
        <option>yahoo.com</option>
        <option>hotmail.com</option>
        <option>icloud.com</option>
      </select>
      <br><br>
      Subject :&nbsp;&nbsp;
      <input type="text" name="subject"><br><br>
      message :&nbsp;&nbsp;<br>
      <textarea rows="20" cols="100" name="message"></textarea><br><br>
      <center>
        <input type="submit" value="send mail ">&nbsp;&nbsp;
        <input type="reset" value="cancel"><br>
      </center>

    </form>
  </fieldset>
  <hr>



  </body>
</html>
