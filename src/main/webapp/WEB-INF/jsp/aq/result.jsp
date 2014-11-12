<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp"%>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-接口调用结果页面" name="title" />
</jsp:include>
<jsp:include page="/WEB-INF/jsp/common/_menu.jsp">
	<jsp:param value="aq" name="type" />
</jsp:include>
<div class="container">
	<c:choose>
		<c:when test="${registerResult.resultCode==1 && registerResult.resultBankCode==1}">
			<div class="success" style="height:auto;line-height:22px;margin:50px auto;">
				<h1 style="line-height:normal;">开户成功</h1>
				<div class="result">
					<p>请您记录自己的实盘交易账号与密码</p>
					<p>
						<span>交易账号:</span><strong>${registerResult.customer.customerNo }</strong>
					</p>
					<p>
						<span>交易密码:</span><strong>${registerResult.customer.tradePWD }</strong>
					</p>
					<p>
						<span>电话密码:</span><strong>${registerResult.customer.phonePWD }</strong>
					</p>
				</div>
			</div>
		</c:when>
		<c:when test="${registerResult.resultCode==-999999}">
			<div class="doing">
				<h1 class="doing"></h1>
				<div class="result">
					<p>
						<strong style="margin-left:0;"><app:getResultCodeStr
								index="${registerResult.resultCode}" /></strong>
					</p>
				</div>
			</div>
		</c:when>
		<c:otherwise>
			<div class="failed">
				<h1 class="failed"></h1>
				<div class="result">
					<p>请根据开户失败返回的结果编码联系管理员处理</p>
					<p>
						<span>开户编码:</span><strong>${registerResult.resultCode} <app:getResultCodeStr
								index="${registerResult.resultCode}" /></strong>
					</p>
					<p>
						<span>银行编码:</span><strong>${registerResult.resultBankCode }
							<app:getResultBankCodeStr
								index="${registerResult.resultBankCode}" />
						</strong>
					</p>
				</div>
			</div>
		</c:otherwise>
	</c:choose>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp" />
<script type="text/javascript">
	
</script>
