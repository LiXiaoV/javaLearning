<%--
  Created by IntelliJ IDEA.
  User: xiaov
  Date: 2020/9/29
  Time: 1:03 上午
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h3>查询了所有账户信息</h3>
    <c:forEach items="${list}" var="account">
        ${account.name}
    </c:forEach>
</body>
</html>
