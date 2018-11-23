<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${action}" method="POST">
    Name:&nbsp&nbsp&nbsp
    <input type="text" name="name" value=""/>
    <br><br>
    Surname:
    <input type="text" name="surname" value=""/>
    <br><br>
    Phone:&nbsp&nbsp
    <input type="text" name="phone" value=""/>
    <br><br>
    Card:&nbsp&nbsp&nbsp
    <input type="text" name="cardNumber" value=""/>
    <br><br>
    <input type="submit" name="ok" value="send"/>

</form>
</body>
</html>
