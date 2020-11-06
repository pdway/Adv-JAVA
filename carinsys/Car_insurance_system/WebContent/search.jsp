 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="spr" %> 

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Homepage</title>
    <!-- CSS only -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

<title>Insert title here</title>
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
                    
                </div>
                <div class="row img" style="height: 80vh; ">
                    <div class="col-md-1 col-0">
                    </div>
                    <div class="col-md-7 ">
                        <div class="row" style="height: 12%;">

                        </div>
                        <div class="row">

                            <div class="col-md-6">
                                <div class="row " style="background:rgba(13, 13, 14, 0.432) ;">
                                    <div class="col mt-3 mb-3">

                                       <spr:form action="search_car.htm" method ="post" commandName="car">
	<table align="center" >
		<tr>
			<td>
				Car No. Plate:
			</td>
			<td>
				<spr:input path="carNo"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="carpage.jsp" >Back</a>
			</td>
			
		</tr>
	</table>
                                     
                                    
                                       
                                       
                                        
                                             <div class="row mt-2">
                                                    
                                                    <div class="col-5">
                                                        <button type="submit" class="btn btn-dark btn-md" style="margin-top: 12px;">Search Car</button>
                                                    </div>
                                                </div>
                                           </spr:form>
                                               



                                               
                                          
                                    </div>
                                </div>
                                
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
<spr:form action="search_car.htm" method ="post" commandName="car">
	<table align="center" >
		<tr>
			<td>
				Car No. Plate:
			</td>
			<td>
				<spr:input path="carNo"/>
			</td>
		</tr>
		
		<tr>
			<td>
				<a href="carpage.jsp" >Back</a>
			</td>
			<td>
				<input type="submit"  value="Search Car" >
			</td>
		</tr>
	</table>
	</spr:form>
 -->



</html>
