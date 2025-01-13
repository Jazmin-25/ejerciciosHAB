<%-- 
    Document   : index
    Created on : 13 ene 2025, 16:50:21
    Author     : zoro_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cálculo de la suma de números</title>
    </head>
    <body>
        <%
        int suma = 0;
        for (int i = 1; i <= 10; i++) {
            suma += i;
        }
    %>
    <h1>La suma de los números del 1 al 10 es: <%= suma %></h1>
    </body>
</html>
