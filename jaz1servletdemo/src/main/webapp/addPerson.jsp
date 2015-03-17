<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="person" class="jaz1servletdemo.source.Person" scope="session" />
<jsp:setProperty name="person" property="*" /> 
<jsp:useBean id="archive" class="jaz1servletdemo.repo.Archive" scope="application" />

<% 
  archive.add(person);
%>

<p>Dodano na listę: </p>
<p>Imię: ${person.firstName} </p>
<p>Nazwisko: <jsp:getProperty name="person" property="surName"></jsp:getProperty></p>
<p>
  <a href="showAll.jsp">Pokaż wszystkich</a>
</p>

</body>
</html>