package om.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.StudentBean;
import com.dao.StudentDao;


@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert")) {
			
			StudentBean s = new StudentBean();
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			StudentDao.insertStudent(s);
			response.sendRedirect("show.jsp");
		}
		else if(action.equalsIgnoreCase("edit")) {
			int id = Integer.parseInt(request.getParameter("id"));
			StudentBean s = StudentDao.getAllStudentById(id) ;
			request.setAttribute("s",s);
			request.getRequestDispatcher("update.jsp").forward(request, response);
		}
		else if(action.equalsIgnoreCase("update")) {
			StudentBean s=new StudentBean();
			s.setId(Integer.parseInt(request.getParameter("id")));
			s.setFname(request.getParameter("fname"));
			s.setLname(request.getParameter("lname"));
			s.setEmail(request.getParameter("email"));
			StudentDao.updateStudent(s);
			response.sendRedirect("show.jsp");
		}
		else if (action.equalsIgnoreCase("delete")) {
			int id=Integer.parseInt(request.getParameter("id"));
			StudentDao.deleteStudent(id);
			response.sendRedirect("show.jsp");
			
		}
	}

}
