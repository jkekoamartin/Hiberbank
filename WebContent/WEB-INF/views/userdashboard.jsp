<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<table>

		<tr>
			<th>Customer ID</th>
			<th>Customer User Name</th>
			<th>Customer Name</th>
			<th>Customer Phone</th>
			<th>Customer Address</th>
		</tr>


		<tr>
			<td>${customer.getId()}</td>
			<td>${customer.getUsername()}</td>
			<td>${customer.getName()}</td>
			<td>${customer.getPhone()}</td>
			<td>${customer.getAddress()}</td>
		</tr>

	</table>

</body>
</html>