<%@page import="javax.persistence.EntityTransaction"%>
<%@page import="schoolmanagement.Student"%>
<%@page import="javax.persistence.EntityManager"%>
<%@page import="javax.persistence.Persistence"%>
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
	
	Student s=em.find(Student.class,id1);
%>
<form action="Update" method="post">
<fieldset>
ID:-<input type="text"  value="<%=s.getId()%> "name="id" > <br><br>
STUDENT NAME:-<input type="text"  value="<%=s.getName()%>"name="sname"> <br><br>
STREAM:-<input type="text" value="<%=s.getStream()%>" name="Stream" > <br><br>
FEES:-<input type="text" value="<%=s.getFees()%> "name="fees"> <br><br>
<input type="Submit" >
<input type="Reset">
</fieldset>
</body>
</html>