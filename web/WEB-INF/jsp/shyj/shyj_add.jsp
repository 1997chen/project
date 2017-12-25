<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/20
  Time: 22:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    String now=simpleDateFormat.format(new Date());
%>
<html>
<head>
    <title>人才培养平台</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css">
    <script src="../js/jQuery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
<c:if test="${user.state}==0"><%@include file="../admin/index.jsp"%></c:if>
<c:if test="${user.state}==1"><%@include file="../depter/index.jsp"%></c:if>
<div class="col-sm-9 col-md-9 column">
    <form role="form" action="plan/plan_fail/${user.state}" method="post">
        <div class="form-group">
            <label>人才培养方案名称：${plan.name}</label>
        </div>
        <div class="form-group">
            <label>审核人：${user.name}</label>
        </div>
        <div class="form-group">
            <label style="color: red">如果您要通过该方案，则可以不填写审核意见</label>
        </div>
        <div class="form-group">
            <label>审核意见：</label><input type="text" name="content" class="form-control"/>
        </div>
        <input type="hidden" name="checkTime" value="<%=now%>"/>
        <c:if test="${user.state}==1"><input type="hidden" name="state" value="0"></c:if>
        <c:if test="${user.state}==0"><input type="hidden" name="state" value="1"></c:if>
        <input type="hidden" name="user_id" value="${user.id}"/>
        <input type="hidden" name="plan_id" value="${plan.id}"/>
        <a href="/plan/plan_success/${plan.id}/${user.state}"><button class="btn btn-default">通过</button></a>
        <button type="submit" class="btn btn-default">不通过</button></a>
    </form>
</div>
<%@include file="../aaa.jsp"%>
</body>
</html>
