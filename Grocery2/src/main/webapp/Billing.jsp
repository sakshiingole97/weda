<%@page import="pojo.Order"%>
<%@ page import="java.util.*"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Order Details</title>
<style>
#All {
	font-size: 10rem;
	font-family: poppins;
}
</style>
</head>
<body>
	<jsp:include page="Header.jsp"></jsp:include>
	<form id="All">
		<%
		List<Order> od = (List) session.getAttribute("order");
		%>

		<%
		Iterator<Order> itr = od.iterator();
		while (itr.hasNext()) {
			Order o = itr.next();
		%>

		<table cellpadding="10" width="50%" align="center">
			<tr>
				<td><%=o.getCid()%></td>
				<td><%=o.getPname()%></td>
				<td><%=o.getBillAmount()%></td>
				<td><%=o.getDroplocation()%></td>
				<td><%=o.getPrice()%></td>
				<td><%=o.getQty()%></td>
				<td><%=o.getContact()%></td>
				<td><%=o.getOdate()%></td>
			</tr>

		</table>


		<%
		}
		%>
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>