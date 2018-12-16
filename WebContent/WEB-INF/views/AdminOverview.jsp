<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Admin Home</title>
</head>
<body>
	<br>
	<br>
	<center>
	<h1>List of New Customers</h1>
	<hr size="3" color="red" />
	</center>
	<br>
	<br>
	<center>
		<table style="background-color: orange;" rowspan="4" colspan="4">
			<tr>
				<th>Customer ID</th>
				<th>Customer Name</th>
				<th>Customer Phone</th>
				<th>Customer Address</th>
				<th>Approve</th>
				<th>Deny</th>
 
			</tr>

			<tr>
				<c:forEach items="${allcustomers}" var="customer">
					<tr>
						<td>${customer.id}</td>
						<td>${customer.name}</td>
						<td>${customer.phone}</td>
						<td>${customer.address}</td>

						<td><a href='approve/${customer.id}'>Approve</a></td>
						<td><a href='deny/${customer.id}'>Deny</a></td>
					</tr>
				</c:forEach>
			</tr>

		</table>
	</center>

</body>
</html>