<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>


<link rel="stylesheet" type="text/css" href="css/Nav.css">
<style>
*
{
	text-decoration:none;
}

.header .navbar a
{ 
    font-size:1.5rem;
	padding: 2px 1px;
    margin: 0px 15px;
    color: #3b3b3b;
    font-weight: 500;
    letter-spacing: 0.5px;
    transition: all ease 0.3s;
}
.header .navbar1 a
{ 
    font-size:2rem;
	padding: 2px 1px;
    margin: 0px 15px;
    color: #3b3b3b;
    font-weight: 500;
    letter-spacing: 0.5px;
    transition: all ease 0.3s;
}
.header .navbar1 a:hover
{
	color:#40aa54;
}

</style>
<!-- ================================================================================== -->

<!-- ================================================================================== -->
<link rel="shortcut icon" href="images/fav-icon.png" />
<!--==Using-Font-Awesome=====================-->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />
<!--==Import-Font-Family======================-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
	rel="stylesheet">

<!-- ===========JavaScript Connection=======-->
<script type="text/javascript"
	src="C:\Users\ADMIN\Desktop\jquery\jsq.min.js"></script>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.4/jquery.min.js"></script>
<script type="text/javascript" src="javascript/fun.js">
</script>
</head>
<body>
<%String uEmail=(String)session.getAttribute("uEmail"); 
  String aEmail=(String)session.getAttribute("aEmail");%>

	<header class="header">
		<a href="Gs.html" class="logo"><i class="fa fa-shopping-basket"></i>Grocery</a>
		<%if(uEmail==null && aEmail==null){ %>
		<nav class="navbar">
			<table>
				<tr>
					<td><a href="index.jsp">Home</a></td>
					<td><a href="#popular-product">Product</a></td>
					<td><a href="#category">Categories</a></td>
					<td><a href="#popular-bundle-pack">Our Packages</a></td>
					<td>
				</tr>
			</table>
		</nav>
		<div class="icons">
			<table>
				<tr>
					<td><a href="Login.jsp"><div class="fa fa-user" id="user-btn"></div></a></td>
				</tr>
			</table>
		</div>
		<%} %>
		<%if(uEmail==null && aEmail!=null){ %>
		<nav class="navbar1">
			<table>
				<tr>
					<td><a href="index.jsp"><b>Home</b></td>
					<td><a href="Product.jsp"><b>Add Product</b></td>
					<td><a href="Pp"><b>Product List</b></td>
					<td><a href="Customerss"><b>Customer List</b></td>
					<td><a href="Oo"><b>Order Details</b></a>
					<td>
				</tr>
			</table>
		</nav>
		<div class="icons">
			<table>
				<tr>
					<td><a href="LoginS"><div class="fa fa-user" id="user-btn"></div></a></td>
				</tr>
			</table>
		</div>
		<%} %>
		<%if(uEmail!=null && aEmail==null){ %>
		<nav class="navbar1">
			<table>
				<tr>
					<td><a href="index.jsp"><b>Home</b></td>
					<td><a href="Pp"><b>Product List</b></td>
					<td><a href="FeedBack.jsp"><b>Add Feedback</b></td>
					<td>
				</tr>
			</table>
		</nav>
		<div class="icons">
			<table>
				<tr>
					<td><a href="Cc"><div class="fa fa-shopping-cart" id="shopping-btn"></div></a></td>
					<td><a href="LoginS"><div class="fa fa-user" id="user-btn"></div></a></td>
					<td><a href="UpdateCustomer.jsp"><div class="fa fa-edit" id="edit-btn"></div></a></td>
				</tr>
			</table>
		</div>
		<%} %>

	</header>


</body>
</html>