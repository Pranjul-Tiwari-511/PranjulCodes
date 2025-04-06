<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2>Welcome to profile Page</h2>
		
		<%-- <h3>Name: ${model_name}</h3>
		<h3>Name: ${model_email}</h3>
		<h3>Name: ${model_phno}</h3> --%>
		
		<%-- h3>Name: ${model_user.getName()}</h3>
		<h3>Name: ${model_user.getEmail()}</h3>
		<h3>Name: ${model_user.getPhoneno()}</h3> 
		 --%>
		
		<h3>Name: ${user.getName()}</h3>
		<h3>Name: ${user.getEmail()}</h3>
		<h3>Name: ${user.getPhoneno()}</h3> 
		
</body>
</html>