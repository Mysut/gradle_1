<%--
  Created by IntelliJ IDEA.
  User: SuTao
  Date: 2020/11/4
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.sutao.entity.Emp" %>
<%
    pageContext.setAttribute("emp", ((Emp)request.getAttribute("emp")));
%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h6><%=((Emp)request.getSession().getAttribute("emp")).getEname()%>></h6>

</body>
</html>
