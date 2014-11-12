<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp"%>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-模拟盘开户" name="title" />
</jsp:include>
<jsp:include page="/WEB-INF/jsp/common/_menu.jsp">
	<jsp:param value="sim" name="type" />
</jsp:include>
<div class="container">
	<h1>
		模拟盘开户-填写开户表单
	<%-- 	<c:if test="${empty user }">
			<a href="http://www.51czd.com/login.php"
				style="float: right; font-size: 12px; font-weight: normal; text-decoration: none;">已有账号，直接登录开户</a>
		</c:if> --%>
		
		<c:if test="${empty simCustomer }">
			<a href="/simLogin"
				style="float: right; font-size: 12px; font-weight: normal; text-decoration: none;">已有账号，直接登录开户</a>
		</c:if>
	</h1>
	<form id="form1" action="/sim/result" method="post">
		<div id="valida_container" class="valida_container"></div>
		<table width="100%" cellspacing="0" cellpadding="0">
			<tr>
				<th colspan="2">必填内容<span class="required-icon">*</span></th>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<!-- <tr>
			<td class="label">交易账号<span class="required">*</span></td>
			<td><input type="text" value="" class="width200 text" name="customerNo" placeholder="请输入交易账号"/>
				<span class="comment">15位数字且不含空格</span></td>
		</tr> -->
			<tr>
				<td class="label">手机号码：</td>
				<td><input type="text" value="" class="width200 text"
					name="phone" placeholder="请输入电话号码" /> <span class="comment">只能输入11位数字</span>
				</td>
			</tr>
			<tr>
				<td class="label">验证码：</td>
				<td><input type="text" value="" class="width200 text"
					name="veriCode" placeholder="请输入您获得的4位验证码" /> <input type="button"
					value="发送验证码" class="veriCode" name="sendCode"><span
					class="sendStatus"></span></td>
			</tr>
			<tr>
				<td class="label">客户姓名：</td>
				<td><input type="text" value="" class="width130 text"
					name="customerName" placeholder="请输入客户姓名" /></td>
			</tr>
			<tr>
				<td class="label">证件类型：</td>
				<td><select name="papersType">
						<option value="2">身份证</option>
						<!-- <option value="1">机构代码</option>
										<option value="3">护照</option>	
										<option value="4">营业执照</option>	 -->
				</select> <span class="comment">目前只支持身份证</span></td>
			</tr>
			<tr>
				<td class="label">证件号码：</td>
				<td><input type="text" value="" class="width200 text"
					name="papersNum" placeholder="请输入证件号码" /> <span class="comment">18周岁以上才允许注册，18位且不含空格</span></td>
			</tr>
			<!-- 		<tr><td>性别<span class="required">*</span></td><td>
							 <label><input type="radio" value="0" name="gender"/>男</label>
							 <label><input type="radio" value="1" name="gender"/>女</label></td></tr> -->
			<tr>
				<td class="label">户籍地址：</td>
				<td><select name="province"><option value="" seleted>请选择</option>
				</select> <select name="city"><option value="" seleted>请选择</option>
				</select> <select name="area"><option value="" seleted>请选择</option>
				</select></td>
			</tr>
			<tr>
				<td class="label">交易密码：</td>
				<td><span name="tradePWD_container"><input type="password" value="" class="width200 text"
					name="tradePWD" placeholder="请输入交易密码" /></span> <input type="button" for="tradePWD" class="showPassword veriCode" value="显示密码"/> <span class="comment">6至16位任意字母或数字且不含空格</span></td>
			</tr>
			<tr>
				<td class="label">电话密码：</td>
				<td><span name="phonePWD_container"><input type="password" value="" class="width200 text"
					name="phonePWD" placeholder="请输入电话密码" /></span><input type="button" for="phonePWD" class="showPassword veriCode" value="显示密码"/> <span class="comment">6至16位数字且不含空格</span></td>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<th colspan="2">选填内容</th>
			</tr>
			<tr>
				<td colspan="2"></td>
			</tr>
			<tr>
				<td class="label">传真：</td>
				<td><input type="text" value="" class="width200 text"
					name="fax" placeholder="请输入传真" /></td>
			</tr>
			<tr>
				<td class="label">邮政编码：</td>
				<td><input type="text" value="" class="width200 text"
					name="postcode" placeholder="请输入邮编" /> <span class="comment">6位数字且不含空格</span></td>
			</tr>
			<tr>
				<td class="label">电子邮箱：</td>
				<td><input type="text" value="" class="width200 text"
					name="email" placeholder="请输入电子邮箱" /> <span class="comment">正常邮箱格式，且长度小于50位</span></td>
			</tr>
			<tr>
				<td class="label">地址：</td>
				<td><input type="text" value="" class="width200 text"
					name="address" placeholder="请输入联系地址" /></td>
			</tr>
			<tr>
				<td class="label">客户代码：</td>
				<td><input type="text" value="" class="width200 text"
					name="brokerageNo" placeholder="请输入客户代码" /></td>
			</tr>
			<tr>
				<td class="label">机构代码：</td>
				<td><input type="text" value="" class="width200 text"
					name="organizationNo" placeholder="请输入机构代码" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					class="submitter" class="text" value="确定模拟盘开盘"></td>
			</tr>
		</table>
	</form>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp" />
