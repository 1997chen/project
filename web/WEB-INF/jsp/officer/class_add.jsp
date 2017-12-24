<%@ page import="java.text.SimpleDateFormat" %>
<%@ page import="java.util.Date" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
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
    SimpleDateFormat simpleDateFormat=new SimpleDateFormat("YYYY");
    String now=simpleDateFormat.format(new Date());
    List years=new ArrayList();
    for (int i=Integer.parseInt(now)+1;i<=Integer.parseInt(now)+10;i++){
        years.add(i);
    }
%>
<html>
<head>
    <title>人才培养平台</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css">
    <script src="../js/jQuery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="index.jsp"%>
<div class="col-sm-9 col-md-9 column">
    <form role="form" action="/officer/class_add2.action" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">班级名称：</label><input type="text" name="name" class="form-control" id="exampleInputEmail1" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">备注：</label><input type="text" name="note" class="form-control" id="exampleInputPassword1" />
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学生数：</label><input type="text" name="realName" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">入学年份：</label>&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="year">
                <option value="<%=now%>">&nbsp;<%=now%>年&nbsp;</option>
                <c:forEach items="<%=years%>" var="year">
                    <option value="${year}">&nbsp;${year}年&nbsp;</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type" value="0" type="radio" checked="checked"/>高中班</label>
            <label><input name="type" value="1" type="radio" />对口班</label>
            <label><input name="type" value="2" type="radio" />单招班</label>
            <label><input name="type" value="3" type="radio" />3+2班</label>
            <label><input name="type" value="4" type="radio" />定向培养</label>
            <label><input name="type" value="5" type="radio" />混合班</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">所属专业：</label>&nbsp;&nbsp;&nbsp;&nbsp;
            <select name="pro_id">
                <option value="">&nbsp;选择专业&nbsp;</option>
                <c:forEach items="${pros}" var="pro">
                <option value="${pro.id}">&nbsp;${pro.name}&nbsp;</option>
                </c:forEach>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">所属班主任：</label>
            <select name="user_id">
                <option value="">&nbsp;选择班主任&nbsp;</option>
                <c:forEach items="${teachers}" var="tea">
                    <option value="${tea.id}">&nbsp;${tea.name}&nbsp;</option>
                </c:forEach>
            </select>
        </div>
        <input type="hidden" name="state" value="3"/>
        <input type="hidden" name="dept_id" value="${user.dept_id}"/>
        <button type="submit" class="btn btn-default">添加</button>
    </form>
</div>
<%@include file="aaa.jsp"%>
</body>
</html>
