<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="/views/Headers.jsp"/>
<div style="margin: auto; padding: 25px 25px 25px 25px" class="container; text-center">
	<jsp:include page="/HelloWorld.jsp"/>
</div>
<div style="margin: auto; padding: 25px 25px 25px 25px" class="container; text-center">

<p>
<%= request.getAttribute("message") != null ? request.getAttribute("message"):"" %>
</p>
<a href="${pageContext.request.contextPath}/hello-servlet">request to sevlet hello-servlet -> add 2 users in persistence -> says Hello</a>
</div>

<br/>
</body>
</html>