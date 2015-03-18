<%@page import="jaz1servletdemo.source.Person"%>
<%@page import="jaz1servletdemo.source.Info"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="archive" class="jaz1servletdemo.repo.Archive" scope="application" />
<%
  for (Person person : archive.getAll()) {
	  out.println("<p>Imię: " + person.getFirstName() + "<br> Nazwisko: " + person.getSurName() + "</p><br>");
  	}
  for (Info info : archive.getAllInfo()){
	  out.println("<p>Skąd wiesz: " + info.getInf1() + ", " + info.getInf2() + ", " + info.getInf3() + ", " + info.getInf4() + ", " + info.getInf5() + "</p><br>");
	}
 
%>
<p>
  <a href="form.jsp">Dodaj kolejnego</a><br>
  <a href="index.jsp">Wróć na główną stronę</a>
</p>

</body>
</html>