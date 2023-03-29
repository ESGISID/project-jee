<%@ page import="esgi.arlo.arjas.resteasy.jee.servlet.domain.pojos.Users" %>
<jsp:include page="/views/Headers.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: savon
  Date: 05/03/2023
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<div style="margin: auto; padding: 25px 25px 25px 25px" class="container; text-center">
    <%
      if (request.getAttribute("foundUser") != null) {
      final Users found = (Users) request.getAttribute("foundUser");
         %>
    <div class="card text-white bg-dark" style="width: 18rem;margin:auto;top:35px">
      <div class="card-header">
        <%= found.getUsername()%>
      </div>
      <div class="card-body">
        <h5 class="card-title"><%= found.getValue() %></h5>
        <p class="card-text"><%= found.getSomeCode() %></p>
      </div>
    </div>
    <%
    }
    %>
</div>
