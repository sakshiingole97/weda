<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<script type="text/javascript" src="Validation.js"></script>
<!-- ================================================================================== -->

<!--==Using-Font-Awesome=====================-->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />
<!-- ================================================================================== -->

<style>
#login {
	width: 300px;
	padding: 30px;
	position: absolute;
	left: 50%;
	top: 50%;
	border-radius: 30px 30px 30px 30px;
	box-shadow: 0px 0px 10px 3px #ccc;
	transform: translate(-50%, -50%);
	background-color: white;
}

.log a {
	font-size: 1rem;
}

.log  h1 {
	font-size: 2rem;
}

.log i {
	font-size: 2rem;
}

.log input {
	font-size: 1.5rem;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: black;
	width: 100%
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
</head>
<body>
	<jsp:include page="index.jsp"></jsp:include>

	<form action="Customerss" method="post" onsubmit="AddCustValidation()"
		id="login">

		<table align="center" class="log" width="100%">
			<tr>
				<td colspan="2"><h1 align="center">Sign Up</h1></td>
			</tr>
			<tr>
				<td align="center"><i class="fa fa-user" aria-hidden="true"></i></td>
				<td><input
					type="text" name="cname" id="cname" placeholder="Enter your Name"></td>
			</tr>

			<tr>
				<td align="center"><i class="fa fa-envelope" aria-hidden="true"></i></td><td><input
					type="email" name="email" id="email"
					placeholder="Enter your EmailID"></td>
			</tr>

			 <tr>
				<td align="center"><i class="fa fa-user" aria-hidden="true"></i></td><td><input
					type="username" name="username" id="username"
					placeholder="Enter your Username"></td>
			</tr>

			<tr>
				<td align="center"><i class="fa fa-unlock-alt" aria-hidden="true"></i></td><td><input
					type="password" name="pass" id="pass"
					placeholder="Enter your Password"></td>
			</tr>

			<tr>
				<td align="center"><i class="fa fa-location-arrow" aria-hidden="true"></i></td><td><input
					type="text" name="adr" id="adr" placeholder="Enter your Address"></td>
			</tr>

			<tr>
				<td align="center"><i class="fa fa-phone" aria-hidden="true"></i></td><td><input
					type="number" name="cNo" id="cNo"
					placeholder="Enter your ContactNo"></td>
			</tr>
			<tr >
				<td align="center" colspan="2"><a href="Login.jsp">I am already member</a></td>
			</tr>
			<tr>
				<td align="center" colspan="2">
					<button type="submit" value="AddCustomer" name="action">Register</button>
				</td>
			</tr>
		</table>
	</form>
	
</body>
</html>

