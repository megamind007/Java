<%@page import="java.io.PrintWriter"%>
<%@page import="com.mysql.jdbc.Connection"%>

<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
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
        <a class="navbar-brand js-scroll-trigger" href="index.jsp">Top Up IT</a>
        <button class="navbar-toggler navbar-toggler-right" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
          Menu
          <i class="fa fa-bars"></i>
        </button>
        
      </div>
    </nav>

<header class="masthead">
      <div class="container h-100">
        <div class="row " style=" padding-top: 100px">
          <div class="col-lg-7 my-auto">
            <div class="header-content mx-auto">
              
              <h3>Details</h3>
              
              <%
	String rowid=request.getParameter("det");
              String name=request.getParameter("name");
	PrintWriter pw=response.getWriter();
	//pw.print(rowid);
	try{
	String connectionURL = "jdbc:mysql://localhost:3306/topupit";
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            Connection con = null; 
             
            con = (Connection) DriverManager.getConnection(connectionURL, "root", "aztuzmk4");
            if(!con.isClosed()) {
                // pw.println("Successfully connected to " + "MySQL server using TCP/IP...");
            }
            Statement stmt=(Statement) con.createStatement();  
            ResultSet rs=stmt.executeQuery("SELECT c.cat_name , u.uni_name, u.ssc_gpa,u.hsc_gpa, d.cost,d.hostel,d.uni_link FROM category AS c INNER JOIN uni_admission AS u ON c.idcategory=u.category_idcategory INNER JOIN uni_det as d on d.uni_det_id=u.uni_det_uni_det_id WHERE u.uni_id="+rowid);
            //String id="";
            //pw.print("hi");
            while(rs.next()){
            	//pw.print("<h3>Name : </h3>"+rs.getString(3));
            	request.setAttribute("cat", rs.getString(1));
            	request.setAttribute("name",  rs.getString(2));
            	request.setAttribute("ssc_gpa",  rs.getFloat(3));
            	request.setAttribute("hsc_gpa",  rs.getFloat(4));
            	if(rs.getInt(5)==0){
            		request.setAttribute("cost",  "NA");
            	}else{
            	request.setAttribute("cost",  rs.getInt(5));
            	}
            	if(rs.getString(6).equalsIgnoreCase("yes")){
            		request.setAttribute("hostel",  "Both Male and Female");
            	}else{
            	request.setAttribute("hostel",  rs.getString(6));
            	}
            	request.setAttribute("uniLink",  rs.getString(7));
            	//pw.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+rs.getString(4)+" "+rs.getString(5));
            	
            }
	}catch(Exception e){
		
	}
	%>	
	
			<div style="padding-top: 20px;padding-left: 20px">
			              <h5>Category: <%= request.getAttribute("cat") %></h5>
			              <h5>Name: <%= request.getAttribute("name") %></h5>
			              <h3 style=" margin-top:30px;">Required CGPA for ADMISSION!</h3>
			              <h5>SSC : <%= request.getAttribute("ssc_gpa") %></h5>
			              <h5>Name: <%= request.getAttribute("hsc_gpa") %></h5>
			              <h3 style=" margin-top:30px;">Others  </h3>
			              <h5>Cost : <%= request.getAttribute("cost") %></h5>
			              <h5>Hostel: <%= request.getAttribute("hostel") %></h5>
			              <h5>Website: <%= request.getAttribute("uniLink") %></h5>
			              
			</div>
            </div>
          </div>
          
        </div>
      </div>
    </header>

	
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
    <script type="text/javascript" src="js/slider.js"></script>

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/new-age.min.js"></script>

  </body>

</html>
