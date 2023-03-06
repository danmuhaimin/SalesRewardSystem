<%-- 
    Document   : resetpassword.jsp
    Created on : Jul 16, 2022, 2:27:43 AM
    Author     : tengk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
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
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Password Reset</title>
    </head>

    <body>
        <div class="topnav">
            <a href="index.html">Home</a>
            <a href="register.jsp">Register</a>
            <a href="login.jsp">Login</a>
            <a class = "active" href="resetpassword.jsp">Reset Password</a>
        </div>
        <h1 style="text-align:center;">RESET PASSWORD</h1><br>
        <form action="ResetPasswordServlet" method="post">
            <table style="margin-left:auto;margin-right:auto;">      
                <tr>
                    <td>Username: </td>
                    <td><input type="text" name="username" required></td>
                </tr>
                
                <tr>
                    <td>IC Number: </td>
                    <td><input type="text" name="icNumber" required></td>
                </tr>
                
                <tr>
                    <td>New Password: </td>
                    <td><input type="password" name="newPassword" required></td>
                </tr>
                
                <tr>
                    <td>Confirm New Password: </td>
                    <td><input type="password"name="confirmNewPassword" required></td>
                </tr>
                <tr>
                    <td>
                        
                    </td>
                    <td>
                        <input type="submit" value="Reset Password"></a>
                        <input type="reset" value="Clear"></a>
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
        </form>
    </body>
</html>