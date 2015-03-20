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
		for(String info: request.getParameterValues("inf")){
					person.setInfo(info);
		}	
 		archive.add(person);
 		person.clearInfo();
 		RequestDispatcher dispatcher = request.getRequestDispatcher("/RegisterServlet");
		dispatcher.forward(request, response);
%>
</body>
</html>