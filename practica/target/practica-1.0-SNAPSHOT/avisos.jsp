<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="com.emergentes.modelo.Aviso"%>
<%@page import="java.util.List"%>
<%
    List<Aviso> posts = (List<Aviso>)request.getAttribute("posts");
    %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <h1> Blog de Tecnologia</h1>
        <h6>Autor: Cesar David Aspi Sonco</h6>
        </center>
   
        <p align="right"><a href="AvisoControler?action=add">Nuevo entrada</a></p>
 
        <table>
            
            <c:forEach var="item" items="${posts}">
                <tr>
                  
                <h6>${item.id}</h6>
                
               
                <h2>${item.titulo}</h2>
             
              
                <h5>Fecha:${item.fecha}</h5>
                
               
                <h4>${item.contenido}</h4>
              
                
                
                <p  align="right"><a href="AvisoControler?action=edit&id=${item.id}">Editar</a>
                    <a href="AvisoControler?action=delete&id=${item.id}">Eliminar</a>
                </p>
              
                
            
            
                
            <h1>____________________________________________</h1>
                
            </c:forEach>
           
        </table>
    </body>
</html>
