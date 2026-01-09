<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<form action="<%= request.getContextPath() %>/Servlet2" method="post">
<input type="text" name="Username" placeholder = "Enter your Username">
<input type="password" name="Password" placeholder = "Enter your Password">
<button>Submit</button>

</form>

</body>
</html>