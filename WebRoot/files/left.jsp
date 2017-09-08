<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>项目管理系统 by www.mycodes.net</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
	background-image: url(../images/left.gif);
}
-->
</style>
<link href="../css/css.css" rel="stylesheet" type="text/css" />
<script type="text/javascript" src="<%=path %>/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="<%=path %>/js/aLeft.js"></script>
</head>
<SCRIPT language=JavaScript>
function tupian(idt){
    var nametu="xiaotu"+idt;
    var tp = document.getElementById(nametu);
    tp.src="../images/ico05.gif";//图片ico04为白色的正方形
	
	for(var i=1;i<30;i++)
	{
	  
	  var nametu2="xiaotu"+i;
	  if(i!=idt*1)
	  {
	    var tp2=document.getElementById('xiaotu'+i);
		if(tp2!=undefined)
	    {tp2.src="../images/ico06.gif";}//图片ico06为蓝色的正方形
	  }
	}
}

function list(idstr){
	var name1="subtree"+idstr;
	var name2="img"+idstr;
	var objectobj=document.all(name1);
	var imgobj=document.all(name2);
	
	
	//alert(imgobj);
	
	if(objectobj.style.display=="none"){
		for(i=1;i<10;i++){
			var name3="img"+i;
			var name="subtree"+i;
			var o=document.all(name);
			if(o!=undefined){
				o.style.display="none";
				var image=document.all(name3);
				//alert(image);
				image.src="../images/ico04.gif";
			}
		}
		objectobj.style.display="";
		imgobj.src="../images/ico03.gif";
	}
	else{
		objectobj.style.display="none";
		imgobj.src="../images/ico04.gif";
	}
}

</SCRIPT>

