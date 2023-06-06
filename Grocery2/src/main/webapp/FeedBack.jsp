<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.login {
	width: 250px;
	padding: 50px;
	background-color: white;
	position: absolute;
	left: 50%;
	top: 50%;
	border-radius: 30px 30px 30px 30px;
	box-shadow: 0px 0px 10px 3px #ccc;
	transform: translate(-50%, -50%);
	box-shadow: 0px 0px 10px 3px #ccc;
}

.log  h1 {
	font-size: 2rem;
}

.log i {
	font-size: 2rem;
}

.log a {
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
	background: lightblue;
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
	<jsp:include page="Header.jsp"></jsp:include>
	<form action="FeedBackS" method="post" onsubmit="AddFeedValidation()"
		id="login">
		<table class="log" align="center">
			<tr>
				<td><h1 align="center">Add FeedBack</h1></td>
			</tr>
			<tr>
				<td><i class="fa fa-user" aria-hidden="true"><input type="text" name="cname" id="cname" placeholder="  Enter Your Name"></td>
			</tr>

			<tr>
				<td><i class="fa fa-envelope" aria-hidden="true"><input type="email" name="email" id="email" placeholder="  Enter Your EmailID"></td>
			</tr>

			<tr>
				<td><i class="fa fa-comments" aria-hidden="true"></i><input type="text" name="review" id="review" placeholder="  Enter Your Review"></td>
			</tr>

			<tr>
				<td><i class="fa fa-star" aria-hidden="true"></i><input type="number" name="rank" id="rank" placeholder="  Ranking 1-10"></td>
			</tr>

			<tr>
				<td><i class="fa fa-comments" aria-hidden="true"></i><input type="text" name="sug" id="sug" placeholder="  Any Suggestion"></td>
			</tr>
			<tr>
				<td align="center"><button type="submit" name="action">Submit</button>
				</td>
			</tr>
		</table>

	</form>
	<jsp:include page="Footer.jsp"></jsp:include>		
	
</body>
</html>