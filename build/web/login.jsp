<%-- 
    Document   : login
    Created on : Jul 15, 2022, 9:26:50 PM
    Author     : user
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
        <title>Login</title>
    </head>

    <body>
        <div class="topnav">
            <a href="index.html">Home</a>
            <a href="register.jsp">Register</a>
            <a class="active" href="login.jsp">Login</a>
            <a href="resetpassword.jsp">Reset Password</a>
        </div>
        <h1 style="text-align:center;">LOGIN</h1><br>
        <form action="LoginServlet" method="post">
            <table style="margin-left:auto;margin-right:auto;">
                <tr>
                    <td><label for="username">Username </label></td>
                    <td><input type="text" id="username" name="username" size="30" required></td>
                </tr>
                
                <tr>
                    <td><label for="password">Password </label></td>
                    <td><input type="password" id="password" name="password"size="30" required></td>
                </tr>
                <tr>
                    <td>

                    </td>
                    <td>
                        <input type="submit" value="Login"></a>
                        <input type="reset" value="Reset"></a>
                    </td>
                </tr>
                <tr>
                    <td>
                        
                    </td>
                    <td>
                        <h8 style="position:right; right:30%;"><a href="resetpassword.jsp">Forgot password?</a></h8>
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
