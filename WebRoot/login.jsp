<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统 by www.mycodes.net</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->

</style>
<link href="<%=path %>/css/css.css" rel="stylesheet" type="text/css" />
<script src="<%=path %>/js/jquery-1.8.2.js"></script>
<script type="text/javascript">
$(function (){
	$("#change").click(function(){
		$("#yzmimg").attr("src","user/yzm.do?v="+Math.random());
	});
});
	
</script>
</head>

<body>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="147" background="<%=path %>/images/top02.gif"><img src="images/top03.gif" width="776" height="147" /></td>
  </tr>
</table>
<table width="562" border="0" align="center" cellpadding="0" cellspacing="0" class="right-table03">
  <tr>
    <td width="221"><table width="95%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
      
      <tr>
        <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
          <tr>
            <td align="center"><img src="<%=path %>/images/ico13.gif" width="107" height="97" /></td>
          </tr>
          <tr>
            <td height="40" align="center">&nbsp;</td>
          </tr>
          
        </table></td>
        <td><img src="<%=path %>/images/line01.gif" width="5" height="292" /></td>
      </tr>
    </table></td>
    
    <td>
    <form action="user/login.do" method="post">
    <table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="31%" height="35" class="login-text02">用户名称：<br /></td>
        <td width="69%"><input name="username" type="text" size="30" /></td>
      </tr>
      <tr>
        <td height="35" class="login-text02">密　码：<br /></td>
        <td><input name="password" type="password" size="33" /></td>
      </tr>
      <tr>
        <td height="35" class="login-text02">验证图片：<br /></td>
        <td><img id="yzmimg" src="user/yzm.do" width="109" height="40" /> <a id="change" class="login-text03">看不清楚，换张图片</a></td>
      </tr>
      <tr>
        <td height="35" class="login-text02">请输入验证码：</td>
        <td><input name="code" type="text" size="30" /></td>
      </tr>
      <tr>
        <td height="35">&nbsp;</td>
        <td><input name="Submit2" type="submit" class="right-button01" value="确认登陆"/>
          <input name="Submit232" type="reset" class="right-button02" value="重 置" />
          	${sessionScope.err }
          </td>
      </tr>
    </table>
    </form>
    </td>
    
  </tr>
</table>
</body>
</html>