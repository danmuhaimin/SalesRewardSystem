<%-- 
    Document   : admindeleteemployee
    Created on : Jul 19, 2022, 12:54:54 AM
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
        <title>Delete Employee</title>
    </head>

    <body>
        <div class="topnav">
            <a  href="admindashboard.jsp">Admin Dashboard</a>
            <a href="AdminViewSalesRankingServlet">View Employee Sales</a>
            <a href="adminupdateemployee.jsp">Update Employee Sales</a>
            <a class = "active" href="admindeleteemployee.jsp">Delete Employee</a>
            <a href="LogoutServlet">Logout: <%=session.getAttribute("username")%></a>
        </div>
        <h1 style="text-align:center;">Delete Employee</h1><br>
        <form action="DeleteEmployeeServlet" method="post">
            <table style="margin-left:auto;margin-right:auto;">
                <tr>
                    <td>Employee's IC: </td>
                    <td><input type="text" id="icNumber" name="icNumber" size="30" required></td>
                </tr>
                
                <tr>
                    <td>Confirm Employee's IC: </td>
                    <td><input type="text" id="confirmIcNumber" name="confirmIcNumber"size="30" required></td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <input type="submit" value="Delete"></a>
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

