<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body bgcolor="CCCCFF">
	<center>
		<h1>Welcome to Fingerprint based ATM System</h1>
		<h2>Login</h2>
		<i><ul>
				<h3>Enter your Customer ID and Password</h3>
			</ul></i>

		<form action="loginRegister" method="post">
			<table>

				<tr>
					<td><h3>${message}</h3><h3>${successMessage}</h3></td>
					<td></td>
				</tr>
				<tr>
					<td>UserName:</td>
					<td><input type="text" name="username"></td>
				</tr>

				<tr>
					<td>Password:</td>
					<td><input type="password" name="password1"></td>
				</tr>
			</table>

			<p>
				<input type="submit" name="submit" value="login" /> <input
					type="reset" value="Clear" />
			</p>

			<p align="center">
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <b>New User?</b> &nbsp; <a
					href="register.jsp">Sign up for Your New Online Account</a>&nbsp;
			</p>

		</form>
	</center>

</body>
</html>