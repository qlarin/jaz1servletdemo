<%@page import="jaz1servletdemo.source.Person"%>
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
<center><h3>Lista gości</h3><br>
<%	
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
%>
</center>
<p>
  <a href="form.jsp">Dodaj kolejnego</a><br>
  <a href="index.jsp">Wróć na główną stronę</a>
</p>

</body>
</html>