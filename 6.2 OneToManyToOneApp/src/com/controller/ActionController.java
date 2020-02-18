package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Dept;
import com.bean.Emp;
import com.dao.EmpDao;

@WebServlet("/ActionController")
public class ActionController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action=request.getParameter("action");
		
		if(action.equalsIgnoreCase("insert dept"))
		{
			Dept d=new Dept();
			d.setDname(request.getParameter("dname"));
			EmpDao.insertDept(d);
		}
		else if(action.equalsIgnoreCase("insert emp"))
		{
			Dept d=new Dept();
			Emp e=new Emp();
			
			d.setDeptno(Integer.parseInt(request.getParameter("deptno")));
			e.setEname(request.getParameter("ename"));
			e.setDept(d);
			
			EmpDao.insertEmp(e);
		}
	}
	

}
