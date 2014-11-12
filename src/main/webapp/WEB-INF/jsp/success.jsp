<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-开户错误" name="title"/>
</jsp:include>
<div class="container">
	<div class="success">${msg }</div>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>