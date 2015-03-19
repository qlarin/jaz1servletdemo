package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.*;

public final class addPerson_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      jaz1servletdemo.source.Person person = null;
      synchronized (session) {
        person = (jaz1servletdemo.source.Person) _jspx_page_context.getAttribute("person", PageContext.SESSION_SCOPE);
        if (person == null){
          person = new jaz1servletdemo.source.Person();
          _jspx_page_context.setAttribute("person", person, PageContext.SESSION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("person"), request);
      out.write("  \r\n");
      jaz1servletdemo.repo.Archive archive = null;
      synchronized (application) {
        archive = (jaz1servletdemo.repo.Archive) _jspx_page_context.getAttribute("archive", PageContext.APPLICATION_SCOPE);
        if (archive == null){
          archive = new jaz1servletdemo.repo.Archive();
          _jspx_page_context.setAttribute("archive", archive, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      jaz1servletdemo.repo.makeList makeList = null;
      synchronized (application) {
        makeList = (jaz1servletdemo.repo.makeList) _jspx_page_context.getAttribute("makeList", PageContext.APPLICATION_SCOPE);
        if (makeList == null){
          makeList = new jaz1servletdemo.repo.makeList();
          _jspx_page_context.setAttribute("makeList", makeList, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');
      jaz1servletdemo.repo.Refresh refresh = null;
      synchronized (application) {
        refresh = (jaz1servletdemo.repo.Refresh) _jspx_page_context.getAttribute("refresh", PageContext.APPLICATION_SCOPE);
        if (refresh == null){
          refresh = new jaz1servletdemo.repo.Refresh();
          _jspx_page_context.setAttribute("refresh", refresh, PageContext.APPLICATION_SCOPE);
        }
      }
      out.write('\r');
      out.write('\n');

	refresh.clearList(person.getInfo());
	for(String info: request.getParameterValues("inf")){
		makeList.makeNewList(person.getInfo(), info);
	}	
 	archive.add(person);

      out.write("\r\n");
      out.write("<p>Gratulacje, dodano cię na listę gości.</p>\r\n");
      out.write("<p>\r\n");
      out.write("  <a href=\"showAll.jsp\">Pokaż wszystkich</a>\r\n");
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