<script type="text/javascript" src="/static/js/city.js"></script>
<script src="/static/valida/js/jquery.validate.js"></script>
<script src="/static/valida/js/validas.js"></script>
<script type="text/javascript">
	$.validator.setDefaults({
		submitHandler : function(form) {
			$('[name=papersNum]').val($('[name=papersNum]').val().toUpperCase());
			form.submit();
		}
	});

	var timestamp = 120;
	var interval;
	$('[name=sendCode]').bind('click', function() {
		if (!/^1[3|5|8]\d{9}$/i.test($('[name=phone]').val())) {
			alert('请先输入您正确的手机号码');
		} else {
			$.post('/sendSimVeriCode', {
				mobilePhone : $('[name=phone]').val()
			}, function(data) {
				if (data.status == 'fail') {
					alert(data.message);
				} else {
					$('[name=sendCode]').attr('disabled', "true");
					interval = setInterval(function() {
						timestamp--;
						if (timestamp <= 0) {
							clearInterval(interval);
							$('.sendStatus').html('');
							$('[name=sendCode]').removeAttr('disabled');
							timestamp = 120;
						} else {
							$('.sendStatus').html(timestamp + '秒后重新发送');
						}
					}, 1000);
				}
			});
		}
	});

	$(function() {
		var errorContainer = $('#valida_container');
		var vali = $("#form1").validate({
			errorClass : "valida_error",
			validClass : "valida_valid",
			groups : {
				nativePlace : 'province city area'
			},
			rules : {//每个验证对象的验证规则
				phone : {
					required : true,
					mobilePhone : true,
					remote : {
						type : "POST",
						url : "/simCheckExist",
						dateType : "json",
						data : {
							phone : function() {
								return $('[name=phone]').val();
							}
						},
						dataFilter : function(data) {
							data = eval('(' + data + ')');
							if (data.status == 'fail') {
								return "false";
							} else {
								return "true";
							}
						}
					}
				},
				customerName : {
					required : true,
					minlength : 2,
					chineseChar : true
				},
				papersNum : {
					required : true,
					identifyCode : true
				},
				province : {
					nativePlaceGroup : {
						pattern : /.+/i
					}
				},
				city : {
					nativePlaceGroup : {
						pattern : /.+/i
					}
				},
				area : {
					nativePlaceGroup : {
						pattern : /.+/i
					}
				},
				tradePWD : {
					required : true,
					minlength : 6,
					maxlength : 16
				},
				phonePWD : {
					required : true,
					digits:true,
					minlength : 6,
					maxlength : 16
				},
				email : {
					email : true
				},
				fax : {
					number : true
				},
				postcode : {
					digits : true,
					maxlength : 6,
					minlength : 6
				},
				veriCode : {
					digits : true,
					required : true,
					minlength : 4,
					maxlength : 4
				}
			},
			messages : {//自定义每个验证对象的错误信息
				phone : {
					required : '手机号码不能为空',
					mobilePhone : '请填写正确的手机号码',
					remote : '您注册的手机号码已注册，请联系管理员'
				},
				customerName : {
					required : '客户姓名不能为空',
					minlength : '客户姓名最少2个字',
					chineseChar : '客户姓名必须是中文'
				},
				papersNum : {
					required : '身份证号码不能为空',
					identifyCode : '18周岁以上才允许注册，18位且不含空格'
				},
				province : {
					required : '户籍地址-省份必须选择'
				},
				city : {
					required : '户籍地址-城市必须选择'
				},
				area : {
					required : '户籍地址-地区必须选择'
				},
				tradePWD : {
					required : '交易密码必须填写',
					minlength : '交易密码最少6位字母或数字且不含空格',
					maxlength : '交易密码最多16位字母或数字且不含空格'
				},
				phonePWD : {
					required : '电话密码必须填写',
					digits : '电话密码必须为不包含空格的数字',
					minlength : '电话密码最少6位数字',
					maxlength : '电话密码最多16位数字'
				},
				email : {
					email : '电子邮箱地址错误'
				},
				fax : {
					number : '传真格式错误'
				},
				postcode : {
					digits : '邮编必须为数字',
					minlength : '邮编最少6位数字',
					maxlength : '邮编最多6位数字'
				},
				veriCode : {
					digits : '验证码的格式为4位数字',
					minlength : '验证码的格式为4位数字',
					maxlength : '验证码的格式为4位数字',
					required : '验证码必须填写'
				}
			},
			wrapper : 'a'//在错误信息外包裹一层标签
		});
		enhanceValidator("#form1", "#valida_container");
		
		$('.showPassword').unbind('click').bind('click',function(){
			var targetName = $(this).attr('for');
			var temp = $('[name='+targetName+']').val();
			var nstr;
			if($('[name='+targetName+']').attr('type') == 'password'){
				$('[name='+targetName+'_container]').empty();
				$('[name='+targetName+'_container]').append('<INPUT class="width200 text valida_error" value="'+temp+'" type="text" name="'+targetName+'" placeholder="请输入密码">');
			   // nstr = $('[name='+targetName+']').parent().html().replace('type=password','type="text"').replace('type="password"','type="text"');
				$(this).val('隐藏密码');
			}else{
				$('[name='+targetName+'_container]').empty();
				$('[name='+targetName+'_container]').append('<INPUT class="width200 text valida_error" value="'+temp+'" type="password" name="'+targetName+'" placeholder="请输入密码">');
				//nstr = $('[name='+targetName+']').parent().html().replace('type=text','type="password"').replace('type="text"','type="password"');
				$(this).val('显示密码');
			}
			//$('[name='+targetName+'_container]').html(nstr);
			$('[name='+targetName+']').val(temp);
		});
	});
</script>