<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Main page</title>
</head>
<body>
	<div class="auth-form-body">
		<form action="Controller" method="get">
			<input type="hidden" name="command" value="go_to_registration_page" /> <label
				for="registration">Registration</label> <input id="registration"
				type="submit" value="Click it" class="btn" />
		</form>
		<br />
		<form action="Controller" method="get">
			<input type="hidden" name="command" value="go_to_authorization_page" /> <label
				for="authorization">Authorization</label> <input id="authorization"
				type="submit" value="Click it" class="btn" />
		</form>
	</div>
</body>
</html>