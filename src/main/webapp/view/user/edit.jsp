<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>用户管理</title>
</head>
<body>
<h2>
    修改用户
</h2>
<form method="post" action="../edit">
    <fieldset>
        <legend>用户信息</legend>
        <p>
            <label for="id">编号：</label>
            <input name="id" id="id" type="text" required="required" readonly="readonly" maxlength="32" value="${user.id}"/>
        </p>
        <p>
            <label for="name">姓名：</label>
            <input name="name" id="name" type="text" required="required" maxlength="32" value="${user.name}"/>
        </p>
        <p>
            <label for="address">地址：</label>
            <input name="address" id="address" type="text" required="required" maxlength="128" value="${user.address}"/>
        </p>
        <p>
            <label for="phone">电话：</label>
            <input name="phone" id="phone" type="text" required="required" maxlength="11" value="${user.phone}"/>
        </p>
        <p>
            <button>提交</button>
        </p>
    </fieldset>
</form>
<a href="index">列表</a>
</body>
</html>