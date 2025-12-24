<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Shubham</title>
</head>
<body>


	<h1>Shubham Desai</h1>
	<%!
		int res;
		public int  add(int x,int y){
			res= x+y;
			return res;
		}
	
	%>
	
	<% 
		int a=100;
		int b=200;
		int ans=add(a,b);
		
	
	%>
	  
	  <%= ans%>
</body>
</html>