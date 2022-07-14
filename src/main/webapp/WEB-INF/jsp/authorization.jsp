<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
		<h4><c:out value="${massage}"></c:out></h4>
				<form action="controller" method="post">
			<input type="hidden" name="command" value="do_authorization">
			<div>
				<label for="login_field">Email address </label> 
				<input type="text" name="login" id="login_field" 
				class="form-control" value="" required/>
			</div>
			<br />
			<div>
				<label for="password">Password</label> 
				<input type="password" name="password" id="password" 
				class="form-control"  value=""  required/>
			</div>
			<br />
			<div>
				<input type="submit"  class="btn" value="Sign in"  />
			</div>
		</form>
	</div>

</body>
</html>