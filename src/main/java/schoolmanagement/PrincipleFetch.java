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
@WebServlet("/CreateAccount")
public class PrincipleFetch extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String Name=req.getParameter("Name");
		String Age=req.getParameter("Age");
		String Email=req.getParameter("Email");
		String Password=req.getParameter("Password");
		String Mobile=req.getParameter("MobileNumber");
				
		int Age1=Integer.parseInt(Age);
 		long Mobile1=Long.parseLong(Mobile);
		
		Principle p=new Principle();
		p.setName(Name);
		p.setEmail(Email);
		p.setAge(Age1);
		p.setMobile(Mobile1);
		p.setPassword(Password);

		EntityManagerFactory emf=Persistence.createEntityManagerFactory("veer");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
				
		et.begin();
		em.persist(p);
		et.commit();
		
		PrintWriter pw=resp.getWriter();
		pw.write("Account Created");
			
		RequestDispatcher rd=req.getRequestDispatcher("Login.html");
		rd.forward(req, resp);
	}

	}
