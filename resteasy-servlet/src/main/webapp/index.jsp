<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<jsp:include page="/views/Headers.jsp"/>
<div style="margin: auto; padding: 25px 25px 25px 25px" class="container">
	<jsp:include page="/HelloWorld.jsp"/>
</div>
<a href="${pageContext.request.contextPath}/hello-servlet">request to sevlet hello-servlet -> add 2 users in persistence -> display users</a>

<br/>
</body>
</html>