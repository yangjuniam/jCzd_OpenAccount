<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<title>${param.title }</title>
<script type="text/javascript" src="http://libs.baidu.com/jquery/1.7.0/jquery.min.js"></script>
<link rel="stylesheet" href="/static/css/main.css" type="text/css"
	media="all" />
</head>
<body>
	<div class="head">
		<div class="content" style="position: relative;">
			<div class="logo" onclick="javascript:window.location.href='/';"
				style="cursor: pointer;"></div>
			<div
				style="width: 300px; height: 100px; line-height: 14px; position: absolute; right: 0; top: 0;">
				<%-- <c:choose>
					<c:when test="${not empty user}">
						<p style="text-align:right;">
							欢迎光临 ${user.userName },<a href="http://www.51czd.com/logout.php"
								style="color: blue;">退出登录</a>
						</p>
					</c:when>
					<c:otherwise>
						<p style="text-align:right;">
							已有财之道会员账号,立即<a href="http://www.51czd.com/login.php"
								style="color: blue;">登录</a>
						</p>
					</c:otherwise>
				</c:choose> --%>
			</div>
		</div>
	</div>