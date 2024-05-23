<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="med.css">

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>PharmaOrder Home</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f3f3f3;
            text-align: center;
            margin: 0;
            padding: 0;
        }

        header {
            background-color: #007bff;
            color: #fff;
            padding: 10px 0;
        }

        nav {
            background-color: #333;
            color: #fff;
            padding: 10px 0;
        }

        nav a {
            text-decoration: none;
            color: #fff;
            padding: 10px 20px;
        }

        .container {
            margin: 50px auto;
            width: 800px;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        footer {
            background-color: #007bff;
            color: #fff;
            padding: 10px 0;
            position: fixed;
            bottom: 0;
            width: 100%;
        }

        h1 {
            color: #007bff;
        }

        p {
            color: #333;
        }

        a {
            text-decoration: none;
            color: #007bff;
        }
    </style>
</head>
<body>

    <header>
        <h1>PharmaOrder System</h1>
    </header>

    <nav>
        <a href="index.jsp">Home</a> 
        <a href="login.jsp">Login</a>
        <a href="logout">LogOut</a>
        
		<a href="user">UserDetails</a>
          Welcome<b> <%= session.getAttribute("name") %></b>
          
         

        <!-- Add more navigation links as needed -->
    </nav>

    <div class="container">
        <h2>Welcome to PharmaOrder System</h2>
        <p>This system allows you to seamlessly manage medicine and drug orders.</p>
        <section>
            <h3>Features</h3>
            <p>Explore the following features:</p>
            <ul>
                <li><a href="#">Order Medicines</a></li>
                <li><a href="#">Track Orders</a></li>
                <li><a href="#">View Catalog</a></li>
                <!-- Add more features as needed -->
            </ul>
        </section>
    </div>
    
     <div class="gallery">
        <a href="m1.jsp" style="text-decoration:none">
            <img src="homagama/homagama1.jpeg">

            <div class="desc">M1</div>
            <div class="lname">GREEN EMBAZY</div>
            <div class="loc">Watareka, Homagama</div>
            <div class="size">Block size : 10.5 Perches upwords</div>
        </a>

    </div>
    
    <div class="gallery">
        <a href="m1.jsp" style="text-decoration:none">
            <img src="homagama/homagama1.jpeg">

            <div class="desc">M2</div>
            <div class="lname">GREEN EMBAZY</div>
            <div class="loc">Watareka, Homagama</div>
            <div class="size">Block size : 10.5 Perches upwords</div>
        </a>

    </div>
    
    <div class="gallery">
        <a href="Homagama.html" style="text-decoration:none">
            <img src="homagama/homagama1.jpeg">

            <div class="desc">M3</div>
            <div class="lname">GREEN EMBAZY</div>
            <div class="loc">Watareka, Homagama</div>
            <div class="size">Block size : 10.5 Perches upwords</div>
        </a>

    </div>
    
    <div class="gallery">
        <a href="Homagama.html" style="text-decoration:none">
            <img src="">

            <div class="desc">M4</div>
            <div class="lname">GREEN EMBAZY</div>
            <div class="loc">Watareka, Homagama</div>
            <div class="size">Block size : 10.5 Perches upwords</div>
        </a>

    </div> 	
    
    
    
    <footer>
        <p>&copy; 2023 PharmaOrder System. All rights reserved.</p>
    </footer>

</body>
</html>
