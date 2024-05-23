<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>PharmaOrder Registration</title>
    <style type="text/css">
        body {
            font-family: Arial, sans-serif;
            background-color: #4A4A4A;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        h1 {
            color: #007bff;
        }

        form {
            margin: 50px auto;
            width: 300px;
            padding: 30px;
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        input {
            width: 100%;
            padding: 10px;
            margin: 8px 0;
            box-sizing: border-box;
        }

        input[type="submit"] {
            background-color: #007bff;
            color: #fff;
            cursor: pointer;
        }
    </style>
</head>
<body>

    <h1>PharmaOrder Registration</h1>
    <form action="register" method="post">
        Name <input type="text" name="name" placeholder="Enter your name" required><br>
        Phone Number <input type="tel" name="phone" placeholder="Enter your phone number" required><br>
        Email <input type="email" name="email" placeholder="Enter your email" required><br>
        User Name <input type="text" name="username" placeholder="Choose a username" required><br>
        Password <input type="password" name="password" placeholder="Choose a password" required><br>
        <input type="submit" name="submit" value="Register">
    </form>

</body>
</html>
