<%@page import="com.velocis.beans.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>profile page</title>
</head>
<body>
		<% User user= (User) session.getAttribute("session_user"); %>
		
		<h4>Welcome</h4>

		<h4>Name:<%=user.getName()%></h4>
		<h4>Email:<%=user.getEmail()%></h4>
		<h4>City:<%=user.getCity()%></h4>
		
		
		<a href="logout" class="btn btn-primary btn-default btn-sm px-2 py-1">Logout</a>
			
</body>
</html>