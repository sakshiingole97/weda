<%@page import="java.util.Iterator"%>
<%@ page import="java.util.List"%>
<%@ page import="pojo.Customer"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#All {
	font-size: 10rem;
	font-family: poppins;
	
}
</style>

</head>
<body>

<jsp:include page="Header.jsp"></jsp:include>
<jsp:include page="Line.jsp"></jsp:include>
	<%
	String uEmail = (String) session.getAttribute("uEmail");
	String aEmail = (String) session.getAttribute("aEmail");
	List<Customer> l = (List) session.getAttribute("cslist");
	%>
	<form id="All">
		<table cellpadding="5" width="50%" align="center">
			<caption>
				<h1>Customer Details</h1>
			</caption>

			<tr>
				<th>Name</th>
				<th>Email ID</th>
				<th>Contact No.</th>
				<th>Address</th>
				

			<%
			Iterator<Customer> itr = l.iterator();
			while (itr.hasNext()) {
				Customer f = itr.next();
			%>

			<tr align="center">
				<td><%=f.getName()%></td>
				<td><%=f.getEmailId()%></td>
				<td><%=f.getContactNo()%></td>
				<td><%=f.getAddress() %>
				</tr>
			<%
			}
			%>
		</table>
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>
</body>
</html>