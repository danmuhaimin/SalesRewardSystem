/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.view;

import com.system.util.DBConnection;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tengk
 */
public class ViewSalesRankingServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()){
            Connection conn = DBConnection.createConnection();
            PreparedStatement pstmt = conn.prepareCall("SELECT E.NAME, E.ICNUMBER, S.SALESAMOUNT "
                                                     + "FROM EMPLOYEE E JOIN SALES S "
                                                     + "ON E.ICNUMBER = S.ICNUMBER "
                                                     + "ORDER BY S.SALESAMOUNT DESC");
            ResultSet rs = pstmt.executeQuery();
            
            HttpSession session = request.getSession();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>\n" +
                    "    <head>\n" +
                    "        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
                    "        <style>\n" +
                    "            body {\n" +
                    "                margin: 0;\n" +
                    "            }\n" +
                    "\n" +
                    "            .topnav {\n" +
                    "                overflow: hidden;\n" +
                    "                background-color: #74879C\n" +
                    "            }\n" +
                    "\n" +
                    "            .topnav a {\n" +
                    "                float: left;\n" +
                    "                color: #f2f2f2;\n" +
                    "                text-align: center;\n" +
                    "                padding: 14px 16px;\n" +
                    "                text-decoration: none;\n" +
                    "                font-size: 17px;\n" +
                    "            }\n" +
                    "\n" +
                    "            .topnav a:hover {\n" +
                    "                background-color: #DCD7D1;\n" +
                    "                color: black;\n" +
                    "            }\n" +
                    "\n" +
                    "            .topnav a.active {\n" +
                    "                background-color: #30414C;\n" +
                    "                color: white;\n" +
                    "            }\n" +
                    "        </style>\n" +
                    "        <title>Sales Ranking</title>\n" +
                    "    </head>\n" +
                    "    <body>\n" +
                    "        <div class=\"topnav\">\n" +
                    "            <a href=\"dashboard.jsp\">Dashboard</a>\n" +
                    "            <a class =\"active\" href=\"ViewSalesRankingServlet\">View Sales Ranking</a>\n" +
                    "            <a href=\"ViewCurrentRewardServlet\">Current Reward</a>\n" +
                    "            <a href=\"LogoutServlet\">Logout: " + session.getAttribute("username") + "</a>\n" +
                    "        </div>\n" +
                    "        <h1 style=\"text-align:center;\">Sales Ranking</h1><br><br>\n" +
                    "        <table border=\"2\" style=\"margin-left:auto;margin-right:auto; text-align:center; width:50%; border-collapse: collapse\">\n" +
                    "            <tr>\n" +
                    "                <strong>\n" +
                    "                    <th>No.</th>\n" +
                    "                    <th>Name</th>\n" +
                    "                    <th>IC Number</th>\n" +
                    "                    <th>Sales(RM)</th>\n" +
                    "                </strong>\n" +
                    "            </tr>\n");
                            int count = 1;
                            while(rs.next()){ // Print table row
                                String nameDB = rs.getString("NAME");
                                String icNumberDB = rs.getString("ICNUMBER");
                                String salesDB = rs.getString("SALESAMOUNT");
                                out.println("<tr>");
                                    out.println("<td>" + count + "</td>");
                                    out.println("<td>" + nameDB + "</td>");
                                    out.println("<td>" + icNumberDB + "</td>");
                                    out.println("<td>" + salesDB + "</td>");
                                out.println("</tr>");
                                count++;
                            }
                    out.println(
                    "        </table>\n" +
                    "\n" +
                    "    </body>\n" +
                    "</html> ");
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
