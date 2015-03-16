<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Formularz</title>
</head>
<body>
	<h3>Formularz rejestracyjny</h3>
	<form action="test">
		Imię: <input type="text" name="name"><br>
		Nazwisko: <input type="text" name="surname"><br>
		Email: <input type="text" name="email"><br>
		Powtórz email: <input type="text" name="pemail"><br>
		Pracodawca: <input type="text" name="employer"><br><br>
		Skąd dowiedziałeś się o konferencji:<br><br>
			Ogłoszenie w pracy<input type="checkbox" name="inf" value="Ogłoszenie w pracy"><br>
			Ogłoszenie na uczelni<input type="checkbox" name="inf" value="Ogłoszenie na uczelni"><br>
			Facebook<input type="checkbox" name="inf" value="Facebook"><br>
			Znajomi<input type="checkbox" name="inf" value="Znajomi"><br>
			Inne (jakie?)<input type="text" name="inf"><br><br>
		Czym się zajmujesz?<input type="text" name="job"><br><br>
		<input type="submit" value="Wyślij"><br>	
		
	</form>
</body>
</html>