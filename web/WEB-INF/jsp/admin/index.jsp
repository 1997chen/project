<%--
  Created by IntelliJ IDEA.
  User: shiser
  Date: 17-12-19
  Time: 下午11:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>超级管理员</title>
    <link rel="stylesheet" type="text/css" href="../../../css/bootstrap.min.css">
    <script src="../../../js/jQuery.js"></script>
    <script src="../../../js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <img alt="140x140" src="/img/jwc.png" class="img-rounded"/>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1"><span
                            class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span
                            class="icon-bar"></span><span class="icon-bar"></span></button>
                    <a class="navbar-brand" href="#">首页</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">第一</a>
                        </li>
                        <li>
                            <a href="#">第二</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input class="form-control" type="text"/>
                        </div>
                        <button type="submit" class="btn btn-default">Submit</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">第三</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">更多<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-2 column">
            <div class="panel-group" id="panel-646780">
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title" data-toggle="collapse" data-parent="#panel-646780"
                           href="#panel-element-892908">信息维护</a>
                    </div>
                    <div id="panel-element-892908" class="panel-collapse in">
                        <div class="panel-body">
                            <a href="#">信息查看</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">修改密码</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-646780"
                           href="#panel-element-55955">院部管理</a>
                    </div>
                    <div id="panel-element-55955" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="#">新建院部</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">院部列表</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">院部管理</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-646780"
                           href="#panel-element-qwe">专业管理</a>
                    </div>
                    <div id="panel-element-qwe" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="#">新建专业</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">专业列表</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">专业管理</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">专业查询</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-646780"
                           href="#panel-element-qwer">教师管理</a>
                    </div>
                    <div id="panel-element-qwer" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="#">新建教师</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">教师列表</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">教师查询</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">教师导入</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-646780"
                           href="#panel-element-qwerr">人才培养方案审核</a>
                    </div>
                    <div id="panel-element-qwerr" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="#">待审核</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">未通过</a>
                        </div>
                    </div>
                </div>
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <a class="panel-title collapsed" data-toggle="collapse" data-parent="#panel-646780"
                           href="#panel-element-qwerrr">人才培养方案管理</a>
                    </div>
                    <div id="panel-element-qwerrr" class="panel-collapse collapse">
                        <div class="panel-body">
                            <a href="/plan/allPro_list.action">分专业查看</a>
                        </div>
                        <div class="panel-body">
                            <a href="/plan/allYear_list.action">分年度查看</a>
                        </div>
                        <div class="panel-body">
                            <a href="#">维护</a>
                        </div>
                    </div>
                </div>
            </div>
        </div>

</body>
</html>
