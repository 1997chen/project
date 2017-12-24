<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/22
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<html>
<head>
    <title>人才培养平台</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css">
    <script src="../js/jQuery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
<c:if test="${userState==0}"><%@include file="../admin/index.jsp" %></c:if>
<c:if test="${userState==1}"><%@include file="../depter/index.jsp" %></c:if>
<c:if test="${userState==2}"><%@include file="../officer/index.jsp" %></c:if>
<c:if test="${userState==3}"><%@include file="../teacher/index.jsp" %></c:if>
<div class="col-sm-9 col-md-9 column">
    <table class="table">
        <thead>
        <tr>
            <th>序号</th>
            <th>专业名称</th>
            <th>专业代码</th>
            <th>专业状态</th>
            <th>查看</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${pros}" var="pro" varStatus="s">
            <tr class="active">
                <td>${s.index+1}</td>
                <td>${pro.name}</td>
                <td>${pro.pno}</td>
                <td>${pro.state}</td>
                <td><a href="/plan/plan_showByPro/${pro.id}/${userState}.action">查看</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="aaa.jsp" %>
</body>
</html>
