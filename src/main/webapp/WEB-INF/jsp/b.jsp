<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/jsp/common/_includes.jsp" %>
<jsp:include page="/WEB-INF/jsp/common/_head.jsp">
	<jsp:param value="财之道-开户错误" name="title"/>
</jsp:include>
<div class="container">
<div id="flashContent"> 
	         <script type="text/javascript"> 
	             var pageHost = ((document.location.protocol == "https:") ? "https://" : "http://"); 
	             document.write("<a href='http://www.adobe.com/go/getflashplayer'><img src='" 
	                             + pageHost + "www.adobe.com/images/shared/download_buttons/get_flash_player.gif' alt='Get Adobe Flash player' /></a>" ); 
	         </script> 
	     </div>
</div>
<jsp:include page="/WEB-INF/jsp/common/_foot.jsp"/>
<script type="text/javascript" src="/static/scripts/swfobject.js"></script>
<script type="text/javascript">
var timestamp = new Date().getTime();
var phone = '18621807761';
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
      	
       window.setTimeout(function(){$('.pos_rel').removeClass('hide');}, 1500);
  window.setTimeout(function(){$('.submitter').removeClass('disableMenu');}, 180*1000);
  function newSubmit(){
	  if($('.submitter').hasClass('disableMenu')){
		  alert('系统检测到您还未完成视频录制，请继续完成录制再进行下一步');
		  return false;
	  }else{
		  var st = new Date().getTime() - timestamp;
		  if(st < 180*1000){
			  alert('系统检测到您还未完成视频录制，请继续完成录制再进行下一步');
			  return false;
		  }else{
	  		  return true;
		  }
	  }
  }
</script>