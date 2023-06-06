<%@page import="DaoImp.ProductDaoImp"%>
<%@page import="pojo.Product"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#All button {
	width: 50%;
	height: 40px;
	background: #ecf7ee;
	border-top-style: hidden;
	border-right-style: hidden;
	border-left-style: hidden;
	border-bottom-style: hidden;
	border-radius: 20px 20px 20px 20px;
}
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
	font-size: 3rem;
	    font-family: poppins;
	
}

#All a
{
	text-decoration: none;
	font-size: 2rem;
	color: black;
}

</style>


<script type="text/javascript" src="Validation.js"></script>
<script type="text/javascript">
function total(){
	quan=document.getElementById('quan').value;
	price=document.getElementById('price').value;
	total=price*quan;
	document.getElementById('tprice').value=total;
}

</script>
</head>
<body>


<jsp:include page="Foodlist.jsp"></jsp:include>

<%
ProductDaoImp fd=new ProductDaoImp();
  int foodId=Integer.parseInt(request.getParameter("Pid"));
  Product f=fd.searchFoodById(foodId);
  String emailId=(String)session.getAttribute("uEmail");
%>
<form action="Cc" method="post" onsubmit="AddCartValidation()" id="login">

<table  id="All" width="50%" align="center">
 

    <tr align="center">
    <td>ProductId :</td>
   <td><input type="number" name="fid" id="fid" value="<%=foodId %>"></td>
   </tr>
   
       <tr align="center">

   <td>UserName:</td>
   <td><input type="text" name="username" id="username" value="<%=emailId %>"></td>
   </tr>
    
    
    <tr align="center">
   <td>FoodName:</td>
   <td><input type="text" name="fname" id="fname" value="<%= f.getPname()%>"></td>
   </tr>
    
    <tr align="center">
   <td>Quantity:</td>
   <td><input type="number" name="quan" id="quan"></td>
   </tr>
   
    <tr align="center">
   <td>Price:</td>
   <td><input type="number" name="price" id="price" value="<%=f.getPrice() %>"></td>
   </tr>
   
    <tr align="center">
   <td>TotalPrice:</td>
   <td><input type="number" name="tprice" id="tprice" onclick="total()"></td>
   </tr>
   
   <tr><td align="right"><button type="submit" value="" name="action">Add</button>
   </td>
   <td  align="left"><button><a href="Foodlist.jsp">Don't</a></button>
   </td></tr>
</table>

</form>
<jsp:include page="Footer.jsp"></jsp:include>		

</body>
</html>