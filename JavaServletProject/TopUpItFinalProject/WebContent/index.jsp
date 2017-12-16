<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>A TopUpIT </title>

    <!-- Bootstrap core CSS -->
    <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom fonts for this template -->
    <link rel="stylesheet" href="css/rslider.css">
    <link rel="stylesheet" href="vendor/font-awesome/css/font-awesome.min.css">
    <link rel="stylesheet" href="vendor/simple-line-icons/css/simple-line-icons.css">
    <link href="https://fonts.googleapis.com/css?family=Lato" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Catamaran:100,200,300,400,500,600,700,800,900" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Muli" rel="stylesheet">

    <!-- Plugin CSS -->
    <link rel="stylesheet" href="device-mockups/device-mockups.min.css">

    <!-- Custom styles for this template -->
    <link href="css/new-age.min.css" rel="stylesheet">

  </head>

  <body id="page-top">
		
		
    <!-- Navigation -->
    <nav class="navbar navbar-expand-lg navbar-light fixed-top" id="mainNav">
      <div class="container">
        <a class="navbar-brand js-scroll-trigger" href="#page-top">Top Up IT</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        <div class="collapse navbar-collapse" id="navbarResponsive">
          <ul class="navbar-nav ml-auto">
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#download">University</a>
            </li>
            
            <li class="nav-item">
              <a class="nav-link js-scroll-trigger" href="#contact">Contact</a>
            </li>
          </ul>
        </div>
      </div>
    </nav>

    <header class="masthead">
      <div class="container h-100">
        <div class="row h-100">
          <div class="col-lg-7 my-auto">
            <div class="header-content mx-auto">
              <h1 class="mb-5">Under Graduate admission!</h1>
              <form action="CheckEligibility" method="post">
  				<div class="form-group">
    				<label for="exampleInputEmail1">SSC GPA</label>
    				<input type="text" class="form-control" name="sscGpa" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter SSC GPA">
    				
  				</div>
  				<div class="form-group">
   					<label for="exampleInputPassword1">HSC GPA</label>
    				<input type="text" class="form-control" name="hscGpa" id="exampleInputPassword1" placeholder="Enter HSC GPA">
  				</div>
  				<button type="submit" style="background-color: #27ae60;"  class="btn btn-outline btn-xl js-scroll-trigger">CHECK ELIGIBILITY</button>
  				<a  style="background-color: #3498db;" href="#download" class="btn btn-outline btn-xl js-scroll-trigger">BROWSE UNIVERSITY</a>
  				
			</form>
              
            </div>
          </div>
          <div class="col-lg-5 my-auto">
            <div class="device-container">
              <div class="device-mockup iphone6_plus portrait white">
                <div class="device">
                  <div class="screen">
                    <!-- Demo image for screen mockup, you can put an image here, some HTML, an animation, video, or anything else! -->
                    <img src="img/books.png" class="img-fluid" alt="">
                  </div>
                  <div class="button">
                    <!-- You can hook the "home button" to some JavaScript events or just remove it -->
                  </div>
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
    </header>

    <section class="download bg-primary text-center" id="download">
      <div class="container">
        <div class="row">
          <div class="col-md-8 mx-auto">
            <h2 class="section-heading">Browse through the University list!</h2>
            <p>Select university category to get started!</p>
            <form action="publicUni.jsp">
              <button   style="background-color: #e74c3c;" class="btn btn-outline btn-xl js-scroll-trigger">PUBLIC</button>
              </form>
              <form action="PrivateUni" method="post">
              <button   style="background-color: #c0392b;" class="btn btn-outline btn-xl js-scroll-trigger">PRIVATE</button>
            
            <h4 style="margin-top: 15px">Select cost range Only for private university</h4>
            <div class="row">
            <div class="col-md-10" style="margin-top: 15px">
  							<input  id="range" class="form-control" type="range" value="1500000" min="300000" max="1500000"/>
  							
			 </div>
			 <div class="col-md-2">
			 <input name="rangeVal" type="text" id="value" class="form-control"/>
			 </div>
			 </div>
			 </form>
          </div>
        </div>
      </div>
    </section>

   

    <section class="contact bg-primary" id="contact">
      <div class="container">
        <h2>We
          <i class="fa fa-heart"></i>
          new friends!</h2>
        <ul class="list-inline list-social">
          <li class="list-inline-item social-twitter">
            <a href="#">
              <i class="fa fa-twitter"></i>
            </a>
          </li>
          <li class="list-inline-item social-facebook">
            <a href="#">
              <i class="fa fa-facebook"></i>
            </a>
          </li>
          <li class="list-inline-item social-google-plus">
            <a href="#">
              <i class="fa fa-google-plus"></i>
            </a>
          </li>
        </ul>
      </div>
    </section>

    <footer>
      <div class="container">
        <p>&copy; 2017 Top up it. All Rights Reserved.</p>
        <ul class="list-inline">
          <li class="list-inline-item">
            <a href="#">Privacy</a>
          </li>
          <li class="list-inline-item">
            <a href="#">Terms</a>
          </li>
          <li class="list-inline-item">
            <a href="#">FAQ</a>
          </li>
        </ul>
      </div>
    </footer>

    <!-- Bootstrap core JavaScript -->
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/popper/popper.min.js"></script>
    <script src="vendor/bootstrap/js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script type="text/javascript" src="js/jquery-3.2.1.min.js"></script>
    <script src="js/new-age.min.js"></script>
    <script type="text/javascript" src="js/slider.js"></script>

  </body>

</html>
