/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.system.controller;

import com.system.bean.EmployeeSaleBean;
import com.system.dao.UpdateEmployeeSalesDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author tengk
 */
public class UpdateEmployeeSaleServlet extends HttpServlet {

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
            String icNumber = request.getParameter("icNumber");
            double updateSalesAmount =  Double.parseDouble(request.getParameter("updateSalesAmount"));
            
            EmployeeSaleBean employeeSaleBean = new EmployeeSaleBean();
            
            employeeSaleBean.setIcNumber(icNumber);
            employeeSaleBean.setUpdateSalesAmount(updateSalesAmount);
            
            UpdateEmployeeSalesDao updateEmployeeSalesDao = new UpdateEmployeeSalesDao();
            String status = updateEmployeeSalesDao.updateStatus(employeeSaleBean);
            
            if(status.equals("SUCCESS")) {  
                request.getRequestDispatcher("AdminViewSalesRankingServlet").forward(request, response);
            }
            else{
                request.setAttribute("errorMessage", "Failed: please re-try");
                request.getRequestDispatcher("adminupdateemployee.jsp").forward(request, response);
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