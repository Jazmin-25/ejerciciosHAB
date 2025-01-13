<%-- 
    Document   : index
    Created on : 13 ene 2025, 16:43:53
    Author     : zoro_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tabla de Multiplicar del 5 </title>
    </head>
    <body>
        <h1>Muestra la tabla de multiplicar del 5</h1>
        <%
        for (int i = 1; i <= 10; i++) {
            int resultado = 5 * i; 
    %>
        <p>5 x <%= i %> = <%= resultado %></p>
    <%
        }
    %>
    </body>
</html>
