<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
        
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="com.titanbank.bll.*, javax.servlet.http.HttpSession, java.util.ArrayList" errorPage="errorPage.jsp"%>
        
        <%@include file="header.jsp" %>
        <%@include file="navigation.jsp" %>

        <section>
            <p>Account Holder User Page</p>
            <%
                String customerID = String.valueOf(session.getAttribute("customerID"));
                String firstName = (String)session.getAttribute("firstName");
                String lastName = (String)session.getAttribute("lastName");
            %>
            <p>Account Information for <% out.println(firstName + " " + lastName); %></p>
            <p>Customer ID: <% out.println(customerID); %></p>
            <p>
                <%@include file="accountInfo.jsp" %>
            </p>
        </section>

        <%@include file="footer.jsp" %>  
    </body>
</html>
