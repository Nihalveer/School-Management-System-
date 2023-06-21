package schoolmanagement;

import java.io.IOException;
import java.io.PrintWriter;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Insert")
public class TeachInsert extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		  String id=req.getParameter("id");
		  String tname=req.getParameter("Tname");
		  String Subject=req.getParameter("Subject");
		  String Salary=req.getParameter("Salary");
		  
		  int id1=Integer.parseInt(id);
		  long Salary1=Long.parseLong(Salary);
		  
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("veer");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Teacher t=new Teacher();
		t.setId(id1); t.setTname(tname); t.setSubject(Subject); t.setSalary(Salary1);
		
		et.begin();    	em.persist(t);      et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("Data Inserted Succesfully");
			
		RequestDispatcher rd=req.getRequestDispatcher("TeacherInsert.html");
		rd.forward(req, resp);
	}
}