<%@page import="com.bean.StudentBean"%>
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
	StudentBean s=(StudentBean)request.getAttribute("s");
%>
<form name="insert" method="post" action="ActionController">
	<table>
		<tr>
			<td><input type="hidden" name="id" value="<%=s.getId()%>"></td>
		</tr>
		<tr>
			<td>First Name</td>
			<td><input type="text" name="fname" value="<%=s.getFname()%>"></td>
		</tr>
		<tr>
			<td>Last Name</td>
			<td><input type="text" name="lname" value="<%=s.getLname()%>"></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type="text" name="email" value="<%=s.getEmail()%>"></td>
		</tr>
		<tr>
			<td colspan="2" align="center">
				<input type="submit" name="action" value="Update">
			</td>
		</tr>
	</table>
</form>
<a href="show.jsp">Show All Student</a>

</body>
</html>