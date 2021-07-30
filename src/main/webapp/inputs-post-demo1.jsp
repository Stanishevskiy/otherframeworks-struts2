<%--
  Created by IntelliJ IDEA.
  User: Tolstjak
  Date: 5/4/2021
  Time: 4:25 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Struts Inputs POST Demo Page 1</title>
</head>
<body>

    <s:form action="tutorials/getInputsPostTutorial">
        <s:textfield label="Enter language" key="language" />
        <s:submit />
    </s:form>

<%--    <form method="post" action="tutorials/getInputsPostTutorial">--%>
<%--        <input id="language" name="language" />--%>
<%--        <input type="submit">--%>
<%--    </form>--%>

</body>
</html>
