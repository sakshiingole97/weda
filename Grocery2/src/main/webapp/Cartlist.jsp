<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="pojo.Cart"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Cartlist</title>
<style>

#login {
	width: 400px;
	padding: 50px;
	background-color: white;
	position: absolute;
	left: 50%;
	top: 50%;
	border-radius: 30px 30px 30px 30px;
	box-shadow: 0px 0px 10px 3px #ccc;
	transform: translate(-50%, -50%);
}


#All {
	font-size: 5rem;
	font-family: poppins;
}

#All a {
	text-decoration: none;
	font-size: 1rem;
	color: black;
}

#All button {
	width: 70%;
	height: 40px;
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
	<%
	String u = null;
	%>
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="Line.jsp"></jsp:include>

	<%
	List<Cart> l = (List) session.getAttribute("clist");
	%>
	<form  id="">
		<table cellpadding="10" width="50%" align="center" id="All">
			<caption>
				<h1>Cart list</h1>
			</caption>

			<tr>

				<th>Product Name</th>
				<th>Quantity</th>
				<th>Price</th>
				<th>Total Price</th>
			</tr>

			<%
			Iterator<Cart> itr = l.iterator();
			while (itr.hasNext()) {
				Cart c = itr.next();
				u = c.getUsername();
			%>

			<tr align="center">

				<td><%=c.getProductname()%></td>
				<td><%=c.getQty()%></td>
				<td><%=c.getPrice()%></td>
				<td><%=c.getQty() * c.getPrice()%></td>
				<td colspan="3"><button><a
					href="Cc?action=delete&cartId=<%=c.getCid()%>">Remove</a></button></td>
			</tr>

			<%
			}
			%>
			<tr>
				<td colspan="5" align="center"><button>
						<a href="Oo?action=Add&username=<%=u%>">Pay</a>
					</button></td>
			</tr>

		</table>
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>