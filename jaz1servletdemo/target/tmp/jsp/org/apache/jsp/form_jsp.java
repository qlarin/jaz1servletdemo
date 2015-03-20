package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class form_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>Formularz</title>\r\n");
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
      out.write('\r');
      out.write('\n');
      jaz1servletdemo.source.Person person = null;
      synchronized (session) {
        person = (jaz1servletdemo.source.Person) _jspx_page_context.getAttribute("person", PageContext.SESSION_SCOPE);
        if (person == null){
          person = new jaz1servletdemo.source.Person();
          _jspx_page_context.setAttribute("person", person, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<h3>Formularz rejestracyjny</h3>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"addPerson.jsp\" method=\"get\">\r\n");
      out.write("\t\r\n");
      out.write("\t\tImię: <input type=\"text\" name=\"firstName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.firstName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("\t\tNazwisko: <input type=\"text\" name=\"surName\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.surName}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("\t\tEmail: <input type=\"text\" name=\"email\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br>\r\n");
      out.write("\t\tPowtórz email: <input type=\"text\" name=\"pemail\"><br>\r\n");
      out.write("\t\tPracodawca: <input type=\"text\" name=\"employer\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.employer}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br><br>\r\n");
      out.write("\t\tSkąd dowiedziałeś się o konferencji:<br><br>\r\n");
      out.write("\t\t\tOgłoszenie w pracy<input type=\"checkbox\" name=\"inf\" value=\"Ogłoszenie w pracy\" ><br>\r\n");
      out.write("\t\t\tOgłoszenie na uczelni<input type=\"checkbox\" name=\"inf\" value=\"Ogłoszenie na uczelni\" ><br>\r\n");
      out.write("\t\t\tFacebook<input type=\"checkbox\" name=\"inf\" value=\"Facebook\"><br>\r\n");
      out.write("\t\t\tZnajomi<input type=\"checkbox\" name=\"inf\" value=\"Znajomi\"><br>\r\n");
      out.write("\t\t\tInne (jakie?) <input type=\"text\" name=\"inf\"><br><br>\r\n");
      out.write("\t\tCzym się zajmujesz: <input type=\"text\" name=\"job\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${person.job}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\"><br><br>\r\n");
      out.write("\t\t<input type=\"submit\" value=\"Wyślij\"><br>\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t</form>\r\n");
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
