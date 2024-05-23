<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>User Account</title>

    <style type="text/css">
        body {
            font-family: 'Hind SemiBold', sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        table {
            width: 50%;
            margin: 20px auto;
            border-collapse: collapse;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
            background-color: #fff;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f9f9f9;
        }

        tr:hover {
            background-color: #e0e0e0;
        }

       input[type="button"] {
    background-color: #007bff;
    color: #fff;
    padding: 10px 20px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
    margin-top: 10%;
    
     /* Adjust the percentage based on your preference */
    transform: translateY(-50%);
}


        input[type="button"]:hover {
            background-color: #0056b3;
        }

        br {
            margin-bottom: 20px;
        }

        a {
            text-decoration: none;
        }

        /* Add more styles as needed */
    </style>
</head>
<body>

    <table>
        <c:forEach var="cus" items="${cusDetails}">
            <c:set var="id" value="${cus.id}"/>
            <c:set var="name" value="${cus.name}"/>
            <c:set var="email" value="${cus.email}"/>
            <c:set var="phone" value="${cus.phone}"/>
            <c:set var="username" value="${cus.userName}"/>
            <c:set var="password" value="${cus.password}"/>

            <tr>
                <th>Attribute</th>
                <th>Value</th>
            </tr>
            <tr>
                <td>Customer ID</td>
                <td>${cus.id}</td>
            </tr>
            <tr>
                <td>Customer Name</td>
                <td>${cus.name}</td>
            </tr>
            <tr>
                <td>Customer Email</td>
                <td>${cus.email}</td>
            </tr>
            <tr>
                <td>Customer Phone</td>
                <td>${cus.phone}</td>
            </tr>
            <tr>
                <td>Customer User Name</td>
                <td>${cus.userName}</td>
            </tr>
        </c:forEach>
    </table>

    <c:url value="updatecustomer.jsp" var="cusupdate">
        <c:param name="id" value="${id}"/>
        <c:param name="name" value="${name}"/>
        <c:param name="email" value="${email}"/>
        <c:param name="phone" value="${phone}"/>
        <c:param name="uname" value="${username}"/>
        <c:param name="pass" value="${password}"/>
    </c:url>

    <a href="${cusupdate}">
        <input type="button" name="update" value="Update My Data">
    </a>

    

    <c:url value="deletecustomer.jsp" var="cusdelete">
        <c:param name="id" value="${id}" />
        <c:param name="name" value="${name}" />
        <c:param name="email" value="${email}" />
        <c:param name="uname" value="${username}" />
        <c:param name="pass" value="${password}" />
    </c:url>

    <a href="${cusdelete}">
        <input type="button" name="delete" value="Delete My Account">
    </a>

</body>
</html>
