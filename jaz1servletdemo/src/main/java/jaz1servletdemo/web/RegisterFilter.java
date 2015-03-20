package jaz1servletdemo.web;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;

import jaz1servletdemo.repo.Register;

@WebFilter({"addPerson.jsp"})
public class RegisterFilter implements Filter {

    public RegisterFilter() {
       
    }

	public void destroy() {
		
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		HttpSession session = ((HttpServletRequest) request).getSession();
		if(!Register.getRegisteredList().contains(session.getId())){
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/registerError.jsp");
			dispatcher.forward(request, response);
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
