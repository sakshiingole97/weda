<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="pojo.Product"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#All button {
	width: 20%;
	height: 30px;
	background: #4eb060;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: hidden;
	border-radius: 20px 20px 20px 20px;
	border-top-style: hidden;
}

#login {
	width: 500px;
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
	font-size: 1.5rem;
	color: #4eb060;
}
</style>
</head>
<body>

	<jsp:include page="index.jsp"></jsp:include>
	<%
	List<Product> l = (List) session.getAttribute("flist");
	int i = 0;
	%>
	<form id="login">
		<table cellpadding="9" width="90%" id="All">
			<tr>
				<th>Name</th>
				<th>Type</th>
				<th>Quantity</th>
				<th>Price</th>
			</tr>
			<%
			Iterator<Product> itr = l.iterator();
			while (itr.hasNext()) {
				Product f = itr.next();
				i = f.getPid();
			%>

			<tr>
				<td align="center"><%=f.getPname()%></td>
				<td align="center"><%=f.getCategory()%></td>
				<td align="center"><%=f.getQty()%></td>
				<td align="center"><%=f.getPrice()%></td>
				<td align="left"><a href="Cart.jsp?Pid=<%=i%>">Add</a></td>
			</tr>


			<%
			}
			%>
		</table>
	</form>
</body>
</html>