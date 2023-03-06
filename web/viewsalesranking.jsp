<%-- 
    Document   : viewsalesranking
    Created on : Jul 18, 2022, 6:07:30 PM
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
        <title>View Ranking</title>
    </head>
    <body>
        <div class="topnav">
            <a class = "active" href="dashboard.jsp">Dashboard</a>
            <a class ="active" href="ViewSalesRankingServlet">View Sales Ranking</a>
            <a href="currentreward.jsp">Current Reward</a>
            <a href="LogoutServlet">Logout: <%=session.getAttribute("username")%></a>
        </div>
        <h1 style="text-align:center;">Sales Ranking</h1><br><br>
        <table border="1" style="margin-left:auto;margin-right:auto;; text-align:center; border-collapse: collapse">
            <tr>
                <strong>
                    <th>No.</th>
                    <th>Name</th>
                    <th>IC Number</th>
                    <th>Sales(RM)</th>
                </strong>
            </tr>
        </table>

    </body>
</html>
