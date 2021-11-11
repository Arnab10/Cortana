<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>

<script>
	var toggleButton = (name) => {
		(name==="Login") ? document.adduser.style.display='none' : document.loginuser.style.display='none';
	}

</script>

<body onload="alert('Welcome')" style="font-family: SF Pro Display,SF Pro Icons,Helvetica Neue,Helvetica,Arial,sans-serif;">
	</h1><strong>Nice to have you Here!</strong><br><br>
	
	<form name="adduser" action="addUser" method="POST">
	<table>
		<tr><td>User Id : </td><td><input type="text" name="userId"><br></td></tr>
		<tr><td>User Name: </td><td><input type="text" name="userName"><br></td></tr>
		<tr><td>First Name : </td><td><input type="text" name="firstName"><br></td></tr>
		<tr><td>Last Name : </td><td><input type="text" name="lastName"><br></td></tr>
		<tr><td>Email Id : </td><td><input type="text" name="emailid"><br></td></tr>
		<tr><td>Password : </td><td><input type="text" name="password"><br></td></tr>
		<tr><td>Contact Number : </td><td><input type="text" name="contatNo"><br></td></tr>
		<tr><td>OTP : </td><td><input type="hidden" name="OTP"><br></td></tr>
	</table>
	<br>
		<input type="submit"><br>
	</form>
	<br>
	<form name="loginuser" action="loginUser" method="POST">
	<table>
		<tr><td>User Name: </td><td><input type="text" name="userName"><br></td></tr>
		<tr><td>Password : </td><td><input type="text" name="password"><br></td></tr>
	</table>
	<input type="submit"><br>
	</form>
	
</body>
</html>