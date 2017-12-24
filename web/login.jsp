<%--
  Created by IntelliJ IDEA.
  User: shiser
  Date: 17-12-20
  Time: 下午2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
    <script src="js/jQuery.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script type="text/javascript">
        function login() {
            var name = document.getElementById('name').value;
            var pwd = document.getElementById('pwd').value;
            if (name != "" && pwd != "") {
                return true;
            } else {
                alert("用户名密码不能为空！");
                return false;
            }
        }
    </script>
</head>
<body background="img/0.jpg">

<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column" style="padding-top: 70px;padding-left: 70px">
            <img alt="140x140" src="img/jwc.png"/>
        </div>
        <div class="col-md-7 column" style="padding-top: 180px">
            <div class="carousel slide" id="carousel-493559">
                <ol class="carousel-indicators">
                    <li class="active" data-slide-to="0" data-target="#carousel-493559">
                    </li>
                    <li data-slide-to="1" data-target="#carousel-493559">
                    </li>
                    <li data-slide-to="2" data-target="#carousel-493559">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img alt=""
                             src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/1/default.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                First Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt=""
                             src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/2/default.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Second Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt=""
                             src="http://ibootstrap-file.b0.upaiyun.com/lorempixel.com/1600/500/sports/3/default.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Third Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-493559" data-slide="prev"><span
                        class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control"
                                                                                href="#carousel-493559"
                                                                                data-slide="next"><span
                    class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
        </div>
        <div class="col-md-5 column" style="padding-top: 180px">
            <form role="form" action="" method="post">
                <div class="form-group">
                    <label for="exampleInputEmail1">用户名</label><input class="form-control"
                                                                      id="exampleInputEmail1" type="email" name="name"
                                                                      style="ime-mode:disabled"/>
                </div>
                <div class="form-group">
                    <label for="exampleInputPassword1">密码</label><input class="form-control"
                                                                        id="exampleInputPassword1"
                                                                        type="password" name="pwd"
                                                                        style="ime-mode:disabled"/>
                </div>
                <button type="submit" onclick="return login()" class="btn btn-default">登录</button>
            </form>
        </div>
    </div>
    <div class="row clearfix" style="margin-top: 300px">
        <div class="col-md-12 column">
            <p class="text-center muted">
                <a href="http://www.rzpt.cn"><em>日照职业技术学院</em> www.rzpt.cn</a>
            </p>
        </div>
    </div>
</div>
</body>
</html>
