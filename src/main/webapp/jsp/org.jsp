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
        <td><form:label path="orgId"><fmt:message key="org_id" /> :</form:label></td>
        <td><form:input path="orgId" cssClass="required"/></td>
    </tr>
    <tr>
        <td><form:label path="orgName"><fmt:message key="org_name" /> :</form:label></td>
        <td><form:input path="orgName" cssClass="required" /></td>
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