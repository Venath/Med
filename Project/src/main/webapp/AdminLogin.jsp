<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>PharmaOrder Login</title>
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
 			background-color: rgba(255, 255, 255, 0.8); /* Adjust the last value for opacity */            border-radius: 8px;
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

    <h1>PharmaOrder Login</h1>
    <form action="login" method="post">
        User Name <input type="text" name="username" placeholder="Enter your username" required><br>
        Password <input type="password" name="password" placeholder="Enter your password" required><br>
        <input type="submit" name="submit" value="Login">
      
    
    </form>

</body>
</html>
