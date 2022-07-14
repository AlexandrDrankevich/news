<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Authorization</title>
<link rel="stylesheet" href="styles.css">
</head>
<body>

<div class="form-header" >
        <h1>Authorization </h1>
      </div>
	<div class="auth-form-body">
		<form action="Controller" method="post">
			<input type="hidden" name="command" value="do_authorization">
			<div>
				<label for="login_field">Email address </label> 
				<input type="text" name="login" id="login_field" 
				class="form-control" value=""/>
			</div>
			<br />
			<div>
				<label for="password">Password</label> 
				<input type="password" name="password" id="password" 
				class="form-control" value="" />
			</div>
			<br />
			<div>
				<input type="submit"  class="btn" value="Sign in"  />
			</div>
		</form>
	</div>

</body>
</html>