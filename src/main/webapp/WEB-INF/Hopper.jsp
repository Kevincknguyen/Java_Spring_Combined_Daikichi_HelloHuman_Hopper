<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.Date"%>
    
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
	<h1>Hello World</h1>
	
	
	<h2><c:out value="${name}"/></h2>
	<h2><c:out value="${item}"/></h2>
	<h2><c:out value="${price}"/></h2>
	<h2><c:out value="${desc}"/></h2>
	<h2><c:out value="${vendor}"/></h2>
	
	
	
</body>
</html>