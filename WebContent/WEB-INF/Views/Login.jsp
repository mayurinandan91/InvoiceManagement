<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>hello</h1>
<form:form method="post" action="save.html" modelAttribute="loginModel">
<c:forEach items="${loginModel.vendorList}" var="vendor" varStatus="status">
		<tr>
			<td align="center">${vendor}</td>
			
		</tr>
	</c:forEach>
</form:form>
</body>
</html>