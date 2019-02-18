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
    <title>登录页</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/succ" method="post" id="form6">
    <table>
        <tr>
            <td>account</td>
            <td ><input name="account" /></td>
        </tr>
        <tr>
            <td>secretkey</td>
            <td ><input name="secretkey"/></td>
        </tr>
        <tr align="center">
            <td><button type="submit">log</button></td>
        </tr>

    </table>
</form>
</body>
<script>

</script>
</html>
