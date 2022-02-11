<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	<h1>Hello World</h1>
	
	<h2>
	<c:out value="${20*7}"/>
	</h2>
	
	<h2><c:out value="${dojoName}"/></h2>
	
	<% for (int i=1; i<5;i++) { %>
		<h1> <%= i%> </h1>
		<%} %>
	
	<a href="http://localhost:8080/hopper">Go here for Hopper</a>
		
	<h3>The time is <%=new Date() %></h3>
	
</body>
</html>