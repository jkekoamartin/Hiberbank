<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>

	<br>
	<table>

		<f:form action="loginservice">
			<tr>
				<td>User Name: <f:input path="username" /></td>
			</tr>
			<tr>
				<td>Password: <f:input path="password" /></td>
			</tr>

			<tr>
				<td><f:button>Login</f:button></td>
			</tr>
		</f:form>
	</table>


</body>