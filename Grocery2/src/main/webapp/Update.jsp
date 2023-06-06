<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String name=request.getParameter("cname");
String username=request.getParameter("username");
String email=request.getParameter("email");
String adr=request.getParameter("adr");
String con=request.getParameter("cNo");
%>

<c:set var="name1" value="<%= name%>"></c:set>
<c:set var="username1" value="<%=username %>"></c:set>
<c:set var="email1" value="<%=email %>"></c:set>
<c:set var="adr1" value="<%=adr %>"></c:set>
<c:set var="con1" value="<%=con %>"></c:set>

<sql:setDataSource var="con"
driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/dbuser"
user="root"
password="1234" />

<sql:query var="rs" dataSource="${con}">
select * from customer1;
</sql:query>

<sql:update var="x" dataSource="${con}">
update customer1 set name=?,address=?,Emailid=?,contact=? where username=?
<sql:param value="${name1}"></sql:param>
<sql:param value="${adr1}"></sql:param>
<sql:param value="${email1}"></sql:param>
<sql:param value="${con1}"></sql:param>
<sql:param value="${username1}"></sql:param>
</sql:update>

<c:if test="${x==1}">
<% response.sendRedirect("Success.jsp");%>
</c:if>

</body>
</html>