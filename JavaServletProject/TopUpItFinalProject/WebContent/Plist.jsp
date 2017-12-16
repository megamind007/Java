<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.io.PrintWriter"%>
<%@page import="com.mysql.jdbc.Connection"%>

<%@page import="com.mysql.jdbc.Statement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
 
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
        <div class="row " style="padding-top: 100px">
          <div class="col-lg-7 my-auto">
            <div class="header-content mx-auto">
              
              <table class="table table-hover">
    			<thead>
      				<tr>
        				<th>###</th>
        				<th>NAME</th>
        				<th>DETAILS</th>
      				</tr>
    			</thead>
    			<tbody>
      				
      				<%
	String range=request.getParameter("rangeVal");
              //String hsc=request.getParameter("hscGpa");
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
            ResultSet rs=stmt.executeQuery("SELECT `uni_id`,`uni_name` FROM `uni_admission` INNER JOIN uni_det ON uni_det_uni_det_id=uni_det_id WHERE `category_idcategory`=2 and uni_det.cost<="+range);
            //String id="";
            //pw.print("hi");
            while(rs.next()){
            	%>
            	<tr>
            		<form method="get" action="det.jsp">
        				<td>#</td>
        				<td><%out.println(rs.getString(2)); %></td>
        				<td><button type="submit" style="background-color: #27ae60;"  
        				class="btn btn-outline btn-xl js-scroll-trigger">Details</button></td>
        				<input type="hidden" name="det" value="<%out.println(rs.getString(1)); %>"/>
        				<input type="hidden" name="name" value="<%out.println(rs.getString(2)); %>"/>
        			</form>
      			</tr>
            	
          <%
          }
	}catch(Exception e){
		
	}
	%>	
      				
    			</tbody>
  			</table>
              
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

    <!-- Plugin JavaScript -->
    <script src="vendor/jquery-easing/jquery.easing.min.js"></script>

    <!-- Custom scripts for this template -->
    <script src="js/new-age.min.js"></script>

  </body>

</html>
