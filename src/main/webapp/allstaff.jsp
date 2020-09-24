<%--
  Created by IntelliJ IDEA.
  User: ASUS
  Date: 2020/9/25
  Time: 0:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'allUser.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
    <script type="text/javascript" src="js/jquery-1.7.1.js"></script>
    <script type="text/javascript">
        function del(id){
            $.get("<%=basePath%>user/delUser?id="+id,function(data){
                if("success"==data.result){
                    alert("删除成功");
                    window.location.reload();
                }else{alert("删除失败");}
            });
        }
    </script>
</head>

<body>
<h6><a href="<%=basePath%>user/toAddUser">添加用户</a></h6>
<table border="1">
    <tbody>
    <tr>
        <th>id</th>
        <th>账号</th>
        <th>密码</th>
        <th>操作</th>
    </tr>
    <c:if test="${!empty userList}">
        <c:forEach items="${userList}" var="user">
            <tr>
                <td>${user.id}</td>
                <td>${user.username}</td>
                <td>${user.password}</td>
                <td>
                    <a href="<%=basePath%>user/getUser?id=${user.id}">编辑</a>
                    <a href="javascript:del('${user.id}')">删除</a>
                </td>
            </tr>
        </c:forEach>
    </c:if>
    </tbody>
</table>
</body>
</html>
