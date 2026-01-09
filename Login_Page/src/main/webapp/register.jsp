<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<form action ="regform" method = "post">
		Name: <input type="text" name="name1"><br><br>
		Email: <input type="text" name="email1"><br><br>
		Password: <input type="password" name="password1"><br><br>
		Gender:
        <input type="radio" name="gender" value="Male"> Male
        <input type="radio" name="gender" value="Female"> Female
        <br><br>
        City: <select name ="city">
        <option>Select City</option>
        <option> Kolhapur</option>
        <option>Pune</option>
        <option>Mumbai</option>
        
        </select><br><br>
		
		<input type = "submit" value = "register">
		
		</form>
</body>
</html>