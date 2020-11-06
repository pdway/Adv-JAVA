<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

 <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<title>Homepage</title>
</head>

<style>
    .img {
        background: url("img12.jpg");
        background-repeat: no-repeat;
        background-size: cover;
        background-position: center;
    }

    #image {
        height: 57px;
        width: 60px;
        margin-top: 1px;




    }

    td {
        padding-bottom: 15px;





    }
</style>

<body>

<div class="container-fluid">
        <div class="row" style="height: 100vh;">
            <div class="col">
                <div class="row"
                    style="height:10vh;color: white;text-align:center;font-weight:bold;background: rgb(87, 84, 84);">

                    <div class="col-10 d-flex justify-content-center align-items-center"
                        style="color: white;text-align:center;font-weight:bold;font-size:20px">
                        Car Insurance System

                    </div>
                     <div class="col-2 d-flex justify-content-end align-items-center">
                        
                          <a href="logout.htm" >Logout</a>
                        
                    </div>
                    
                </div>
                <div class="row img" style="height: 80vh; ">
                    <div class="col-md-1 col-0">
                    </div>
                    <div class="col-md-10 ">
                        <div class="row" style="height: 12%;">

                        </div>
                        <div class="row">

                           <div class="col-md-2 d-flex justify-content-center align-items-center "
                                style="background:rgb(181, 243, 245) ;font-size:30px;font-weight: bold;">
                                <a style="color: black" href="userpage.jsp">User Details</a>

                            </div>
                            
                            <div class="col-md-2 d-flex justify-content-center align-items-center "
                                style="background:rgb(181, 243, 245) ;font-size:30px;font-weight: bold;">
                                <a style="color: black" href="carpage.jsp" >Car Details</a>

                            </div>
                            
                            <div class="col-md-2 d-flex justify-content-center align-items-center "
                                style="background:rgb(181, 243, 245) ;font-size:30px;font-weight: bold;">
                                <a style="color: black" href="inspage.jsp" >Insurance Details</a>

                            </div>
                            
                            <div class="col-md-2 d-flex justify-content-center align-items-center "
                                style="background:rgb(181, 243, 245) ;font-size:30px;font-weight: bold;">
                                <a style="color: black" href="prep_search_car.htm" >Search Car</a>

                            </div>
                           
                            <div class="col-md-2 d-flex justify-content-center align-items-center "
                                style="background:rgb(181, 243, 245) ;font-size:30px;font-weight: bold;">
                                <a style="color: black" href="prep_search_user.htm" >Search User</a>

                            </div>

                        </div>
                    </div>

                    <div class="col-3">
                       
                    </div>


                </div>
                <footer class="row" style="height:10vh;background-color:rgb(242,242,242)">

                    <div class="col-3"></div>
                    <div class="col-12 col-md-6" style="justify-content: center;display: flex;align-items: center">
                        <h4>car-insurancesystem</h4>&nbsp;
                        <div> Copyright © 2020,car-insurancesystem . All rights reserved.</div>&nbsp;
    
    
                        <a href="https://www.carinsurancesystem.com//">Email:contact@car-insurancesystem.com </a>
    
                    </div>
                    <div class="col-3"></div>
    
                </footer>
                
    
    


            </div>


        </div>

    </div>

</body>

<!--
<table align="center" >
		
		
		<tr>
			<td> <a href="userpage.jsp" >User Details</a> </td>
		</tr>
		<tr>
			<td> <a href="carpage.jsp" >Car Details</a> </td>
		</tr>
		<tr>
			<td> <a href="inspage.jsp" >Insurance Details</a> </td>
		</tr>
		
		<tr>
			<td> <a href="prep_search_car.htm" >search for car</a> </td>
		</tr>
		
		<tr>
			<td> <a href="prep_search_user.htm" >search for user</a> </td>
		</tr>
		
		
		
		
		<tr>
			<td> <a href="logout.htm" >Logout</a> </td>
		</tr>
	</table>
 -->

</html>