<body>
<table width="198" border="0" cellpadding="0" cellspacing="0" class="left-table01">
  <tr>
    <TD>
		<table width="100%" border="0" cellpadding="0" cellspacing="0">
		  <tr>
			<td width="207" height="55" background="../images/nav01.gif">
				<table width="90%" border="0" align="center" cellpadding="0" cellspacing="0">
				  <tr>
					<td width="25%" rowspan="2"><img src="../images/ico02.gif" width="35" height="35" /></td>
					<td width="75%" height="22" class="left-font01">您好，<span class="left-font02">${sessionScope.user.USERNAME }</span></td>
				  </tr>
				  <tr>
					<td height="22" class="left-font01">
						[&nbsp;<a href="<%=path %>/login.jsp" target="_top" class="left-font01">退出</a>&nbsp;]</td>
				  </tr>
				</table>
			</td>
		  </tr>
		</table>
		


		<!--  人事管理开始    -->
		<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img8" id="img8" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%" class="title">
								<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('8');" >人事管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
		<table id="subtree8" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" 
				cellspacing="0" class="left-table02">
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu20" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="addrenwu.htm" target="mainFrame" class="left-font03" onClick="tupian('20');">机构信息</a></td>
				</tr>
				<tr>
				  <td width="9%" height="21" ><img id="xiaotu21" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="listrenwu.htm" target="mainFrame" class="left-font03" onClick="tupian('21');">部门信息</a></td>
				</tr>
				<tr>
				  <td width="9%" height="21" ><img id="xiaotu21" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="listrenwu.htm" target="mainFrame" class="left-font03" onClick="tupian('21');">员工管理</a></td>
				</tr>
      </table>
		<!--  人事管理结束    -->

		

		<!--  日程管理开始    -->
		<TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img7" id="img7" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%" class="title">
								<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('7');" >日程管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
		<table id="subtree7" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" 
				cellspacing="0" class="left-table02">
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu17" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%">
						<a href="sendxiaoxi.htm" target="mainFrame" class="left-font03" onClick="tupian('17');">我的日程</a></td>
				</tr>
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu18" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%">
					<a href="listtakexiaoxi.htm" target="mainFrame" class="left-font03" onClick="tupian('18');">部门日程</a></td>
				</tr>
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu19" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%">
						<a href="listsendxiaoxi.htm" target="mainFrame" class="left-font03" onClick="tupian('19');">我的便签
							</a></td>
				</tr>
      </table>
		<!--  日程管理结束    -->


		<!--  文档管理开始    -->
        <TABLE width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29">
				<table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
					<tr>
						<td width="8%"><img name="img1" id="img1" src="../images/ico04.gif" width="8" height="11" /></td>
						<td width="92%" class="title">
								<a href="javascript:" target="mainFrame" class="left-font03" onClick="list('1');" >文档管理</a></td>
					</tr>
				</table>
			</td>
          </tr>		  
        </TABLE>
		<table id="subtree1" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" 
				cellspacing="0" class="left-table02">
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu1" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="listxiangmuxinxi.htm" target="mainFrame" class="left-font03" onClick="tupian('1');">文档管理</a></td>
				</tr>
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu4" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="listjihua.htm" target="mainFrame" class="left-font03" onClick="tupian('4');">回收站</a></td>
				</tr>
				<tr>
				  <td width="9%" height="20" ><img id="xiaotu2" src="../images/ico06.gif" width="8" height="12" /></td>
				  <td width="91%"><a href="listxuqiu.htm" target="mainFrame" class="left-font03" onClick="tupian('2');">文件搜索</a></td>
				</tr>
				
      </table>
		<!--  文档管理结束    -->

	  <!--  消息传递开始    -->
	  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29"><table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="8%" height="12"><img name="img2" id="img2" src="../images/ico04.gif" width="8" height="11" /></td>
                  <td width="92%" class="title">
                  <a href="javascript:" target="mainFrame" class="left-font03" onClick="list('2');" >消息传递</a></td>
                </tr>
            </table></td>
          </tr>
      </table>
	  
	  <table id="subtree2" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
        
		<tr>
          <td width="9%" height="20" ><img id="xiaotu7" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="listkehuxinxi.html" target="mainFrame" class="left-font03" onClick="tupian('7');">消息管理</a></td>
        </tr>
        
        <tr>
          <td width="9%" height="20" ><img id="xiaotu7" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="listkehuxinxi.html" target="mainFrame" class="left-font03" onClick="tupian('7');">信箱</a></td>
        </tr>
      </table>

	  <!--  消息传递结束    -->

	  <!--  系统管理开始    -->
	  <table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29"><table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="8%" height="12"><img name="img3" id="img3" src="../images/ico04.gif" width="8" height="11" /></td>
                  <td width="92%" class="title"><a href="javascript:" target="mainFrame" class="left-font03" onClick="list('3');" >系统管理</a></td>
                </tr>
            </table></td>
          </tr>
      </table>
	  
	  <table id="subtree3" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
        <tr>
          <td width="9%" height="20" ><img id="xiaotu8" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="../ARoleinfoController/roleinfo.do" target="mainFrame" class="left-font03" >角色管理</a></td>
        </tr>
		<tr>
          <td width="9%" height="20" ><img id="xiaotu9" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="../aLoginlogContorller/show.do" target="mainFrame" class="left-font03" onClick="tupian('9');">登录日志</a></td>
        </tr>
		<tr>
          <td width="9%" height="20" ><img id="xiaotu10" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="../operatelogController/show.do" target="mainFrame" class="left-font03" onClick="tupian('10');">操作日志</a></td>
        </tr>
        
        <tr>
          <td width="9%" height="20" ><img id="xiaotu10" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="<%=path%>/files/aw/tree.jsp" target="mainFrame" class="left-font03" onClick="tupian('10');">菜单排序</a></td>
        </tr>
      </table>
	
	  <!--  系统管理结束    -->

	   <!--  考勤系统开始    -->
	   <table width="100%" border="0" cellpadding="0" cellspacing="0" class="left-table03">
          <tr>
            <td height="29"><table width="85%" border="0" align="center" cellpadding="0" cellspacing="0">
                <tr>
                  <td width="8%" height="12"><img name="img4" id="img4" src="../images/ico04.gif" width="8" height="11" /></td>
                  <td width="92%" class="title"><a href="javascript:" target="mainFrame" class="left-font03" onClick="list('4');" >考勤系统</a></td>
                </tr>
            </table></td>
          </tr>
      </table>
	  
	  <table id="subtree4" style="DISPLAY: none" width="80%" border="0" align="center" cellpadding="0" cellspacing="0" class="left-table02">
		<tr>
          <td width="9%" height="20" ><img id="xiaotu11" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="listGongZiType.htm" target="mainFrame" class="left-font03" onClick="tupian('11');">员工签到,签退</a></td>
        </tr>
	  	<tr>
          <td width="9%" height="20" ><img id="xiaotu12" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="listMonthYuanGongGongZi.htm" target="mainFrame" class="left-font03" onClick="tupian('12');">考勤历史查询</a></td>
        </tr>
        
        <tr>
          <td width="9%" height="20" ><img id="xiaotu12" src="../images/ico06.gif" width="8" height="12" /></td>
          <td width="91%"><a href="listMonthYuanGongGongZi.htm" target="mainFrame" class="left-font03" onClick="tupian('12');">考勤统计</a></td>
        </tr>
      </table>

      <!--  考勤系统结束    -->

	  </TD>
  </tr>
  
</table>
</body>
</html>
