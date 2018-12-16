<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer Overview</title>
</head>
<body>
<img src="banklogo.png" />Insert logo here
	<br>
	<left>
	<h1 style="color: blue; font-family: Arial, Helvetica, sans-serif">Hello:
		User!</h1>
	</left>
	<hr size="4" color="red" />
	<br>
	<div>
		<div
			style="font-family: Cambria, Cochin, Georgia, Times, Times New Roman, serif; font: 300; font-size: large">
			Current Balance: $ Insert balance here <br> <br> Recent
			Transactions:
			<center>
				<table style="red; border-style:double; border-spacing:5px; font-family: Arial, Helvetica, sans-serif">
				<thead colspan="6">
					<tr>
						<th>Date</th>
						<th>Transaction</th>
						<th>Amount</th>
						</thead>
					</tr>
					<tr>
						<td>date1</td>
						<td>transaction1</td>
						<td>Amount1</td>
					</tr>
				</table>
				</center>
				<br>
				<br>
				<hr size="4" color="red" />
				<center>
				<button id="transferBtn" type="button" style="font-size: 24px;"><a href="login.html">Transfer</a></button>
				<button id="newAcctBtn" type="button" style="font-size: 24px;"><a href="newCustomerForm.jsp">Create New Account</a></button>
				<button id="exitBtn" type="button" style="font-size: 24px;"><a href="login.html">Exit</button>
				</center>
		</div>
		<br>
		<div>
			<ul
				style="font-family: Cambria, Cochin, Georgia, Times, Times New Roman, serif; font: 300; font-size: large">
			</ul>
		</div>
		<div>
</body>
</html>