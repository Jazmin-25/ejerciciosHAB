<%-- 
    Document   : NumerosPares
    Created on : 13 ene 2025, 16:33:57
    Author     : zoro_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NumerosPares</title>
    </head>
    <body>
        <h1>Muestra los primeros 10 números pares </h1>
        <%
        for (int i = 1; i <= 10; i++) {
            int numeroPar = i * 2; 
    %>
        <h2>Número par: <%= numeroPar %></h2>
    <%
        }
    %>
    </body>
</html>
