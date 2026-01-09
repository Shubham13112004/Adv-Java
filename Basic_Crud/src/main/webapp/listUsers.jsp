<%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html>
<html>
<head>
    <title>User List</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: #f4f7f8;
            margin: 0;
            padding: 20px;
        }

        h2 {
            text-align: center;
            color: #0d6efd;
            margin-bottom: 30px;
            font-size: 28px;
        }

        table {
            width: 90%;
            margin: 0 auto 20px auto;
            border-collapse: collapse;
            box-shadow: 0 4px 15px rgba(0,0,0,0.1);
            background-color: #ffffff;
            border-radius: 10px;
            overflow: hidden;
        }

        th, td {
            padding: 12px 20px;
            text-align: center;
        }

        th {
            background-color: #0d6efd;
            color: #ffffff;
            font-weight: bold;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        tr:hover {
            background-color: #e6f0ff;
        }

        a {
            text-decoration: none;
            color: #fff;
            padding: 5px 12px;
            border-radius: 5px;
            transition: 0.3s;
        }

        a[href*="edit"] {
            background-color: #198754; /* green */
        }

        a[href*="edit"]:hover {
            background-color: #145c3a;
        }

        a[href*="delete"] {
            background-color: #dc3545; /* red */
        }

        a[href*="delete"]:hover {
            background-color: #a71d2a;
        }

        .add-user {
            display: block;
            width: 200px;
            margin: 20px auto 0 auto;
            text-align: center;
            background-color: #0d6efd;
            color: #fff;
            padding: 10px 0;
            border-radius: 8px;
            text-decoration: none;
            transition: 0.3s;
        }

        .add-user:hover {
            background-color: #084298;
        }
    </style>
</head>
<body>

<h2>All Users</h2>

<table>
<tr>
    <th>ID</th>
    <th>Name</th>
    <th>Email</th>
    <th>Country</th>
    <th>Action</th>
</tr>

<%
    ResultSet rs = (ResultSet) request.getAttribute("users");
    while (rs.next()) {
%>
<tr>
    <td><%= rs.getInt("id") %></td>
    <td><%= rs.getString("name") %></td>
    <td><%= rs.getString("email") %></td>
    <td><%= rs.getString("country") %></td>
    <td>
        <a href="edit?id=<%= rs.getInt("id") %>">Edit</a> 
        <a href="delete?id=<%= rs.getInt("id") %>">Delete</a>
    </td>
</tr>
<% } %>

</table>

<a class="add-user" href="AddUser.jsp">+ Add New User</a>

</body>
</html>
