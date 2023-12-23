<%-- 
    Document   : form
    Created on : 21 Dec, 2023, 7:13:11 PM
    Author     : developer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
        <form action="submit.htm" method="post">
            Name : <input type="text" name="name" /> <br>
            Age : <input type="number" name="age" /> <br>
            <input type="submit" value="Submit">
            <input type="reset" value="Clear">
        </form>
    </body>
</html>
