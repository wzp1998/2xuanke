<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/1/23 0023
  Time: 9:25
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
    <style>
        table{
            border:1px solid aqua;
        }
        td{
            background-color:#8E8E8E;
        }
        .tr1 td{
            background-color: #00bfff;
        }
    </style>
    <script >
        function adminDel(userId)
        {
            if(confirm('您确定删除吗？'))
            {
                window.location.href="/adminController/deleteAdmin?userid="+userId;
            }
        }
        <c:if test="${deltriumph != null} ">
        alert("删除失败");
        </c:if>
        <c:if test="${delfailure != null} ">
        alert("删除成功");
        </c:if>
    </script>
    <%--<c:if test="${deltriumph !=null}">
        <script type="text/javascript">
            alert("删除成功");
        </script>
    </c:if>
    <c:if test="${delfailure !=null}">
        <script type="text/javascript">
            alert("删除失败");
        </script>
    </c:if>--%>
</head>
<body leftmargin="2" topmargin="9" background='/img/allbg.gif'>

<table width="98%" border="0"  align="center" style="margin-top:8px" >
    <tr class="tr1">
        <td>用户名</td>
        <td>密码</td>
        <td>操作</td>
    </tr>
    <c:choose>
        <c:when test="${adminList ==null}">
            <%
               response.sendRedirect("/adminController/managementAdmin");
            %>
        </c:when>
        <c:otherwise>
            <c:forEach var="admin" items="${adminList}">
                <tr>
                    <td>${admin.username}</td>
                    <td>${admin.userpw}</td>
                    <td><input type="button" value="删除" onclick="adminDel(${admin.userid})"></td>
                </tr>
            </c:forEach>
        </c:otherwise>
    </c:choose>

</table>
<form>
    <a href="/admin/userinfo/AddAdmin.jsp"><input type="button" value="添加"></a>
</form>
</body>
</html>
