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
    <form role="form" action="/officer/course_update2.action" method="post">
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型1：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type1" value="0" type="radio" <c:if test="${course.type1==0}">checked="checked"</c:if>/>通识教育课程</label>
            <label><input name="type1" value="1" type="radio" <c:if test="${course.type1==1}">checked="checked"</c:if> />专业教育课程</label>
            <label><input name="type1" value="2" type="radio" <c:if test="${course.type1==2}">checked="checked"</c:if> />创新创业教育课程</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型2：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type2" value="0" type="radio" <c:if test="${course.type2==0}">checked="checked"</c:if>/>必修课程</label>
            <label><input name="type2" value="1" type="radio" <c:if test="${course.type2==1}">checked="checked"</c:if>/>选修课程</label>
            <label><input name="type2" value="2" type="radio" <c:if test="${course.type2==2}">checked="checked"</c:if> />非课程类教育教学活动课</label>
            <label><input name="type2" value="3" type="radio" <c:if test="${course.type2==3}">checked="checked"</c:if> />基础通用课程</label>
            <label><input name="type2" value="4" type="radio" <c:if test="${course.type2==4}">checked="checked"</c:if> />专业平台课程</label>
            <label><input name="type2" value="5" type="radio" <c:if test="${course.type2==5}">checked="checked"</c:if> />岗位导向课程</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型3：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type3" value="0" type="radio" <c:if test="${course.type3==0}">checked="checked"</c:if>/>专业核心课程</label>
            <label><input name="type3" value="1" type="radio" <c:if test="${course.type3==1}">checked="checked"</c:if>/>非专业核心课程</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">课程性质：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type4" value="0" type="radio" <c:if test="${course.type4==0}">checked="checked"</c:if>/>必修课</label>
            <label><input name="type4" value="1" type="radio" <c:if test="${course.type4==1}">checked="checked"</c:if>/>选修课</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">选择类型：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="type5" value="0" type="radio" <c:if test="${course.type5==0}">checked="checked"</c:if>/>未归类</label>
            <label><input name="type5" value="1" type="radio" <c:if test="${course.type5==1}">checked="checked"</c:if>/>入学教育</label>
            <label><input name="type5" value="2" type="radio" <c:if test="${course.type5==2}">checked="checked"</c:if>/>军政训练</label>
            <label><input name="type5" value="3" type="radio" <c:if test="${course.type5==3}">checked="checked"</c:if>/>劳动教育</label>
            <label><input name="type5" value="4" type="radio" <c:if test="${course.type5==4}">checked="checked"</c:if>/>职场体验</label>
            <label><input name="type5" value="5" type="radio" <c:if test="${course.type5==5}">checked="checked"</c:if>/>整周实训</label>
            <label><input name="type5" value="6" type="radio" <c:if test="${course.type5==6}">checked="checked"</c:if>/>项目实践</label>
            <label><input name="type5" value="7" type="radio" <c:if test="${course.type5==7}">checked="checked"</c:if>/>顶岗实习</label>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">课程名称：</label><input type="text" name="name" value="${course.name}" class="form-control" id="exampleInputEmail1" />
        </div>
        <div class="form-group">
            <label for="exampleInputPassword1">课程代码：</label><input type="text" name="cno" value="${course.cno}" class="form-control" id="exampleInputPassword1" />
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学时：</label><input type="text" name="classHour" value="${course.classHour}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学分：</label><input type="text" name="grade" value="${course.grade}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">理论学时：</label><input type="text" name="llGrade" value="${course.llGrade}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">实际学时：</label><input type="text" name="sjGrade" value="${course.sjGrade}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">学期：</label>
            <select name="term">
                <option value="0" <c:if test="${course.term==0}">selected="selected"</c:if>>&nbsp;上学期&nbsp;</option>
                <option value="1" <c:if test="${course.term==1}">selected="selected"</c:if>>&nbsp;下学期&nbsp;</option>
            </select>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">周课时：</label><input type="text" name="weekHour" value="${course.weekHour}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">周数：</label><input type="text" name="weeks" value="${course.weeks}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">*课程主要内容：</label><input type="text" name="content" value="${course.content}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">*培养能力：</label><input type="text" name="ability" value="${course.ability}" class="form-control"/>
        </div>
        <div class="form-group">
            <label for="exampleInputEmail1">考核方式：</label>
        </div>
        <div class="radio" class="form-group">
            <label><input name="examScheme" value="0" type="radio" <c:if test="${course.examScheme==0}">checked="checked"</c:if>/>笔试</label>
            <label><input name="examScheme" value="1" type="radio" <c:if test="${course.examScheme==1}">checked="checked"</c:if>/>大作业+答辩</label>
            <label><input name="examScheme" value="2" type="radio" <c:if test="${course.examScheme==2}">checked="checked"</c:if>/>过程考核</label>
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
        <input type="hidden" name="pro_id" value="${course.pro_id}"/>
        <input type="hidden" name="id" value="${course.id}"/>
        <button type="submit" class="btn btn-default">修改</button>
    </form>
</div>
<%@include file="aaa.jsp"%>
</body>
</html>
