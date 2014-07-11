<!DOCTYPE html>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<title>Address</title>
</head>
<body>
<table>
<thead>
	<tr>
	<th><fmt:message key="id" /></th>
	<th><fmt:message key="street" /></th>
	<th><fmt:message key="suiteApt" /></th>
	<th><fmt:message key="city" /></th>
	<th><fmt:message key="state" /></th>
	<th><fmt:message key="zip" /></th>
	<th><fmt:message key="country" /></th>
	<th><fmt:message key="phoneHome" /></th>
	<th><fmt:message key="phoneOffice" /></th>
	<th><fmt:message key="phoneMobile" /></th>
	<th><fmt:message key="addType" /></th>
	<th><fmt:message key="exten" /></th>
	<th><fmt:message key="fax" /></th>
	
	</tr>
</thead>
<c:forEach items = "${listOfAddress}" var="add">
<tr>
	<td><c:out value="${add.id}"/></td>
	<td><c:out value="${add.street}"/></td>
	<td><c:out value="${add.suiteApt}"/></td>
	<td><c:out value="${add.city}"/></td>
	<td><c:out value="${add.state}"/></td>
	<td><c:out value="${add.zip}"/></td>
	<td><c:out value="${add.country}"/></td>
	<td><c:out value="${add.phoneHome}"/></td>
	<td><c:out value="${add.phoneOffice}"/></td>
	<td><c:out value="${add.phoneMobile}"/></td>
	<td><c:out value="${add.type}"/></td>
	<td><c:out value="${add.extension}"/></td>
	<td><c:out value="${add.fax}"/></td>
	<td><a href="addrupde${add.id}"><c:out value="${add.id}"/></a></td>	
</tr>	
</c:forEach>
</table>
<table>
<tr>
<td><a href="navigatoraddrAdd" >Add</a></td>
</tr>
</table>
</body>
</html>
