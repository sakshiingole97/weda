<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Footer</title>
<!--==Fav-icon===============================-->
<link rel="shortcut icon" href="images/fav-icon.png"/>
<!--==Using-Font-Awesome=====================-->
<link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
<!--==Import-Font-Family======================-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap" rel="stylesheet">

<style type="text/css">
footer{
    background-color: #1b1d1f;
    padding: 50px 20px;
    border-top: 5px solid #4eb060;
}
.footer-container{
    max-width: 1100px;
    margin: auto;
    display: flex;
    justify-content: space-around;
    align-items: flex-start;
}

.footer-logo{
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
}
.footer-logo a{
    color: #ffffff;
    font-size: 2rem;
    font-weight: 600;
    letter-spacing: 1px;
}
.footer-logo a span{
    color: #4eb060;
}
.footer-social{
    display: flex;
    margin-top: 10px;
}
.footer-social a{
    width:40px;
    height: 40px;
    display: flex;
    justify-content: center;
    align-items: center;
    color: #ffffff;
    border: 1px solid #ffffff15;
    font-size: 2rem;
    margin: 0px 5px;
    transition: all ease 0.3s;
}
.footer-social a:hover{
    background-color: #4eb060;
    transition: all ease 0.3s;
}
.footer-links strong{
    color: #ffffff;
    font-size: 1.4rem;
    font-weight: 600;
}
.footer-links ul{
    margin-top: 10px;
}
.footer-links ul li a{
    color: #ffffff;
    opacity: 0.5;
    margin: 4px 0px;
    font-size: 0.9rem;
    letter-spacing: 0.5px;
    transition: all ease 0.3s;
}
.footer-links li a:hover{
    opacity: 1;
    transition: all ease 0.3s;
}
</style>
</head>
<body>
	 <footer>
	 
	 </div>
        <div class="footer-container">
            <!--logo-container------>
            <div class="footer-logo">
                <a href="index.jsp"><i class="fa fa-shopping-basket"></i>Grocery</a>
                <br>
                <!--social----->
                <div class="footer-social">
                    <a href="#"><i class="fab fa-facebook-f"></i></a>
                    <a href="#"><i class="fab fa-twitter"></i></a>
                    <a href="#"><i class="fab fa-instagram"></i></a>
                    <a href="#"><i class="fab fa-youtube"></i></a>
                </div>
            </div>       
        <!--links------------------------->
        <div class="footer-links">
            
            <ul>
            <li><strong>Category</strong></li>
            <br>
                <li><a href="#">Fruits</a></li>
                <li><a href="#">Vegitables</a></li>
                <li><a href="#">Grains</a></li>
                <li><a href="#">Dairy</a></li>
            </ul>
        </div>
        <!--links-------------------------->
        <div class="footer-links">
            <ul>
            <li><strong>Contact</strong></li>
            <br>
                <li><a href="#">Phone : +98644713234</a></li>
                <li><a href="#">Email : GroceryAstore.com</a></li>
            </ul>
        </div>
        </div>
    </footer>
</body>
</html>