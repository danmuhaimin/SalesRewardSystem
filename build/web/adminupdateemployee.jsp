<%-- 
    Document   : adminupdateemployee
    Created on : Jul 18, 2022, 11:53:33 PM
    Author     : tengk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
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
        <title>Update Employee</title>
    </head>

    <body>
        <div class="topnav">
            <a  href="admindashboard.jsp">Admin Dashboard</a>
            <a href="AdminViewSalesRankingServlet">View Employee Sales</a>
            <a class = "active" href="adminupdateemployee.jsp">Update Employee Sales</a>
            <a href="admindeleteemployee.jsp">Delete Employee</a>
            <a href="LogoutServlet">Logout: <%=session.getAttribute("username")%></a>
        </div>
        <h1 style="text-align:center;">Update Employee Sales</h1><br>
        <form action="UpdateEmployeeSaleServlet" method="post">
            <table style="margin-left:auto;margin-right:auto;">
                <tr>
                    <td>Employee's IC: </td>
                    <td><input type="text" id="icNumber" name="icNumber" size="30" required></td>
                </tr>
                
                <tr>
                    <td>Update Sales Amount (RM): </td>
                    <td><input type="text" id="updateSalesAmount" name="updateSalesAmount"size="30" required></td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <input type="submit" value="Update"></a>
                        <input type="reset" value="Reset"></a>
                    </td>
                </tr>
            </table>
            <table style="margin-left:auto;margin-right:auto;">
                <tr>
                    <td>
                        <p>
                            <span style="color:red"><%=(request.getAttribute("errorMessage") == null) ? ""
                            : request.getAttribute("errorMessage")%>
                            </span>
                        </p>
                    </td>
                </tr>
            </table>
            </table>
        </form>
    </body>
</html>
