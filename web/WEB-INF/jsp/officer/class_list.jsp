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
<%@include file="index.jsp" %>
<div class="col-sm-9 col-md-9 column">
    <table class="table">
        <thead>
        <tr>
            <th>序号</th>
            <th>班级名称</th>
            <th>班级备注</th>
            <th>班级类型</th>
            <th>查看及修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${class1s}" var="c" varStatus="s">
            <tr class="active">
                <td>${s.index+1}</td>
                <td>${c.name}</td>
                <td>${c.note}</td>
                <td>${c.type}</td>
                <td><a href="/officer/class_update1/${c.id}/${proId}.action">查看及修改</a></td>
                <td><a href="/officer/class_delete/${c.id}/${proId}.action">删除</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<%@include file="aaa.jsp" %>
</body>
</html>
