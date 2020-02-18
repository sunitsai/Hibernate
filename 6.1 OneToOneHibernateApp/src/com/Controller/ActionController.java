package com.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Bean.EmpPersonaliNfo;
import com.Bean.EmployeeBean;
import com.Dao.DaoClass;



@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert")) {
			
			EmployeeBean emp = new EmployeeBean();
			EmpPersonaliNfo epi = new EmpPersonaliNfo();
			emp.setUname(request.getParameter("uname"));
			epi.setFname(request.getParameter("fname"));
			epi.setEmail(request.getParameter("email"));
			epi.setAddress(request.getParameter("address"));
			DaoClass.insertEmpPersonalInfo(epi);
			DaoClass.insertEmp(emp);
			
			response.sendRedirect("Show.jsp");
		}
	}

}
