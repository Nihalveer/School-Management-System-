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
@WebServlet("/Delete")
public class StudDelete extends HttpServlet{
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id=req.getParameter("id");
		String sname=req.getParameter("sname");
		//String Stream=req.getParameter("stream");
		//String fees=req.getParameter("fees");
		  
		  int id1=Integer.parseInt(id);
		  //double Fees1=Double.parseDouble(fees);
		  
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("veer");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=em.find(Student.class, id1);
		s.setId(id1);	s.setName(sname);  //	s.setStream(Stream);    s.setFees(Fees1);
		
		et.begin();    	em.remove(s);     et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("Data Delete Succesfully");
			
		RequestDispatcher rd=req.getRequestDispatcher("Student.html");
		rd.forward(req, resp);
	}

}
