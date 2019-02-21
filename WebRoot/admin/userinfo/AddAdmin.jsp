<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/23 0023
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="pragma" content="no-cache" />
    <meta http-equiv="cache-control" content="no-cache" />
    <meta http-equiv="expires" content="0" />
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3" />
    <meta http-equiv="description" content="This is my page" />

    <link rel="stylesheet" type="text/css" href="/css/base.css" />
    <title>Title</title>
    <c:if test="${triumph !=null}">
        <script type="text/javascript">
            alert("添加失败");
        </script>
    </c:if>
</head>
<body leftmargin="2" topmargin="9" background='/img/allbg.gif'>
<form method="post" action="/adminController/insertAdminPwd" name="formPw">
    <table width="98%" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" style="margin-top:8px">
        <tr bgcolor="#E7E7E7">
            <td height="14" colspan="3" background="/img/tbg.gif">&nbsp;添加账号&nbsp;</td>

        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="25%" bgcolor="#FFFFFF" align="right">
                登录名：
            </td>
            <td width="75%" bgcolor="#FFFFFF">
                <input type="text"  name="username" size="20"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="25%" bgcolor="#FFFFFF" align="right">
                密码：
            </td>
            <td width="75%" bgcolor="#FFFFFF">
                <input type="password" id="userpw" name="userpw" size="22"/>
            </td>
        </tr>
        <tr bgcolor="#FFFFFF">
            <td width="25%" bgcolor="#FFFFFF" align="right">
                &nbsp;
            </td>
            <td width="75%" bgcolor="#FFFFFF">
                <input type="submit" value="添加"/>
                &nbsp;&nbsp;&nbsp;
                <input type="reset" value="重置"/>
                <img id="indicator" src="/img/loading.gif" alt="Loading..." style="display:none"/>
            </td>
        </tr>
    </table>
</form>

</body>
</html>
