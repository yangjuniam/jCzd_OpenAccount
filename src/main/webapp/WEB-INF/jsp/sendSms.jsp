<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp"%>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-短信发送" name="title" />
</jsp:include>
<div class="container">
	<form action="/sendSms" method="post">
		<table cellspacing="0" cellpadding="0" width="100">
			<tr>
				<td>手机号码：<input type="text" value="" name="mobile" style="width:400px"/></td>
			</tr>
			<tr>
				<td>短信内容：<textarea name="content"  style="width:500px; height:300px;"></textarea></td>
			</tr>
			<tr>
				<td><input type="submit" value="发送短信" /></td>
			</tr>
		</table>
	</form>
	<c:if test="${not empty result }">
		<h5>短信发送结果： ${result }</h5>
	</c:if>


</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp" />