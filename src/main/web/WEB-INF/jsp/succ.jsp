<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2019/2/18
  Time: 9:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="fmt1" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
succ<br/>
id:${iaccount.id}<br/>
id:${iaccount.account}<br/>
日期：${iaccount.joindate}<br/>
日期2： <fmt1:formatDate value="${iaccount.joindate}" pattern="yyyy-MM-dd"></fmt1:formatDate><br/>
时间：${iaccount.jointime}<br/>
</body>
</html>
