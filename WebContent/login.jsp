<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<html>

<body>

<html:form action="book">

Name:<html:text property="name"/><br/>

Age:<html:text property="age"/>

<html:submit/>

</html:form>

</body>

</html>