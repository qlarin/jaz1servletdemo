package jaz1servletdemo.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InfoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public InfoServlet() {
        super();
  
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String selectedInfo = "";
		
		for(String info: request.getParameterValues("inf")){
			selectedInfo += info + " ";
		}
		out.println(selectedInfo);
		
	}


}
