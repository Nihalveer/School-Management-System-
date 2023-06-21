<%@page import="schoolmanagement.Teacher"%>
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
<h1>Teacher Details Fetched </h1>
<% List<Teacher> t1=(List)session.getAttribute("TeacherList");%>
<table align="center" cellpadding="20px" border="1">
<th> id</th>
<th> Tname</th>
<th> Subject</th>
<th> Salary</th>

<%for(Teacher t:t1){ %>
<tr>
<td><%= t.getId() %></td>
<td><%= t.getTname() %></td>
<td><%= t.getSubject()  %></td>
<td><%= t.getSalary() %></td>
</tr>
<%} %>
</table>
</body>
</html>