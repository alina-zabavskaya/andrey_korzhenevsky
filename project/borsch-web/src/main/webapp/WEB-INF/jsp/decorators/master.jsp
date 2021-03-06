<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN" "http://www.w3.org/TR/html4/strict.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>

    <title><decorator:title default="Hello World"/></title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <decorator:head/>
</head>
<body>

<div id="page">
    <!-- <div class="head_line">
         <div class="wrp_ctr">
             <div class="head_text">
                 Текст
             </div>
         </div>
     </div>
     -->
    <div class="wrp_ctr">
        <div id="header">
            <a class="logo" href="#"></a>

            <div class="login_block">
                <div>Зарегистрируйтесь или Войдите!</div>
                <div>//поле для авторизациии//</div>
                <div>//и регистрации//</div>
            </div>
        </div>
        <div id="mainbar">
            <dl class="main_menu">
                <dt class="selected">
                    <a href="#">Текст 1</a>
                </dt>
                <dt>
                    <a href="#">Текст 2</a>
                </dt>
                <!-- ... -->
            </dl>
        </div>
        <div id="maincontent">
            <div class="left_panel">
                Выбор недели
                <input type="week">
                Корзина
            </div>
            <div class="content">
                <decorator:body/>
                <dl>
                    <dt class="elem">
                        <a href="#">
                            <strong>Название</strong>
                            <span>Категория</span>
                        </a>
                        <img src="#" width="180" height="200">
                        Цена
                    </dt>
                    <dt class="elem">
                        <a href="#">
                            <strong>Название</strong>
                            <span>Категория</span>
                        </a>
                        <img src="#" width="180" height="200">
                        Цена
                    </dt>
                    <dt class="elem">
                        <a href="#">
                            <strong>Название</strong>
                            <span>Категория</span>
                        </a>
                        <img src="#" width="180" height="200">
                        Цена
                    </dt>
                    <dt class="clear"></dt>
                    <dt class="elem">
                        <a href="#">
                            <strong>Название</strong>
                            <span>Категория</span>
                        </a>
                        <img src="#" width="180" height="200">
                        Цена
                    </dt>
                </dl>
            </div>
        </div>
    </div>
</div>
<div>
    <div class="wrp_ctr">
        <div class="left_foot"></div>
        <div class="right_foot"></div>
    </div>
</div>


</body>
</html>