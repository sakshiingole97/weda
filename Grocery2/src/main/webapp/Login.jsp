<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<!-- ================================================================================== -->
<style type="text/css">
#login {
	width: 250px;
	padding: 50px;
	background-color: white;
	position: absolute;
	left: 50%;
	top: 50%;
	border-radius: 30px 30px 30px 30px;
	box-shadow: 0px 0px 10px 3px #ccc;
	transform: translate(-50%, -50%);
}

.log  h1 {
	font-size: 2rem;
}

.log i {
	font-size: 2rem;
}

.log a {
	text-decoration: none;
	font-size: 1rem;
}

.log select {
	font-size: 1.5rem;
	width: 60%;
	height: 35px;
	border-radius: 20px 20px 20px 20px;
}

.log input {
	font-size: 1.5rem;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: black;
	width: 80%;
	height: 35px;
}

.log button {
	font-size: 1.5rem;
	width: 50%;
	height: 35px;
	background: #4eb060;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: hidden;
	border-radius: 20px 20px 20px 20px;
}
</style>
<!-- ================================================================================== -->
<!--==Using-Font-Awesome=====================-->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />
<!-- ================================================================================== -->
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>

	<form action="LoginS" id="login" method="post"
		onsubmit="LoginValidation()">
		<table align="center" class="log" width="100%">
			<tr>
				<td colspan="2"><h1 align="center">Sign In</h1></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><select name="type" id="type">
						<option align="center">select</option>
						<option value="admin">Admin</option>
						<option value="user">User</option>
				</select></td>
			</tr>
			<tr align="center">
				<td align="center"><i class="fa fa-user" aria-hidden="true"></i></td>
				<td><input type="username" name="username" id="username"
					placeholder="Enter Your UserName"></td>
			</tr>

			<tr align="center">
				<td align="center"><i class="fa fa-unlock-alt" aria-hidden="true"></i></td>
				<td><input type="password" name="pass" id="pass"
					placeholder="Enter Your Password"></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><a href="Register.jsp">Create
						an account</a></td>
			</tr>
			<tr>
				<td align="center" colspan="2"><button type="submit"
						name="action">Login</button></td>
			</tr>
		</table>
	</form>


</body>
</html>
