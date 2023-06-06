<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="pojo.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Foodlist</title>
<style type="text/css">
#All {
	font-size: 10rem;
	font-family: poppins;
}

#All a {
	color: black;
}

#All button {
	font-size: 2rem;
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
	<jsp:include page="Header.jsp"></jsp:include>
	<jsp:include page="Line.jsp"></jsp:include>
	<%
	String uEmail = (String) session.getAttribute("uEmail");
	String aEmail = (String) session.getAttribute("aEmail");
	String Spname = (String) session.getAttribute("pname");
	List<Product> l = (List) session.getAttribute("flist");
	%>
	<form id="All">
		<table border-bottom-style="1" cellpadding="10" width="90%"
			align="center">
			<caption>
				<h1>Product List</h1>
			</caption>

			<tr>
				<th>Id</th>
				<th>Product Name</th>
				<th>Catogory</th>
				<th>Quantity</th>
				<th>Price</th>

			</tr>

			<%
			Iterator<Product> itr = l.iterator();
			while (itr.hasNext()) {
				Product f = itr.next();
			%>

			<tr align="center">
				<td><%=f.getPid()%></td>
				<td><%=f.getPname()%></td>
				<td><%=f.getCategory()%></td>
				<td><%=f.getQty()%></td>
				<td><%=f.getPrice()%></td>

				<%
				if (uEmail == null && aEmail != null) {
				%>
				<td align="right"><button>
						<a href="UpdateFood.jsp?foodId=<%=f.getPid()%>">Edit</a>
					</button></td>
				<td align="left"><button>
						<a href="Pp?action=delete&foodId=<%=f.getPid()%>">Delete</a>
					</button></td>
				<%
				}
				%>
				<%
				if (uEmail != null && aEmail == null) {
				%>
				<td><button>
						<a href="Cart.jsp?Pid=<%=f.getPid()%>">Add</a>
					</button></td>
				<%
				}
				%>
			</tr>
			<%
			}
			%>
		</table>
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>