<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp"%>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-管理平台登录" name="title" />
</jsp:include>
<jsp:include page="/WEB-INF/jsp/common/_admin_menu.jsp">
	<jsp:param value="sim" name="type" />
</jsp:include>
<div class="container">
	<h1>模拟盘开户账号管理</h1>
	<div class="search">
		<form action="/admin/sim/list" method="get">
			<input type="text" class="width300 text" autocomplete="off"
				name="phone" placeholder="根据手机号码或者客户名称搜索"> <input
				type="submit" value="搜索" class="submitter" />
		</form>
	</div>
	<table width="100%" cellspacing="0" cellpadding="0" class="accountList">
		<tr>
			<th>交易账号</th>
			<th>客户姓名</th>
			<th>手机号码</th>
			<th>证件号码</th>
			<th>户籍地址</th>
			<th>居间代码</th>
			<th>机构代码</th>
			<th>开户状态</th>
		</tr>
		<c:forEach items="${customerList }" var="customer">
			<tr>
				<td>${customer.customerNo }</td>
				<td>${customer.customerName }</td>
				<td>${customer.phone }</td>
				<td>${customer.papersNum }</td>
				<td>${customer.province }-${customer.city }-${customer.area }</td>
				<td>${customer.brokerageNo }</td>
				<td>${customer.organizationNo }</td>
				<td><b>${customer.status==true?'<span style="color:green;">已开户</span>':'<span style="color:red;">未开户</span>' }</b></td>
			</tr>
		</c:forEach>
	</table>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp" />