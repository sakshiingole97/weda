<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Grocery</title>
<!--==Stylesheet=============================-->
<link rel="stylesheet" type="text/css" href="css/Nav.css">
<link rel="stylesheet" type="text/css" href="css/Search.css" />
<link rel="stylesheet" type="text/css" href="css/Cat.css" />
<link rel="stylesheet" type="text/css" href="css/Product.css" />
<link rel="stylesheet" type="text/css" href="css/Login.css" />
<link rel="stylesheet" type="text/css" href="css/register.css" />
<link rel="stylesheet" type="text/css" href="css/Cart.css" />
<link rel="stylesheet" type="text/css" href="css/Client.css">

<!--==Fav-icon===============================-->
<link rel="shortcut icon" href="images/fav-icon.png" />
<!--==Using-Font-Awesome=====================-->
<link rel="stylesheet"
	href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css"
	integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p"
	crossorigin="anonymous" />
<!--==Import-Font-Family======================-->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,100;0,200;0,300;0,400;0,500;0,600;0,700;0,800;0,900;1,100;1,200;1,300;1,400;1,500;1,600;1,700;1,800;1,900&display=swap"
	rel="stylesheet">
	
</head>
<body>
<jsp:include page="Header.jsp"></jsp:include>
  <section id="search-banner">
		<!--bg---------->
		<figure>
		<img src="img/bg-1.png" class="bg-1" alt="bg"> 
		<img src="img/bg-2.png" class="bg-2" alt="bg-2">
		<img src="img/wepik.png" class="bg-3" alt="bg-2">
		</figure>
		<!--text------->
		<div class="search-banner-text">
			<h1>Order Your daily Groceries</h1>
			<strong>#Free Delivery</strong>
			<!--search-box------>
			<form action="Pp" class="search-box">
				<!--icon------>
				<i class="fas fa-search"></i>
				<!--input----->
				<input type="text" class="search-input"
					placeholder="Search your daily groceries" name="pname"  required>
				<!--btn------->
				<input type="submit" class="search-btn" name="action" value="Search">
			</form>
		</div>
	</section>
	<section id="category">
       <div class="category-heading">
            <h2>Category</h2>
            <span>All</span>
        </div>
        <!--box-container---------->
        <div class="category-container">
            <!--box---------------->
            <a href="Pp?action=cat&cat1=grain" class="category-box" >
                <img src="img/wheat-sack.png" alt="wheat" name="Grain">
                <span name="action">Grains</span>
            
            <!--box---------------->
            <a href="Pp?action=cat&cat1=Fruit" class="category-box">
            <img src="img/Vegetables.png" alt="Vegetables" name="Fruit">
            <span name="action">Fruit</span>
            </a>
            <!--box---------------->
            <a href="Pp?action=cat&cat1=Vegetables" class="category-box">
                <img src="img/food.png" alt="Fish" name="Vegetables">
                <span name="action">Vegatbles</span>
            </a>
            <!--box---------------->
            <a href="Pp?action=cat&cat1=dairy" class="category-box">
                <img src="img/milk.png" alt="Milk" name="dairy">
                <span name="action">Dairy</span>
            </a>
            <!--box---------------->
            <a href="Pp?action=cat&cat1=Soap" class="category-box">
                <img src="img/soap.png" alt="Soap" name="Soap">
                <span name="action">Personal Care</span>
            </a>
            <!--box---------------->            
            <a href="Pp?action=cat&cat1=Nonveg" class="category-box">
                <img src="img/fish.png" alt="Fish" name="Nonveg">
                <span name="action">Fish & Meat</span>
            </a>
  
        </div>
    </section>
    
     <section id="popular-bundle-pack">
        <!--heading-------------->
        <div class="product-heading">
            <h3>Popular Bundle Pack</h3>
        </div>
        <!--box-container------>
        <div class="product-container">
            <!--box---------->
            <div class="product-box">
                <img src="img/pack1.png" alt="pack">
                <strong>Big Pack</strong>
                <span class="quantity">Lemone, Tamato, Patato,+4</span>
                
            </div>
            <!--box---------->
            <div class="product-box">
                <img src="img/pack2.jpg" alt="apple">
                <strong>Large Pack</strong>
                <span class="quantity">Lemone, Tamato, Patato,+2</span>
               
            </div>
            <!--box---------->
            <div class="product-box">
                <img src="img/pack3.png" alt="apple">
                <strong>Small Pack</strong>
                <span class="quantity">Lemone, Tamato, Patato</span>
                
            </div>
            <!--box---------->
            <div class="product-box">
                <img src="img/pack1.png" alt="pack">
                <strong>Big Pack</strong>
                <span class="quantity">Lemone, Tamato, Patato,+4</span>
                
            </div>
            <!--box---------->
            <div class="product-box">
                <img src="img/pack2.jpg" alt="apple">
                <strong>Large Pack</strong>
                <span class="quantity">Lemone, Tamato, Patato,+2</span>
               
            </div>
            <!--box---------->
            <div class="product-box">
                <img src="img/pack3.png" alt="apple">
                <strong>Small Pack</strong>
                <span class="quantity">Lemone, Tamato, Patato</span>
                
            </div>
        </div>
    </section>
   <!--==Clients===============================================-->
    <section id="clients">
        <!--heading---------------->
        <div class="client-heading">
            <h3>What Our Client's Say</h3>
        </div>
        <!--box-container---------->
        <div class="client-box-container">
            <!--box------------->
            <div class="client-box">
                <!--==profile===-->
                <div class="client-profile">
                    <!--img--->
                    <img src="img/client-1.jpg" alt="client">
                    <!--text-->
                    <div class="profile-text">
                        <strong>James Mcavoy</strong>
                        <span>CEO</span>
                    </div>
                </div>
                <!--==Rating======-->
                <div class="rating">
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                </div>
                <!--==comments===-->
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Fugiat ea id, itaque architecto atque mollitia aperiam voluptatem consequatur incidunt sed placeat, harum recusandae quaerat at hic labore eius laborum quas!</p>
            </div>
            <!--box------------->
            <div class="client-box">
                <!--==profile===-->
                <div class="client-profile">
                    <!--img--->
                    <img src="img/client-2.jpg" alt="client">
                    <!--text-->
                    <div class="profile-text">
                        <strong>Adward Mcavoy</strong>
                        <span>Software Developer</span>
                    </div>
                </div>
                <!--==Rating======-->
                <div class="rating">
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                </div>
                <!--==comments===-->
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Fugiat ea id, itaque architecto atque mollitia aperiam voluptatem consequatur incidunt sed placeat, harum recusandae quaerat at hic labore eius laborum quas!</p>
            </div>
            <!--box------------->
            <div class="client-box">
                <!--==profile===-->
                <div class="client-profile">
                    <!--img--->
                    <img src="img/client-3.jpg" alt="client">
                    <!--text-->
                    <div class="profile-text">
                        <strong>Ava Alex</strong>
                        <span>Marketer</span>
                    </div>
                </div>
                <!--==Rating======-->
                <div class="rating">
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                    <i class="fas fa-star"></i>
                </div>
                <!--==comments===-->
                <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Fugiat ea id, itaque architecto atque mollitia aperiam voluptatem consequatur incidunt sed placeat, harum recusandae quaerat at hic labore eius laborum quas!</p>
            </div>
        </div>
    </section>
       
<jsp:include page="Footer.jsp"></jsp:include>		
</body>
