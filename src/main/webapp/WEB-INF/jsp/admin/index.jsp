<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
<jsp:param value="财之道-开户账号管理" name="title"/>
</jsp:include>
<div class="container">
	<div style="width:80%; margin:20px auto;">
		<h1>开户管理-请选择开户类型</h1>
		<a href="/admin/aq" class="largeMenu">实盘开户管理</a>
		<a href="/admin/sim" class="largeMenu">模拟盘开户管理</a>
	</div>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>
