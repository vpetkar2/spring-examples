<%-- 
    Document   : student
    Created on : 20 Dec, 2023, 7:27:48 PM
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
        <h1>Student Detail</h1>
        <table cellpadding="10px">
            <tr>
                <td>Name</td>
                <td>:</td>
                <td>${student.name}</td>
            </tr>
            <tr>
                <td>Roll No</td>
                <td>:</td>
                <td>${student.rollno}</td>
            </tr>
            <tr>
                <td>Physics</td>
                <td>:</td>
                <td>${student.physics}</td>
            </tr>
            <tr>
                <td>Chemistry</td>
                <td>:</td>
                <td>${student.chemistry}</td>
            </tr>
            <tr>
                <td>Maths</td>
                <td>:</td>
                <td>${student.maths}</td>
            </tr>
            <tr>
                <td>Total</td>
                <td>:</td>
                <td>${student.total}</td>
            </tr>
            <tr>
                <td>Percentage</td>
                <td>:</td>
                <td>${student.percentage}</td>
            </tr>
        </table>
    </body>
</html>
