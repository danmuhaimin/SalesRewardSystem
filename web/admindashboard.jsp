<%-- 
    Document   : admindashboard
    Created on : Jul 17, 2022, 1:03:06 PM
    Author     : tengk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
                <style>
            body {
                margin: 0;
            }

            .topnav {
                overflow: hidden;
                background-color: #74879C
            }

            .topnav a {
                float: left;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-size: 17px;
            }

            .topnav a:hover {
                background-color: #DCD7D1;
                color: black;
            }

            .topnav a.active {
                background-color: #30414C;
                color: white;
            }
        </style>
        <title>Admin Dashboard</title>
    </head>
    <body>
        <div class="topnav">
            <a class = "active" href="admindashboard.jsp">Admin Dashboard</a>
            <a href="AdminViewSalesRankingServlet">View Employee Sales</a>
            <a href="adminupdateemployee.jsp">Update Employee Sales</a>
            <a href="admindeleteemployee.jsp">Delete Employee</a>
            <a href="LogoutServlet">Logout: <%=session.getAttribute("username")%></a>
        </div>
        <h1 style="text-align:center;">Admin Dashboard</h1><br><br>
        <h3 style="text-align:center;">Current User: </h2><br>
        <table style="margin-left:auto;margin-right:auto;">
            <tr>
                <td>Your name: </td>
                <td> <%=session.getAttribute("name")%> </td>
            </tr>
            <tr>
                <td>Your username: </td>
                <td> <%=session.getAttribute("username")%> </td>
            </tr>
            <tr>
                <td>Your IC Number: </td>
                <td> <%=session.getAttribute("icNumber")%> </td>
            </tr>
        </table>

    </body>
</html>

