<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new product</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f3f3f3;
        text-align: center;
        margin: 0;
        padding: 0;
    }

    h3.alert {
        color: green;
    }

    h1 {
        color: #007bff;
    }

    form {
        margin: 50px auto;
        width: 400px;
        padding: 20px;
        background-color: rgba(255, 255, 255, 0.8);
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }

    form input[type="text"],
    form input[type="number"] {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    form textarea {
        width: 100%;
        padding: 10px;
        margin: 10px 0;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
    }

    form input[type="submit"] {
        width: 100%;
        background-color: #007bff;
        color: #fff;
        padding: 10px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }

    form input[type="submit"]:hover {
        background-color: #0056b3;
    }
</style>

</head>
<body>

<h1>PharmaOrder Add new product</h1>
<form action="insert" method="post">
    Name <input type="text" name="prodname" placeholder="Product name" required><br>
    Category <input type="text" name="category" placeholder="Product Category" required><br>
    Dosage <input type="text" name="dosage" placeholder="Product Dosage" required><br>
    Price <input type="number" name="productPrice" placeholder="Product Price" required><br>
    Quantity <input type="number" name="quantity" placeholder="Product Quantity" required><br>
    Description <textarea name="" rows="4" placeholder="Product Description" required></textarea><br>
   
    <input type="submit" name="submit" value="Add product">
</form>

</body>
</html>