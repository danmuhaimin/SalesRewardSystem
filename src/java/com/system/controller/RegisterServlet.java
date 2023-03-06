/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.controller;

import com.system.bean.RegisterBean;
import com.system.dao.RegisterDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tengk
 */
public class RegisterServlet extends HttpServlet {

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
        try {
            String name = request.getParameter("name");
            String username = request.getParameter("username");
            String icNumber = request.getParameter("icNumber");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");
            
            //request.setAttribute("name",name);
            //request.setAttribute("username", username);
        
            RegisterBean registerBean = new RegisterBean();
            
            registerBean.setName(name);
            registerBean.setUsername(username);
            registerBean.setIcNumber(icNumber);
            registerBean.setPassword(password);
            registerBean.setConfirmPassword(confirmPassword);
        
            RegisterDao registerDao = new RegisterDao();
            String duplicateValidation = null;

            duplicateValidation = registerDao.checkDuplicate(registerBean);
        
            if(duplicateValidation.equals("SUCCESS")) {
                request.setAttribute("name",name);
                request.setAttribute("username", username);
                request.getRequestDispatcher("SuccessRegisterServlet").forward(request, response);
                
                ///request.getSession().setAttribute("name",name);
                //request.setAttribute("username", username);
            }
        
            else {
                request.setAttribute("errorMessage", duplicateValidation);
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
        }
        catch(Exception e) {
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
