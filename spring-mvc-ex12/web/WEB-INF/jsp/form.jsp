<%-- 
    Document   : form
    Created on : 23 Dec, 2023, 7:13:40 PM
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
        <form method="post" action="data/validate.htm">
            Username : <input type="text" name="username">
            Password : <input type="text" name="password">
            <input type="submit" value="Login">
            <input type="reset" value="Clear">
        </form>
    </body>
</html>
