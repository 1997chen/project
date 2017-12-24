<%--
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
    <title>教师</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css">
    <script src="../js/jQuery.js"></script>
    <script src="../js/bootstrap.min.js"></script>
</head>
<body>
<%@include file="index.jsp"%>
<div class="col-sm-9 col-md-9 column">
    <form role="form" action="/depter/teacher_update2.action" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">用户名：</label><input type="text" name="name" value="${user.name}" class="form-control" id="exampleInputEmail1" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">密码：</label><input type="text" name="pwd" value="${user.pwd}" class="form-control" id="exampleInputPassword1" />
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">真实姓名：</label><input type="text" name="realName" value="${user.realName}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">所属专业：</label>
            <select name="pro_id">
                <option value="${user.pro_id}">&nbsp;选择专业&nbsp;</option>
                <c:forEach items="${pros}" var="pro">
                    <option value="${pro.id}">&nbsp;${pro.name}&nbsp;</option>
                </c:forEach>
            </select>
        </div>
        <input type="hidden" name="id" value="${user.id}"/>
        <input type="hidden" name="state" value="${user.state}"/>
        <input type="hidden" name="dept_id" value="${user.dept_id}"/>
        <button type="submit" class="btn btn-default">修改</button>
    </form>
</div>
<%@include file="aaa.jsp"%>
</body>
</html>