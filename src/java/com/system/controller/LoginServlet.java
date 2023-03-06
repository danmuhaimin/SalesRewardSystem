/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.controller;

import com.system.bean.LoginBean;
import com.system.dao.EmployeeDao;
import com.system.dao.LoginDao;
import com.system.model.Employee;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author tengk
 */
public class LoginServlet extends HttpServlet {

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
            throws ServletException, IOException{
        
        try {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            LoginBean loginBean = new LoginBean();
            loginBean.setUsername(username);
            loginBean.setPassword(password);
            
            LoginDao loginDao = new LoginDao();
            String validation = loginDao.authenticateUser(loginBean);
            
            if(validation.equals("SUCCESS")) {
                
                EmployeeDao employeeDao = new EmployeeDao();
                Employee employee = employeeDao.retrieveEmployee(username); // Retrieve Employee Object
                
                HttpSession session = request.getSession(); // Create new session
                session.setAttribute("username", username);
                session.setAttribute("name", employee.getName());
                session.setAttribute("icNumber", employee.getIcNumber());
                
                if(username.contains("admin")){
                    request.getRequestDispatcher("admindashboard.jsp").forward(request, response);
                }
                else{
                    request.getRequestDispatcher("dashboard.jsp").forward(request, response);
                }
                
            }
            else if(validation.equals("FAILED")) {
                request.setAttribute("errorMessage", "Failed: Credential Not Found");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
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
