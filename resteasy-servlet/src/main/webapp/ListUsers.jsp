<%@ page import="esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity" %>
<%@ page import="esgi.arlo.arjas.jerseyservlet.persistence.adaters.UsersPersistenceService" %>
<%@ page import="java.util.List" %>
<jsp:include page="/views/Headers.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: savon
  Date: 05/03/2023
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<div style="margin: auto; padding: 25px 25px 25px 25px" class="container; text-center">
	<ul class="list-group" style="margin: auto;max-width: 300px" class="container;">
		<%
			if (request.getAttribute("foundUsers") != null) {
				for (UsersEntity usersEntity : (List<UsersEntity>) request.getAttribute("foundUsers")) { %>
		<li class="list-group-item">
			<%=usersEntity.getUsername()%> <%=usersEntity.getUsername()%>
		</li>
		<%
				}
			}
		%>
	</ul>
</div>


