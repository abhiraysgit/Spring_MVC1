<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<%
		/* String name = (String) request.getAttribute("name");
		Integer id = (Integer) request.getAttribute("ID");
		List<String> frds = (List<String>) request.getAttribute("f"); */
	%>

	<h1>
		Name is ${name}
		<%-- <%=name%> --%>
	</h1>
	<h1>
		ID is ${ID}
		<%-- <%=id%> --%>
	</h1>
	<hr>

	<%-- <%
		for (String s : frds) {
	%>

	<h1> <%=s%></h1>
	<%
		}
	%> --%>
	<hr>
	<c:forEach var="item" items="${ f}">
		<%-- <h3>${item }</h3> --%>
		<h3>
			<c:out value="${item }"></c:out>
		</h3>

	</c:forEach>
</body>
</html>