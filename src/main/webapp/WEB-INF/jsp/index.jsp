<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
<jsp:param value="财之道-开户-实盘开户-模拟盘开户" name="title"/>
</jsp:include>
<div class="container">
	<div style="width:80%; margin:20px auto;">
		<h1>请选择开户类型</h1>
		<c:choose>
			<c:when test="${aqCustomer.status }"><div class="largeMenu">您已完成实盘开户</div></c:when>
			<c:otherwise><a href="/aq" class="largeMenu">实盘开户</a></c:otherwise>
		</c:choose>
		<c:choose>
			<c:when test="${simCustomer.status }"><div class="largeMenu">您已完成模拟盘开户</div></c:when>
			<c:otherwise><a href="/sim" class="largeMenu">模拟盘开户</a></c:otherwise>
		</c:choose>
	</div>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>
