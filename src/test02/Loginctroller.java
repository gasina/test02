package test02;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class Loginctroller extends HttpServlet{

	@Override
	public void doGet(HttpServletRequest requset, HttpServletResponse response) throws IOException{
		response.getWriter().write("hi");
	}
	
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		super.doPost(req,resp);
	} 
	
	}