<%@page import="schoolmanagement.Student"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1> Student Details Fetched</h1>
<% List<Student> s1=(List)session.getAttribute("Studentlist"); %>
<table align="center" cellpadding="20px" border="1">
<th> id</th>
<th> sname</th>
<th> Stream</th>
<th> fees</th>

<%for(Student s:s1){ %>
<tr>
<td><%= s.getId() %></td>
<td><%= s.getName() %></td>
<td><%= s.getStream() %></td>
<td><%= s.getFees() %></td>
</tr>
<%} %>
</table>
</body>
</html>