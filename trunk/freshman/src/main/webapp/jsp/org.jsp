<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<head>
    <title>Login</title>
</head>
<body>

<form:form method="POST" action="orgadd" modelAttribute="org">
<form:errors path="*" cssClass="red" />
 <div id="errorDiv"></div> 		  
   <table>
    <tr>
        <td><form:label path="orgname"><fmt:message key="orgname" /> :</form:label></td>
        <td><form:input path="orgname" cssClass="required"/></td>
    </tr>
    <tr>
        <td><form:label path="password"><fmt:message key="password" /> :</form:label></td>
        <td><form:input path="password" cssClass="required" /></td>
    </tr>
    <tr>
    	<td></td>
        <td style="float:right;">
            <input type="submit" value="Submit" class="loginActions11" />
        </td>
    </tr>
</table>
</form:form>
</body>
</html>