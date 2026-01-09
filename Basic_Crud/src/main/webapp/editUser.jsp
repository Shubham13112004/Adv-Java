<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Edit User</title>
    <style>
        /* General body styling */
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(to right, #74ebd5, #ACB6E5);
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        /* Form container */
        form {
            background-color: #ffffffcc;
            padding: 40px 30px;
            border-radius: 15px;
            box-shadow: 0 8px 20px rgba(0,0,0,0.2);
            width: 400px;
        }

        h2 {
            text-align: center;
            color: #333;
            margin-bottom: 30px;
            font-size: 28px;
            letter-spacing: 1px;
        }

        /* Input fields styling */
        input[type="text"],
        input[type="email"] {
            width: 100%;
            padding: 12px 15px;
            margin: 10px 0 20px 0;
            border: 1px solid #ccc;
            border-radius: 8px;
            transition: 0.3s;
        }

        input[type="text"]:focus,
        input[type="email"]:focus {
            border-color: #74ebd5;
            box-shadow: 0 0 8px #74ebd5;
            outline: none;
        }

        /* Submit button styling */
        input[type="submit"] {
            width: 100%;
            padding: 12px;
            background-color: #74ebd5;
            border: none;
            border-radius: 8px;
            color: #fff;
            font-size: 16px;
            font-weight: bold;
            cursor: pointer;
            transition: 0.3s;
        }

        input[type="submit"]:hover {
            background-color: #ACB6E5;
        }

        /* Back link styling */
        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            color: #0d6efd;
            text-decoration: none;
            font-weight: bold;
            transition: 0.3s;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>

<h2>Edit User</h2>

<form action="<%= request.getContextPath() %>/update" method="post">
    <input type="hidden" name="id" value="<%= request.getAttribute("id") %>">
    
    Name: <input type="text" name="name" value="<%= request.getAttribute("name") %>" required><br>
    Email: <input type="email" name="email" value="<%= request.getAttribute("email") %>" required><br>
    Country: <input type="text" name="country" value="<%= request.getAttribute("country") %>" required><br>
    
    <input type="submit" value="Update">
</form>

<a class="back-link" href="UserList.jsp">← Back to Users List</a>

</body>
</html>
