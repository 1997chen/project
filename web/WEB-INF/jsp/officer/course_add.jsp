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
    <form role="form" action="/officer/course_add2.action" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型1：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type1" value="0" type="radio" checked="checked"/>通识教育课程</label>
            <label><input name="type1" value="1" type="radio" />专业教育课程</label>
            <label><input name="type1" value="2" type="radio" />创新创业教育课程</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型2：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type2" value="0" type="radio" checked="checked"/>必修课程</label>
            <label><input name="type2" value="1" type="radio" />选修课程</label>
            <label><input name="type2" value="2" type="radio" />非课程类教育教学活动课</label>
            <label><input name="type2" value="3" type="radio" />基础通用课程</label>
            <label><input name="type2" value="4" type="radio" />专业平台课程</label>
            <label><input name="type2" value="5" type="radio" />岗位导向课程</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型3：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type3" value="0" type="radio" />专业核心课程</label>
            <label><input name="type3" value="1" type="radio" checked="checked"/>非专业核心课程</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">课程性质：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type4" value="0" type="radio" checked="checked"/>必修课</label>
            <label><input name="type4" value="1" type="radio" />选修课</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type5" value="0" type="radio" checked="checked"/>未归类</label>
            <label><input name="type5" value="1" type="radio" />入学教育</label>
            <label><input name="type5" value="2" type="radio" />军政训练</label>
            <label><input name="type5" value="3" type="radio" />劳动教育</label>
            <label><input name="type5" value="4" type="radio" />职场体验</label>
            <label><input name="type5" value="5" type="radio" />整周实训</label>
            <label><input name="type5" value="6" type="radio" />项目实践</label>
            <label><input name="type5" value="7" type="radio" />顶岗实习</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">课程名称：</label><input type="text" name="name" class="form-control" id="exampleInputEmail1" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">课程代码：</label><input type="text" name="cno" class="form-control" id="exampleInputPassword1" />
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学时：</label><input type="text" name="classHour" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学分：</label><input type="text" name="grade" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">理论学时：</label><input type="text" name="llGrade" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">实际学时：</label><input type="text" name="sjGrade" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学期：</label>
            <select name="term">
                <option value="0">&nbsp;上学期&nbsp;</option>
                <option value="1">&nbsp;下学期&nbsp;</option>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">周课时：</label><input type="text" name="weekHour" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">周数：</label><input type="text" name="weeks" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">课程主要内容：</label><input type="text" name="content" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">培养能力：</label><input type="text" name="ability" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">考核方式：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="examScheme" value="0" type="radio" checked="checked"/>笔试</label>
            <label><input name="examScheme" value="1" type="radio" />大作业+答辩</label>
            <label><input name="examScheme" value="2" type="radio" />过程考核</label>
        </div>
        <%--<div class="form-group">
            <label for="exampleInputEmail1">所属专业：</label>
            <select name="pro_id">
                <option value="">&nbsp;选择专业&nbsp;</option>
                <c:forEach items="${pros}" var="pro">
                <option value="${pro.id}">&nbsp;${pro.name}&nbsp;</option>
                </c:forEach>
            </select>
        </div>--%>
        <input type="hidden" name="pro_id" value="${proId}"/>
        <button type="submit" class="btn btn-default">添加</button>
    </form>
</div>
<%@include file="aaa.jsp"%>
</body>
</html>
