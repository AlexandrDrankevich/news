<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet" href="styles.css">
<title>Registration</title>
</head>
<body>
	<div class="form-header">
		<h1>Registration</h1>
	</div>
	<div class="reg-form-body">
		<form action="Controller" method="post">
			<input type="hidden" name="command" value="do_registration">
			<div>
				<label for="name">Name </label> <input type="text" name="name"
					id="name" class="form-control" value="" />
			</div>
			<br />
			<div>
				<label for="surname">Surname</label> <input type="text"
					name="surname" id="surname" class="form-control" value="" />
			</div>
			<br />
			<div>
				<label for="email">Email</label> <input type="text" name="email"
					id="email" class="form-control" value="" />
			</div>
			<br />
			<div>
				<label for="birthday">Birthday</label> <input type="date" name="birthday"
					id="birthday" class="form-control" value="" />
			</div>
			<br />
			<div>
				<label for="password">Password</label> <input type="password"
					name="password" id="password" class="form-control" value="" />
			</div>
			<br />
			<div>
				<input type="submit" class="btn" value="Registration" />
			</div>
		</form>
	</div>
</body>
</html>