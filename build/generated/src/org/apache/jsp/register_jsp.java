package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <style>\n");
      out.write("            body {\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav {\n");
      out.write("                overflow: hidden;\n");
      out.write("                background-color: #74879C\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a {\n");
      out.write("                float: left;\n");
      out.write("                color: #f2f2f2;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 14px 16px;\n");
      out.write("                text-decoration: none;\n");
      out.write("                font-size: 17px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a:hover {\n");
      out.write("                background-color: #DCD7D1;\n");
      out.write("                color: black;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .topnav a.active {\n");
      out.write("                background-color: #30414C;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <title>User Registration</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <a href=\"index.html\">Home</a>\n");
      out.write("            <a class = \"active\" href=\"register.jsp\">Register</a>\n");
      out.write("            <a href=\"login.jsp\">Login</a>\n");
      out.write("            <a href=\"resetpassword.jsp\">Reset Password</a>\n");
      out.write("        </div>\n");
      out.write("        <h1 style=\"text-align:center;\">REGISTER</h1><br>\n");
      out.write("        <form action=\"RegisterServlet\" method=\"post\">\n");
      out.write("            <table style=\"margin-left:auto;margin-right:auto;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>Name: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"name\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Username: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"username\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>IC Number: </td>\n");
      out.write("                    <td><input type=\"text\" name=\"icNumber\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Password: </td>\n");
      out.write("                    <td><input type=\"password\" name=\"password\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                \n");
      out.write("                <tr>\n");
      out.write("                    <td>Confirm Password: </td>\n");
      out.write("                    <td><input type=\"password\"name=\"confirmPassword\" required></td>\n");
      out.write("                </tr>\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        \n");
      out.write("                    </td>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" value=\"Register\"></a>\n");
      out.write("                        <input type=\"reset\" value=\"Reset\"></a>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("            <table style=\"margin-left:auto;margin-right:auto;\">\n");
      out.write("                <tr>\n");
      out.write("                    <td>\n");
      out.write("                        <p>\n");
      out.write("                            <span style=\"color:red\">");
      out.print((request.getAttribute("errorMessage") == null) ? ""
                            : request.getAttribute("errorMessage"));
      out.write("\n");
      out.write("                            </span>\n");
      out.write("                        </p>\n");
      out.write("                    </td>\n");
      out.write("                </tr>\n");
      out.write("            </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
