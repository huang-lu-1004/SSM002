<%--
  Created by IntelliJ IDEA.
  User: 黄璐
  Date: 2020/5/21
  Time: 8:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>登录</title>
    <script type="text/javascript" src="../../js/jquery-1.11.0.min.js"></script>
    <script>
        $(function () {
            $("#b1").on("click",function () {
                var error='';
                var flag=true;
                var username=$("#uname").val();
                var password=$("#password").val();
                if (username==''||username==undefined){
                    error="用户名不能为空!";
                    flag=false;
                }
                if (password==''||password==undefined){
                    error="密码不能为空!";
                    flag=false;
                }
                if (flag==true&&error==''){
                    $("#formId").submit();
                }else {
                    alert(error);
                    return;
                }
            });
        });
    </script>
</head>
<body>
    <h1>登录</h1>
    <p style="color: red">${errorMsg}</p>
    <form:form method="post" action="/doLogin" modelAttribute="user">
        用户名：<form:input path="uname" id="uname"></form:input><br>
        &nbsp;&nbsp;&nbsp;密码：<form:password path="password" id="password"></form:password><br>
        <input type="submit" value="提交" id="b1">
    </form:form>
</body>
</html>
