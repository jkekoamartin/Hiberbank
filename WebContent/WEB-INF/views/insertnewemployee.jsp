<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	<table>
		<f:form action="saveemployeeservice">
			<tr>
				<td>ID: <f:input path="eid" /></td>
			</tr>
			<tr>
				<td>Name: <f:input path="ename" /></td>
			</tr>
			<tr>
				<td>City: <f:input path="ecity" /></td>
			</tr>
			<tr>
				<td>Phone: <f:input path="ephone" /></td>
			</tr>
			<tr>
				<td>Salary: <f:input path="esalary" /></td>
			</tr>
			<tr>
				<td>AID: <f:input path="aid" /></td>
			</tr>

			<tr>
				<td><f:button>Save</f:button></td>

			</tr>
		</f:form>
	</table>


</body>
</html>