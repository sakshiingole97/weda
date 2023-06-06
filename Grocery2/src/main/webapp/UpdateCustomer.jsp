<%@page import="pojo.Customer"%>
<%@page import="DaoImp.CustomerDaoImp"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="Validation.js"></script>
<style type="text/css">
#All {
	font-size: 14rem;
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
	CustomerDaoImp cd = new CustomerDaoImp();
	String uEmail = (String) session.getAttribute("uEmail");
	Customer cs = cd.searchCustomerById(uEmail);
	%>

	<form action="Update.jsp" method="post"
		onsubmit="UpdateCustValidation()" id="All">

		<table align="center" cellpadding="20">

			<tr>
				<th colspan="3">Your Profile</th>
			</tr>


			<tr>
				<td>Name:</td>
				<td><input type="text" name="cname" id="cname"
					value="<%=cs.getName()%>"></td>
			</tr>

			<tr>
				<td>EmailId:</td>
				<td><input type="text" name="email" id="email"
					value="<%=cs.getEmailId()%>"></td>
			</tr>

			<tr>
				<td>User name:</td>
				<td><input type="text" name="username" id="username"
					value="<%=cs.getUserName()%>"></td>
			</tr>

			<tr>
				<td>Address:</td>
				<td><input type="text" name="adr" id="adr"
					value="<%=cs.getAddress()%>"></td>
			</tr>

			<tr>
				<td>Contact No:</td>
				<td><input type="number" name="cNo" id="cNo"
					value="<%=cs.getContactNo()%>"></td>
			</tr>
			<tr><td colspan="2" align="center"><button type="submit" >Update</button>
</td></tr>
<!--  <tr><td colspan="2" align="center"><button type="submit" value="UpdateCustomer" name="action">Update</button>
</td></tr>-->
		</table>
		
	</form>
	<jsp:include page="Footer.jsp"></jsp:include>

</body>
</html>