<%@page import="pojo.Order"%>
<%@ page import="java.util.*"%>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
		List<Order> od = (List) session.getAttribute("history");
		%>

		<%
		Iterator<Order> itr = od.iterator();
		while (itr.hasNext()) {
			Order o = itr.next();
		%>

	<table cellpadding="10" width="50%" align="center" border="1">
		<tr>
			<td><%=o.getOid()%></td>

			<td><%=o.getUsername()%></td>

			<td><%=o.getBillAmount()%></td>

			<td><%=o.getOdate()%></td>
		</tr>

	</table>


	<%
		}
		%>
	</form>
</body>
</html>