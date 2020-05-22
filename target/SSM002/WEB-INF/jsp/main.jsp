<%--
  Created by IntelliJ IDEA.
  User: 黄璐
  Date: 2020/5/21
  Time: 8:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    主界面<br>
    <c:if test="${activeName==null}">
        <a href="/toLogin">亲，请先登录</a>
    </c:if>
    <c:if test="${activeName!=null}">
        <a href="#">${activeName}</a>
    </c:if>&nbsp;
    <a href="/toMy">我的淘宝</a>&nbsp;&nbsp;&nbsp;<a href="/toCar">购物车 </a>
</body>
</html>
