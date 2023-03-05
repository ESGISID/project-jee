<%@ page import="esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity" %>
<%@ page import="esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersPersistenceService" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: savon
  Date: 05/03/2023
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User listing</title>
</head>
<body>
<%
    List<UsersEntity> usersEntityList = UsersPersistenceService.getAllUsers();
%>
<ul>
<% for (UsersEntity usersEntity : usersEntityList) { %>
    <li><%=usersEntity.getUsername()%> <%=usersEntity.getUsername()%></li>
<% }%>
</ul>


</body>
</html>
