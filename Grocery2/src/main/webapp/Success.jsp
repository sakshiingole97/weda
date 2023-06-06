<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Success</title>
<style type="text/css">
#login {
	width: 250px;
	padding: 50px;
	background-color: white;
	position: absolute;
	left: 50%;
	top: 50%;
	font-size: 4rem; font-family : poppins;
	border-radius: 30px 30px 30px 30px;
	box-shadow: 0px 0px 10px 3px #ccc;
	transform: translate(-50%, -50%);
	font-family: poppins;
}

#login button {
	font-size: 1.5rem;
	width: 30%;
	height: 35px;
	background: #4eb060;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: hidden;
	border-radius: 20px 20px 20px 20px;
}

#
#login a {
	text-decoration: none;
	color: black;
}
</style>
</head>
<body>
	<jsp:include page="UpdateCustomer.jsp"></jsp:include>
	<form id="login" align="center">
		
		<h1>Updated</h1>
		<button>
			<a href="UpdateCustomer.jsp">Ok</a>
		</button>
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>