<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Tolstjak
  Date: 5/20/2021
  Time: 7:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Demo Page</title>
</head>
<body>

    <s:form action="getLoginTutorial">
        <s:textfield label="Login ID" key="userId" />
        <s:password label="Password" key="password" />
        <s:submit />
    </s:form>

</body>
</html>
