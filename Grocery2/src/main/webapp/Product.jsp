<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">


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
	background:  #4eb060;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: hidden;
	border-radius: 20px 20px 20px 20px;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	
	<form action="Pp" method="post" onsubmit="AddFoodValidation()">

		<table align="center" class="log" width="50%" class="log">
			
			<tr>
			<td><h1 align="center" action="AddFood">Add Product</h1></td>
			</tr>
			<tr>
				<td align="center"><input type="text" name="fname" id="fname" placeholder="Product Name"></td>
			</tr>

			<tr>
				<td align="center"><input type="text" name="ftype" id="ftype" placeholder="Catagoies"></td>
			</tr>

			<tr>
				<td align="center"><input type="number" name="fquan" id="fquan" placeholder="Qty"></td>
			</tr>

			<tr>
				<td align="center"><input type="number" name="fprice" id="fprice" placeholder="Price"></td>
			</tr>
			<tr>
				<td align="center"><button type="submit" value="Add" name="action">Add</button>
				</td>
			</tr>
		</table>

	</form>
	<jsp:include page="Footer.jsp"></jsp:include>		
	
</body>
</html>