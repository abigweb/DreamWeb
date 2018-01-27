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
    用户管理
</h2>
<table width="100%" border="1">
    <tr>
        <th>编号</th>
        <th>姓名</th>
        <th>地址</th>
        <th>电话</th>
        <th>操作</th>
    </tr>
    <c:forEach items="${list}" var="user">
        <tr>
            <td>${user.id}</td>
            <td>${user.name}</td>
            <td>${user.address}</td>
            <td>${user.phone}</td>
            <td>
                <a href="delete/${user.id}" class="del">删除</a> |
                <a href="edit/${user.id}">修改</a></td>
        </tr>
    </c:forEach>
</table>
<p>
    <a href="add">新增</a>
</p>
<script>
    var items = document.querySelectorAll(".del");
    for (var i = 0; i < items.length; i++) {
        items[i].onclick = function () {
            return confirm("您确认要删除吗？");
        }
    }
</script>
</body>
</html>