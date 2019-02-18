<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/2/5
  Time: 17:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<table>
    <tr>
        <td>account</td>
        <td><input /></td>
    </tr>
    <tr>
        <td>secretkey</td>
        <td><input /></td>
    </tr>
    <tr align="center">
        <td><button id="hh"  onclick="goLog()">登录</button></td>
    </tr>

</table>
</body>
<script>
    function goLog() {
        window.open("log/succ");
    }
</script>
</html>
