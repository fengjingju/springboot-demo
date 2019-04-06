<%--
  Created by IntelliJ IDEA.
  User: fengjingju
  Date: 2019/4/6
  Time: 14:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>


<form action="/admin/login" method="post">
    用户名：<input type="text" name="userName">
    密码：<input type="password" name="password">
    <button>登录</button>
    <span style="color: red;">${loginError}</span>
</form>

<form action="/admin/regist" method="post">
    用户名：<input type="text" name="userName">
    密码：<input type="password" name="password">
    <button>注册</button>
    <span style="color: red;">${registError}</span>
</form>
</body>
</html>
