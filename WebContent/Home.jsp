<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<html>

<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>JSP Page</title>

</head>

<body>

<h2>Hello World!</h2>

<h2>Bạn đã chuyển sang trang result.jsp</h2>

<html:form action="book">

Name:<html:text property="name"/><br/>

Age:<html:text property="age"/>

</html:form>

</body>

</html>