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
                      
        <strong> MEGA</strong><br>
        <small> @jorge_lmc</small>
                     

        <h2>Contact Information</h2>
        <table>
            <tr>
                <th>Last Name</th>
                <th>First Name</th>
                <th>Telephone</th>
                <th>Email</th>
            </tr>
            <c:forEach var="contact" items="${model}">
                <tr>
                    <td><c:out value='${contact.getConlast()}' /></td>
                    <td><c:out value='${contact.getConname()}' /></td>
                    <td><c:out value='${contact.getConphone()}' /></td>
                    <td><c:out value='${contact.getConemail()}' /></td>
               </tr>
            </c:forEach>
        </table>
        <br>
        <br>
        <a  href="index.jsp" > Go to main page </a>
    </body>
</html>