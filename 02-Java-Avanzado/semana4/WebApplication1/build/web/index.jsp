<%-- 
    Document   : index
    Created on : 13 ene 2025, 15:54:52
    Author     : zoro_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer JS=</title>
    </head>
    <body>
        <% String nombre = "Ariadna";
        %>
        <% for (int i = 0; i < 5; i++) {
        %>
        <h1>Hola desde JSP! <%=nombre%></h1>
        <%
            }
        %>
    </body>
</html>
