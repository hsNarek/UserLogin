<%@ page import="database.model.User" %><%--
  Created by IntelliJ IDEA.
  User: narekmuradyan
  Date: 27.02.22
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link href="css/registerStyle.css" rel="stylesheet">
</head>
<body>
<div>
    <div class="logreg">
        <a href="/">Login </a> | <a href="/register">Register</a>
    </div>


    <h1>Welcome </h1>
    <div class="agileits-top">
        <form action="/register" method="post">

            <h2> Name: <%= request.getAttribute("username")%>
            </h2><br>
            <h2> Surname: <%= request.getAttribute("surname")%>
            </h2><br>
            <h2> Age: <%= request.getAttribute("age")%>
            </h2><br>
            <h2> Email: <%= request.getAttribute("email")%>
            </h2>


        </form>
        <ul class="colorlib-bubbles">
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
            <li></li>
        </ul>

    </div>


</div>

</body>
</html>
