<%@ page import="esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersEntity" %>
<%@ page import="esgi.arlo.arjas.jerseyservlet.persistence.entities.UsersPersistenceService" %>
<%@ page import="java.util.List" %>
<jsp:include page="/views/Headers.jsp"/>
<%--
  Created by IntelliJ IDEA.
  User: savon
  Date: 05/03/2023
  Time: 12:23
  To change this template use File | Settings | File Templates.
--%>
<ul>
	<%
		if (request.getAttribute("foundUsers") != null) {
			for (UsersEntity usersEntity : (List<UsersEntity>) request.getAttribute("foundUsers")) { %>
	<li><%=usersEntity.getUsername()%> <%=usersEntity.getUsername()%>
	</li>
	<%
			}
		}
	%>
</ul>


