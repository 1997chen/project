<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/12/21
  Time: 23:45
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
    <%
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY");
        String now=simpleDateFormat.format(new Date());
        List years=new ArrayList();
        for (int i=Integer.parseInt(now)+1;i<=Integer.parseInt(now)+10;i++){
            years.add(i);
        }
    %>
</head>
<body>
<%@include file="index.jsp"%>
<div class="col-sm-9 col-md-9 column">
    <form role="form" action="/officer/class_update2.action" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">班级名称：</label><input type="text" name="name" value="${class1.name}" class="form-control" id="exampleInputEmail1" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">备注：</label><input type="text" name="note" value="${class1.note}" class="form-control" id="exampleInputPassword1" />
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学生数：</label><input type="text" name="stuCnt" value="${class1.stuCnt}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">入学年份：</label>&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="year">
                <option value="${class1.year}">&nbsp;${class1.year}年&nbsp;</option>
                <c:forEach items="<%=years%>" var="year">
                    <option value="${year}">&nbsp;${year}年&nbsp;</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">班级类型：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type" value="0" type="radio" <c:if test="${class1.type==0}">checked="checked"</c:if>/>高中班</label>
            <label><input name="type" value="1" type="radio" <c:if test="${class1.type==1}">checked="checked"</c:if>/>对口班</label>
            <label><input name="type" value="2" type="radio" <c:if test="${class1.type==2}">checked="checked"</c:if>/>单招班</label>
            <label><input name="type" value="3" type="radio" <c:if test="${class1.type==3}">checked="checked"</c:if>/>3+2班</label>
            <label><input name="type" value="4" type="radio" <c:if test="${class1.type==4}">checked="checked"</c:if>/>定向培养</label>
            <label><input name="type" value="5" type="radio" <c:if test="${class1.type==5}">checked="checked"</c:if>/>混合班</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">所属班主任：</label>
            <select name="user_id">
                <option value="${class1.user_id}">&nbsp;选择班主任&nbsp;</option>
                <c:forEach items="${teachers}" var="tea">
                    <option value="${tea.id}">&nbsp;${tea.name}&nbsp;</option>
                </c:forEach>
            </select>
        </div>
        <input type="hidden" name="pro_id" value="${class1.pro_id}" />
        <input type="hidden" name="plan_id" value="${class1.plan_id}"/>
        <input type="hidden" name="id" value="${class1.id}"/>
        <button type="submit" class="btn btn-default">修改</button>
    </form>
</div>
<%@include file="aaa.jsp"%>
</body>
</html>