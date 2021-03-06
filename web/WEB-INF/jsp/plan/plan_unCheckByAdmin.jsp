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
</head>
<body>
<%@include file="../admin/index.jsp" %>
<div class="col-sm-9 col-md-9 column">
    <table class="table">
        <thead>
        <tr>
            <th>序号</th>
            <th>方案名称</th>
            <th>招生对象</th>
            <th>学制</th>
            <th>查看</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${plans}" var="plan" varStatus="s">
            <tr class="active">
                <td>${s.index+1}</td>
                <td>${plan.name}</td>
                <td>${plan.zhaosheng}</td>
                <td>${plan.xuezhi}</td>
                <td><a href="/plan/plan_showByAdmin/${plan.id}/${userId}.action">查看</a></td>
                <td><a href="/plan/plan_toCheck/${plan.id}/${userId}.action">去审核</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="aaa.jsp" %>
</body>
</html>
