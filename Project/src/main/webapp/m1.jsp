<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Product Detail</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
        }
        header {
            background-color: #0073e6;
            color: white;
            padding: 10px;
            text-align: center;
        }
        .product {
            display: flex;
            justify-content: space-around;
            padding: 20px;
        }
        .product img {
            max-width: 300px;
            height: auto;
        }
        .product-details {
            max-width: 400px;
        }
        .product-title {
            font-size: 24px;
            margin-bottom: 10px;
        }
        .product-description {
            font-size: 16px;
            margin-bottom: 20px;
        }
        .product-price {
            font-size: 18px;
            font-weight: bold;
        }
    </style>
</head>
<body>
    <header>
        <h1>21st Century Arthri-Flex Tab 60s</h1>
    </header>
    <div class="product">
        <img src="product-image.jpg" alt="Product Image">
        <div class="product-details">
            <h2 class="product-title">21st Century Arthri-Flex Tab 60s</h2>
            <p class="product-description">Arthri-Flex Tablets are an excellent source of Vitamin C, which provides your body with the necessary nutrients to help repair and regenerate damaged tissues and to stimulate collagen production.</p>
            <p class="product-price">$19.99</p>
            <button>Add to Cart</button>
        </div>
    </div>
</body>
</html>