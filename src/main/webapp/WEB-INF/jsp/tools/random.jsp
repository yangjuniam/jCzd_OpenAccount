<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-开户错误" name="title"/>
</jsp:include>
<div class="container">
	<input type="button" value="获得随机数" id="but"/><br/><br/>
	<span id="rt"></span><br/><br/><br/><br/>
	<input type="button" value="复制到剪切板" id="copy"/>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>
<script type="text/javascript">
	
	$("#but").click(function(){
		var rt = parseInt(Math.random()*100000000) ;
		while(rt < 10000000){
			rt = rt * 10 + parseInt(Math.random() * 10);
		}
		$("#rt").html(rt);
	});
	$("#copy").click(function(){
		var data = $("#rt").html();
        window.clipboardData.setData("text",data);
	 	alert("复制成功!"); 
	});
</script>