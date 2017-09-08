<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>项目管理系统 by www.mycodes.net</title>
<script type="text/javascript" src="<%=path%>/js/jquery-1.8.2.js"></script>
<script type="text/javascript" src="<%=path%>/js/aRoleinfo.js"></script>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}

.tabfont01 {
	font-family: "宋体";
	font-size: 9px;
	color: #555555;
	text-decoration: none;
	text-align: center;
}

.font051 {
	font-family: "宋体";
	font-size: 12px;
	color: #333333;
	text-decoration: none;
	line-height: 20px;
}

.font201 {
	font-family: "宋体";
	font-size: 12px;
	color: #FF0000;
	text-decoration: none;
}

.button {
	font-family: "宋体";
	font-size: 14px;
	height: 37px;
}

html {
	overflow-x: auto;
	overflow-y: auto;
	border: 0;
}
-->
</style>

<link href="../css/css.css" rel="stylesheet" type="text/css" />
<script type="text/JavaScript">
	
</script>
<link href="../css/style.css" rel="stylesheet" type="text/css" />

</head>


<body>
	<c:if test="${not empty requestScope.userId}">
		<form name="fom" id="fom" method="post">
			<input type="text" name="userId" value="${requestScope.userId}"><br/>
			<input type="text" name="roleinfoId" value="${requestScope.roleinfoId}"/><br/>
			<input type="text" name="name" value="${requestScope.name }"/><br/>
			 <input type="text" name="roledesc" value="${requestScope.roledesc}"/><br/>
			<input type="submit" value="提交"/>
		</form>
	</c:if>
	<table width="100%" border="0" cellspacing="0" cellpadding="0">

		<tr>
			<td height="40" class="font42"><table width="100%" border="0"
					cellpadding="4" cellspacing="1" bgcolor="#464646" class="newfont03">

					<tr>
						<td height="20" colspan="15" align="center" bgcolor="#EEEEEE"
							class="tablestyle_title">
							&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							角色管理 &nbsp;</td>
					</tr>
					<tr>
						<td width="6%" align="center" bgcolor="#EEEEEE">角色名称</td>
						<td width="9%" height="20" align="center" bgcolor="#EEEEEE">角色说明</td>
						<td width="9%" align="center" bgcolor="#EEEEEE">修改</td>
						<td width="9%" align="center" bgcolor="#EEEEEE">删除</td>
						<td width="9%" align="center" bgcolor="#EEEEEE">分配角色权限</td>
					</tr>
					<c:forEach items="${sessionScope.roleinfoList}" var="v">
						<tr>
							<td>${v.USERNAME}</td>
							<td>${v.ROLEDESC}</td>
							<td><a href="../ARoleinfoController/updateInfo/${v.USERID}.do?id=${v.ROLEID}&name=${v.USERNAME}&roledesc=${v.ROLEDESC}">修改</a></td>
							<td><a href="">删除</a></td>
							<td><a href="">分配权限</a></td>
						</tr>
					</c:forEach>
123213



				</table></td>
		</tr>
	</table>
	</td>
	</tr>
	</table>
	<table width="95%" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="6"><img src="../images/spacer.gif" width="1"
				height="1" /></td>
		</tr>
		<tr>
			<td height="33"><table width="100%" border="0" align="center"
					cellpadding="0" cellspacing="0" class="right-font08">
					<tr>
						<td width="50%">共 <span class="right-text09">5</span> 页 | 第 <span
							class="right-text09">1</span> 页
						</td>
						<td width="49%" align="right">[<a href="#"
							class="right-font08">首页</a> | <a href="#" class="right-font08">上一页</a>
							| <a href="#" class="right-font08">下一页</a> | <a href="#"
							class="right-font08">末页</a>] 转至：
						</td>
						<td width="1%"><table width="20" border="0" cellspacing="0"
								cellpadding="0">
								<tr>
									<td width="1%"><input name="textfield3" type="text"
										class="right-textfield03" size="1" /></td>
									<td width="87%"><input name="Submit23222" type="submit"
										class="right-button06" value=" " /></td>
								</tr>
							</table></td>
					</tr>
				</table></td>
		</tr>
	</table>
	</td>
	</tr>
	</table>
</body>
</html>
