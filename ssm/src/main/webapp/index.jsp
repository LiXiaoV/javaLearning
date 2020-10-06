<%--
  Created by IntelliJ IDEA.
  User: xiaov
  Date: 2020/9/29
  Time: 1:07 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <a href="/account/findAll">测试查询</a>

    <h3>测试查询</h3>
    <form action="/account/save" method="post">
        姓名：<input type="text" name="name" />
        金额：<input type="text" name="money" />
        <input type="submit" value="保存" />
    </form>
</body>
</html>
