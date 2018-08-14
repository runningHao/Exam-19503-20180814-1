<%--
  Created by IntelliJ IDEA.
  User: ZhangHao
  Date: 2018/8/13
  Time: 13:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="jquery3.3.1.js"></script>
    <title>login</title>
</head>
<body>
<form  method="post" action="UserServlet">
    用户名：<input type="text" name="username"><br/>
    <button type="submit">提交</button>
</form>
</body>

<script>

    $(function(){
        $.ajax({
            url:"/items",    //请求的url地址
            dataType:"json",   //返回格式为json
            async:true,//请求是否异步，默认为异步，这也是ajax重要特性
            type:"POST",   //请求方式

            success:function(req){
                console.log(req);
            },
            complete:function(){
//请求完成的处理
            },
            error:function(){
//请求出错处理
            }
        });
    });
    function listitme() {

    }

</script>
</html>
