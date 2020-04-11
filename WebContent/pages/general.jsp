<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            table {
            border-collapse: collapse;
            border-spacing: 0;
            width: 100%;
            border: 1px solid #ddd;
            }

            th, td {
            text-align: left;
            padding: 16px;
            }

            tr:nth-child(even) {
            background-color: #f2f2f2;
            }
        </style>
    </head>
    <body>
        <h2>Quote Management</h2>
        <h3>Awaiting Customer Response</h3>
        <table>
            <tr>
                <th>Quote Number</th>
                <th>Quote Date</th>
                <th>Quote State</th>
                <th>Customer Id</th>
                <th>Customer Name</th>
            </tr>
            <c:forEach var="quotes" items="${model}">
                <tr>
                    <td><c:out value='${quotes.getNum_Quo()}' /></td>
                    <td><c:out value='${quotes.getDat_Quo()}' /></td>
                    <td><c:out value='${quotes.getSta_Quo()}' /></td>
                    <td><c:out value='${quotes.getIde_Cus()}' /></td>
                    <td><c:out value='${quotes.getNom_cus()}' /></td>                    
                </tr>
            </c:forEach>
		</table>
        <br>
        <br>
        <a  href="index.jsp" > Go to main page </a>
    </body>
</html>