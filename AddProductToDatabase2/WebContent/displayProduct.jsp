<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1>Product entered into Database successfully!</h1>
		Your product had the ID  <%= session.getAttribute("id") %>,
		 the name  <%= session.getAttribute("productName") %>,
		  and the price <%= session.getAttribute("price") %>
		
</body>
</html>