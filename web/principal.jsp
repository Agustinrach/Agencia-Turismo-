<%-- 
    Document   : principal
    Created on : 15 dic. 2021, 17:33:07
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>



<html lang="en-gb" class="no-js">
    <head>
        <meta charset="utf-8">
        <title>Agencia de Turismo</title>
        <meta name="author" content="">
        <meta name="keywords" content="">
        <meta name="description" content="">		

        <!-- Mobile Specific Metas -->
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">


        <!--styles -->
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <link href="css/font-awesome.css" rel="stylesheet">
        <link href="js/owl-carousel/owl.carousel.css" rel="stylesheet">
        <link href="js/owl-carousel/owl.theme.css" rel="stylesheet">
        <link href="js/owl-carousel/owl.transitions.css" rel="stylesheet">
        <link href="css/magnific-popup.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/animate.css" />
        <link rel="stylesheet" href="css/etlinefont.css">
        <link href="css/style.css" type="text/css"  rel="stylesheet"/>



    <body  data-spy="scroll" data-target="#main-menu">
        
<%
            HttpSession miSession = request.getSession();
            String usu = (String) miSession.getAttribute("usuario");

            if (usu == null) {
                response.sendRedirect("index.jsp");

            } else {

            
        %>

        <!--Start Page loader -->
        <div id="pageloader">   
            <div class="loader">

            </div>
        </div>
        <!--End Page loader -->


        <!--Start Navigation-->
        <header id="header">
            <div class="container">
                <div class="row">
                    <div class="col-sm-12">
                        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#main-menu">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="fa fa-bars"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <!--Start Logo -->
                        <div class="logo-nav">
                            <a href="index.html">

                            </a>
                        </div>
                        <!--End Logo -->
                        <div class="clear-toggle"></div>
                        <div id="main-menu" class="collapse scroll navbar-right">
                            <ul class="nav">

                                

                                <li> <a href="empleados.jsp">EMPLEADOS</a> </li>
                                
                                <li> <a href="clientes.jsp">CLIENTES</a> </li>
                                
                                <li> <a href="servicios.jsp">SERVICIOS</a> </li>
                                
                                <li> <a href="paquetes.jsp">PAQUETES</a> </li>
                                
                                <li> <a href="ventas.jsp">VENDER</a> </li>
                                

                                



                            </ul>
                        </div><!-- end main-menu -->
                    </div>
                </div>
            </div>
        </header>
        <!--End Navigation-->


        <!-- Start Slider  -->
        <section id="home" class="home">
            <div class="slider-overlay"></div>
            <div class="flexslider">
                <ul class="slides scroll">
                    <li class="first">
                        <div class="slider-text-wrapper">  
                            <div class="container">
                                <div class="big">Agencia de Turismo </div>          
                                
                                
                            </div>       
                        </div>
                        <img src="images/slider/1.jpg" alt="">
                    </li>


                </ul>
            </div>
        </section>
        <!-- End Slider  -->





        <a href="#" class="scrollup"> <i class="fa fa-chevron-up"> </i> </a>

        <!--Plugins-->
        <script type="text/javascript" src="js/jquery-1.11.1.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script> 
        <script type="text/javascript" src="js/owl-carousel/owl.carousel.js"></script>
        <script type="text/javascript" src="js/jquery.flexslider-min.js"></script>
        <script type="text/javascript" src="js/jquery.magnific-popup.min.js"></script>
        <script type="text/javascript" src="js/easing.js"></script>
        <script type="text/javascript" src="js/jquery.easypiechart.js"></script>
        <script type="text/javascript" src="js/jquery.appear.js"></script>
        <script type="text/javascript" src="js/jquery.parallax-1.1.3.js"></script>
        <script type="text/javascript" src="js/jquery.mixitup.min.js"></script>
        <script type="text/javascript" src="js/custom.js"></script>
        
        <%}
            %>
    </body>
</html>



