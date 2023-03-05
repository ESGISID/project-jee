<%@ page import="java.util.List" %>
<%@ page import="esgi.arlo.arjas.jerseyservlet.domain.pojos.Users" %>
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
				for (Users user : (List<Users>) request.getAttribute("foundUsers")) { %>
		<li class="list-group-item">
			<%=user.getUsername()%> <%=user.getUsername()%>
		</li>
		<%
				}
			}
		%>
	</ul>
</div>


