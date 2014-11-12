<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-实盘开户-录制视频" name="title"/>
</jsp:include>
<jsp:include page="/WEB-INF/jsp/common/_menu.jsp">
	<jsp:param value="aq" name="type"/>
</jsp:include>
<!-- <script type="text/javascript" src="/static/scripts/swfobject.js"></script>
<script type="text/javascript">
var timestamp = new Date().getTime();
var phone = '${regCustomer.phone}';
        // For version detection, set to min. required Flash Player version, or 0 (or 0.0.0), for no version detection. 
        var swfVersionStr = "0.0.0";
        // To use express install, set to playerProductInstall.swf, otherwise the empty string. 
        var xiSwfUrlStr = "";
        var flashvars = {};
        flashvars.mediaName = Math.random();
        flashvars.recordFolder = phone;
        flashvars.fileName = phone;
        flashvars.rootURL = "http://114.80.224.9:8500/media/record/"+phone;
        var params = {};
        params.quality = "high";
        params.bgcolor = "#ffffff";
        params.allowscriptaccess = "sameDomain";
        params.allowfullscreen = "true";
        var attributes = {};
        attributes.id = "RTMPRecorder";
        attributes.name = "RTMPRecorder";
        attributes.align = "middle";
        flashvars.config = "/static/scripts/config.xml";
        flashvars.enableWatchTime = 5000;
        //flashvars.debug = 1;
        swfobject.embedSWF(
            "/static/scripts/RTMPRecorder.swf", "flashContent", 
            "640", "345", 
            swfVersionStr, xiSwfUrlStr, 
            flashvars, params, attributes);
        // JavaScript enabled so display the flashContent div in case it is not replaced with a swf object.
        swfobject.createCSS("#flashContent", "display:block;text-align:center;");
      	
 
</script> -->
<div class="container">
	<div style="text-align: center; vertical-align: middle;padding:25px;color:green;font-size:18px;">
		实盘注册正在提交...
	</div>
	<!-- <h2>为保障投资者投资权益，交易所要求客户录制开户视频，在录制之前，您需要先观看银大贵金属开户须知视频，了解相关风险提示。</h2>
	<div style="position:relative;height:350px;width:700px;margin:25px auto;">
		<div id="flashContent"> 
	         <script type="text/javascript"> 
	             var pageHost = ((document.location.protocol == "https:") ? "https://" : "http://"); 
	             document.write("<a href='http://www.adobe.com/go/getflashplayer'><img src='" 
	                             + pageHost + "www.adobe.com/images/shared/download_buttons/get_flash_player.gif' alt='Get Adobe Flash player' /></a>" ); 
	         </script> 
	     </div>
	     <div class="pos_rel hide"> <span class="icon1"></span>
      	 <div class="square"><p class="important">请务必要先阅读这里!</p>
      	 <p>1、我们一共将录制三段视频</p>
      	 <p>2、根据视频提示，每段视频录制完毕通过点击左边的“下一步”进入下一段视频录制</p>
      	 <p>3、目前已经有<b style="color:red;">1237人</b>因为没有认真阅读这里而导致开户失败</p></div></div> 
	</div>
	<form action="/aq/result" method="post" style="text-align:center;">
		<input type="submit" class="submitter disableMenu" onclick="return newSubmit();" value="点击完成实盘开户">		
	</form> -->
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>
<!-- <script type="text/javascript">
window.setTimeout(function(){$('.pos_rel').removeClass('hide');}, 1500);
window.setTimeout(function(){$('.submitter').removeClass('disableMenu');}, 100*1000);
function newSubmit(){
	  if($('.submitter').hasClass('disableMenu')){
		  alert('系统检测到您还未完成视频录制，请继续完成录制再进行下一步');
		  return false;
	  }else{
		  var st = new Date().getTime() - timestamp;
		  if(st < 100*1000){
			  alert('系统检测到您还未完成视频录制，请继续完成录制再进行下一步');
			  return false;
		  }else{
	  		  return true;
		  }
	  }
}
</script> -->
<form action="/aq/result" id="form1" method="post" style="text-align:center;">
</form> 
<script type="text/javascript">
window.setTimeout(function(){$('#form1').submit();}, 3500);
</script>
