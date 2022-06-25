<%-- 
    Document   : reservation
    Created on : Jan 12, 2022, 10:45:02 PM
    Author     : Kavindu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Paypal Payment</title>
    <link rel="stylesheet" href="css/reservation.css">
</head>
<body>
    <main id="cart-main">
        <div class="site-title text-center">
            <h1 class="font-title">MY RESERVATION</h1>
        </div>
        <div class="container">
            <div class="grid">
                <div class="col-1">
                    <div class="flex item justify-content-between">
                        <div class="flex">
                            <div class="img text-center">
                                <img src="./img/room-3.jpg" alt="center">
                            </div>
                            <div class="title">
                                <h3>Super Deluxe</h3>
                                <span>4 Bed    ,   2 Bath   , Wifi</span>
                                <br>
                                <a href="#">Save for later</a> |
                                <a href="#">Cancel My Reservation</a>
                            </div>
                        </div>
                        <div class="price">
                            <h4 class="text-red">$1000</h4>
                        </div>
                    </div>
                </div>
                <div class="col-2">
                    <div class="subtotal text-center">
                        <h3>Price Details</h3>
                        <ul>
                            <li class="flex justify-content-between">
                                <label for="price">Room Price : </label>
                                <span>$1000</span>
                            </li>
                            <li class="flex justify-content-between">
                                <label for="price">Additional Fees : </label>
                                <span>Free</span>
                            </li>
                            <hr>
                            <li class="flex justify-content-between">
                                <label for="price">Amout Payble : </label>
                                <span class="text-red font-title">$1000</span>
                            </li>
                        </ul>
                        <div id="paypal-payment-button">
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </main>
    <script src="https://www.paypal.com/sdk/js?client-id=ASTYV5FmaiMVfHG8GquUPijuDy2mf9C6DQ3g2d7EzdcNrHGB6TK2v84VhshcX-55UH32UyBQxZQNoLBH&disable-funding=credit,card"></script>
    
    <script src="js/reservation.js"></script>
</body>
</html>