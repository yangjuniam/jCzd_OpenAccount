<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-管理平台登录" name="title"/>
</jsp:include>
<div class="container">
	<div class="loginForm">
		<div class='loginTitle'>
			管理账号登录
		</div>
		<div class="loginContent">
			<form action="/admin/login" method="post" >
				<div class="loginInput">
					<span class="icon pwd">&nbsp;</span>
					<input type="password" name="adminPass" value="" class="text" placeholder="登录密码">
					<div class="clearfix"></div>
				</div>
				<input type="submit"  class="submitter" style="width:100%;" value="登录">
				<div style="color:red; font-size:12px;font-weight:bold;">${msg }</div>
			</form>
		</div>
	</div>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>