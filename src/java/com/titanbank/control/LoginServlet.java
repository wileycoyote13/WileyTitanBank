package com.titanbank.control;

import com.titanbank.bll.*;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet 
{
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
            throws ServletException, IOException 
    {
        AuthenticationService service;
        String userName;
        String password;
        Customer customer;
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        
        response.setContentType("text/html;charset=UTF-8");
        try 
        {
            service = new AuthenticationService(new Users());
            userName = (String)request.getParameter("username");
            password = (String)request.getParameter("password");
            customer = service.logIn(userName, password);
            
            if(customer != null)
            {
                session.setAttribute("loggedIn", new Boolean(true));
                session.setAttribute("userName", userName);
                session.setAttribute("password", password);
                session.setAttribute("customerID", customer.getCustomerID());
                session.setAttribute("firstName", customer.getFirstName());
                session.setAttribute("lastName", customer.getLastName());
                
                request.getRequestDispatcher("DisplayUserPageServlet").forward(request, response);
            }
            else
            {
                session.setAttribute("loggedIn", new Boolean(false));
                
                out.println("<!DOCTYPE html>");
                out.println("<html lang=\"en\">");
                out.println("<head>");
                out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
                out.println("<title>Titan Bank LoginServlet</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Titan Bank</h1>");
                out.println("Sorry, Incorrect Login. Try Again!");
                out.println("</body>");
                out.println("</html>");
            }
        }
        catch(UserNotFoundException ex)
        {
            session.setAttribute("loggedIn", new Boolean(false));
            
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<title>Titan Bank LoginServlet</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Titan Bank</h1>");
            out.println("Sorry, Incorrect Username. Try Again!");
            out.println("</body>");
            out.println("</html>");
        }
        catch(InvalidPasswordException ex)
        {
            session.setAttribute("loggedIn", new Boolean(false));
            
            out.println("<!DOCTYPE html>");
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">");
            out.println("<title>Titan Bank LoginServlet</title>");
            out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"styles.css\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Titan Bank</h1>");
            out.println("Sorry, Incorrect Password. Try Again!");
            out.println("</body>");
            out.println("</html>");
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
