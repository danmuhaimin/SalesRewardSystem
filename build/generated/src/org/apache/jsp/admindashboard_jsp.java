package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admindashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("                <style>\n");
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
      out.write("        <title>Admin Dashboard</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"topnav\">\n");
      out.write("            <a class = \"active\" href=\"admindashboard.jsp\">Admin Dashboard</a>\n");
      out.write("            <a href=\"ViewSalesRankingServlet\">View Employee Sales</a>\n");
      out.write("            <a href=\"currentreward.jsp\">Update Employee Sales</a>\n");
      out.write("            <a href=\"deleteemployee.jsp\">Delete Employee</a>\n");
      out.write("            <a href=\"LogoutServlet\">Logout: ");
      out.print(session.getAttribute("username"));
      out.write("</a>\n");
      out.write("        </div>\n");
      out.write("        <h1 style=\"text-align:center;\">Admin Dashboard</h1><br><br>\n");
      out.write("        <h3 style=\"text-align:center;\">Current User: </h2><br>\n");
      out.write("        <table style=\"margin-left:auto;margin-right:auto;\">\n");
      out.write("            <tr>\n");
      out.write("                <td>Your name: </td>\n");
      out.write("                <td> ");
      out.print(session.getAttribute("name"));
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Your username: </td>\n");
      out.write("                <td> ");
      out.print(session.getAttribute("username"));
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <td>Your IC Number: </td>\n");
      out.write("                <td> ");
      out.print(session.getAttribute("icNumber"));
      out.write(" </td>\n");
      out.write("            </tr>\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
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
