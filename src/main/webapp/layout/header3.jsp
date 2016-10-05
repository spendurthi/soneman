<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<body>
<c:if test="${errMsg!=null}">
	<div id='errorDiv1' class="red">
		<c:forEach items = "${errMsg}" var="emsg">
			${emsg}
	   	</c:forEach>   
	</div>
</c:if>
<c:if test="${infoMsg!=null}">
	<div id='errorDiv2' class="blue">
		<c:forEach items = "${infoMsg}" var="imsg">
			${imsg}
	   	</c:forEach>   
	</div>
</c:if>
</body>
</head>
</html>