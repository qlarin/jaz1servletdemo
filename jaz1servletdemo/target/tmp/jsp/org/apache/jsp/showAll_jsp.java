package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import jaz1servletdemo.source.Person;

public final class showAll_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      jaz1servletdemo.repo.Archive archive = null;
      synchronized (application) {
        archive = (jaz1servletdemo.repo.Archive) _jspx_page_context.getAttribute("archive", PageContext.APPLICATION_SCOPE);
        if (archive == null){
          archive = new jaz1servletdemo.repo.Archive();
          _jspx_page_context.setAttribute("archive", archive, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("<center><h3>Lista gości</h3><br>\r\n");
	
  for (Person person : archive.getAll()) {
	  out.println("<p><b>Imię: </b>" + person.getFirstName() +
			  "<br><b> Nazwisko: </b>" + person.getSurName() +
			  "<br><b> Email: </b>" + person.getEmail() +
			  "<br><b> Pracodawca: </b>" + person.getEmployer() +
			  "<br><b> Zajęcie: </b>" + person.getJob() +
			  "<br><br><b> Źródło informacji: </b>" + person.getInfo() +
			  "<br>");
	  for(int i=0; i<100; i++){
		  out.print("-");
	  }
	  out.println("");
  	}

      out.write("\r\n");
      out.write("</center>\r\n");
      out.write("<p>\r\n");
      out.write("  <a href=\"form.jsp\">Dodaj kolejnego</a><br>\r\n");
      out.write("  <a href=\"index.jsp\">Wróć na główną stronę</a>\r\n");
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
