package jdbc_servlet_student;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class StudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		String student_name=req.getParameter("student_name");
		String father_name=req.getParameter("father_name");
		String mother_name=req.getParameter("mother_name");
		long phone=Long.parseLong(req.getParameter("phone"));
		String address=req.getParameter("address");
		String email=req.getParameter("email");
		String password=req.getParameter("password");	
		String college=req.getParameter("college");
		double fees=Double.parseDouble(req.getParameter("fees"));
		
		Student student=new Student();
		student.setId(id);
		student.setStudent_name(student_name);
		student.setFather_name(father_name);
		student.setMother_name(mother_name);
		student.setPhone(phone);
		student.setAddress(address);
		student.setEmail(email);
		student.setPassword(password);
		
		ServletContext context=getServletContext();
		double price=Double.parseDouble(context.getInitParameter("College"));
		if (fees.equals("One")) {
			
		}
	}

}
