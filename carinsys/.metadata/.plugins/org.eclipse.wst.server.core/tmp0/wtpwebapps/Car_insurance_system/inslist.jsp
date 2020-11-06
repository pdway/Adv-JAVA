<%@page import="com.cdac.dto.Ins"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
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

                    <div class="col-11 d-flex justify-content-center align-items-center"
                        style="color: white;text-align:center;font-weight:bold;font-size:20px">
                        Car Insurance System 

                    </div>
                  
                </div>
                
               
            <div class="row img" style="height:80vh" >     
               
                
             <table align="center" style="background-color: rgba(116, 222, 236, 0.993);margin-top: 30px;padding:10px " >
<thead  style="font-weight: bold;  ">
<tr>
	<td>
		Insurance No.
	</td>
	<td>
	License No.
	</td>
	<td>
      Provider
	</td>
	<td>
         valid date
	</td>
	<td>
	    Ins. Holder
	</td>
</tr>
</thead>
<% 
		List<Ins> elist = (List<Ins>)request.getAttribute("insList");
		for(Ins exp : elist){
		%>
		<tr>
			<td>
			<%=exp.getInsNo()%>
			 </td>
			 
			 <td>
			<%=exp.getLicNo()%>
			 </td>
			 
			  <td>
			<%=exp.getProvider()%>
			 </td>
			 
			  <td>
			<%=exp.getInsValidDate()%>
			 </td>
			 
			  <td>
			<%=exp.getInsHolder()%>
			 </td>
			
			
			
			<td>
				<a class="btn btn-primary" role="button" aria-pressed="true" href="ins_delete.htm?insNo=<%=exp.getInsNo()%>"  >Delete</a><br>
				</td>
		   
			<td>
				<a class="btn btn-primary" role="button" aria-pressed="true" href="ins_update_form.htm?insNo=<%=exp.getInsNo()%>" >Update</a><br>
				</td>
			
			
			
		</tr>
		<% } %>
		<tr>
		<a style="color: black" href="inspage.jsp">Back to Insurance Page</a>
	</table>
 </div>       
      <footer class="row" style="height:10vh;background-color:rgb(242,242,242)">

                    <div class="col-3"></div>
                    <div class="col-12 col-md-6" style="justify-content: center;display: flex;align-items: center">
                        <h4>car-insurancesystem </h4>&nbsp;
                        <div> Copyright © 2020, car-insurancesystem . All rights reserved.</div>&nbsp;


                        <a href="https://www.car-insurancesystem .com//">Email:contact@car-insurancesystem .com </a>

                    </div>
                    <div class="col-3"></div>

                </footer>

            </div>


        </div>

    </div>


</body>
</html>