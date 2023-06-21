<%@page import="schoolmanagement.Teacher"%>
<%@page import="javax.persistence.Persistence"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.EntityManagerFactory"%>
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
	String id= request.getParameter("id");
	int id1=Integer.parseInt(id);	
	
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("veer");
	EntityManager em=emf.createEntityManager();
	
	Teacher t=em.find(Teacher.class,id1);
%>
<form action="TUpdate" method="post">
<fieldset>
ID:-<input type="text" value="<%=t.getId()%>" name="id" > <br><br>
TEACHER NAME:-<input type="text" value="<%=t.getTname()%>"name="Tname"> <br><br>
SUBJECT:-<input type="text" value="<%=t.getSubject()%> "name="Subject" > <br><br>
SALARY:-<input type="text" value="<%=t.getSalary()%> "name="Salary"> <br><br>
<input type="Submit" >
<input type="Reset">
</fieldset>

</body>
</html>