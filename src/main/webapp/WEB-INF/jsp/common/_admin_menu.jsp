<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<jsp:include page="_includes.jsp"/>
<div class="menu">
	<div class="item leftItem ${param.type=='aq'?'current':'' }"><a href="/admin/aq" class="center">实盘开户账号管理</a></div>
	<div class="item rightItem ${param.type=='sim'?'current':'' }"><a href="/admin/sim" class="center">模拟盘开户账号管理</a></div>
	<div class="clearfix"></div>
</div>