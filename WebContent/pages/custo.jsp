<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
	<title>Customers Management</title>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
    <link rel="stylesheet" href="css/style.css">
    <!-- jQuery CDN - Slim version (=without AJAX) -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <!-- Popper.JS -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
    <!-- Bootstrap JS -->
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>
    <!-- jQuery Custom Scroller CDN -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/malihu-custom-scrollbar-plugin/3.1.5/jquery.mCustomScrollbar.concat.min.js"></script>
    
	
</head>
<body>

	<div>
		<h2>Customers Management</h2>
		<div class="row">
			<div class="col-sm-4">
				<form action="${pageContext.request.contextPath}/custo/insert" method="post" role="form">
					<div class="form-group">
						<label>Customer Id</label>
						<input type="number" class="form-control" name="idcustomer">
					</div>
		
					<div class="form-group">
						<label>Customer Name</label>
						<input type="text" class="form-control" name="nacustomer">
					</div>	
					<button class="btn btn-info btn-block" type="submit"> Add Record</button>
			
				</form>
			</div>
			<div class="col-sm-8">
				<table class="table">
					<thead>
						<tr>
						<th>Customer ID</th>
						<th>Customer Name</th>
						<!-- 
						<th>CRUD Actions</th>
						 -->
						</tr>
			
					</thead>
					<tbody>
					<c:forEach var="customer" items="${model}">
		                <tr>
		                    <td><c:out value='${customer.getCus_no()}' /></td>
		                    <td><c:out value='${customer.getName()}' /></td>
		                    <!--  
		                    <td>
								<a href="#" class="btn btn-success" role="button">Update</a>
								<a href="#" class="btn btn-danger" role="button">Delete</a>
							</td>
							-->
		                </tr>
		            </c:forEach>
					</tbody>
			
				</table>
			</div>
		</div>
	</div>
</body>
</html>