<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body bgcolor="CCCCFF">

	<center>
		<h2>Fingerprint Based ATM System</h2>
		<i><ul>
				<h3>Enter your Information Here!!</h3>
			</ul></i>

		<form action="loginRegister" method = "post">
			<table>
				<tr>
					<td>UserName:</td>
					<td><input type="text" name="username"></td>
				</tr>
				
				<tr>
					<td>Name:</td>
					<td><input type="text" name="name"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password1"></td>
				</tr>
				
				<tr>
					<td>Re-Type Password:</td>
					<td><input type="password" name="password2"></td>
				</tr>
			</table>

			<p>
				<input type="submit" name="submit" value="register"/> <input
					type="reset" value="Clear" />
			</p>

			<p align="center">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <b>Already Signup?</b> &nbsp; <a
					href="login.jsp">Sign in with Your Account</a>&nbsp;				
			</p>

		</form>
	</center>

</body>
</html>