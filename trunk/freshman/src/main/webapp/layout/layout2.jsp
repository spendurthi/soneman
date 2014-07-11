<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<script src="<c:url value="/resources/js/jquery-1.7.2.js" />"></script>
<script src="<c:url value="/resources/js/jquery.ui.core.js" />"></script>
<script src="<c:url value="/resources/js/sone.js" />"></script>
<link rel="stylesheet" href="<c:url value='/resources/css/main.css'/>">
</head>
<body>

<table border="5" style="border-collapse: collapse;" width="100%" height="100%" >
	<tbody>
		<tr height="3%">
			<td><tiles:insertAttribute name="header1" /></td>
		</tr>
		<tr height="1%">
			<td><tiles:insertAttribute name="header2" /></td>
		</tr>
		<tr height="1%">
			<td><tiles:insertAttribute name="header3" /></td>
		</tr>
		<tr height="93%">
			<td style="vertical-align:top;"><tiles:insertAttribute name="body" /></td>
		</tr>		
		<tr>
			<td><tiles:insertAttribute name="footer" /></td>
		</tr>
	</tbody>
</table>
</body>
</html>