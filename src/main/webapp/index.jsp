<%--
  Created by IntelliJ IDEA.
  User: SuTao
  Date: 2020/11/4
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
  pageContext.setAttribute("ctx", request.getContextPath());
%>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<a href="${ctx}/gradle?empno=7369">点击请求后台</a>
</body>
</html>
