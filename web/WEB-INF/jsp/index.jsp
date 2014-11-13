<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Titan Bank</title>
        
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="javax.servlet.*" errorPage="errorPage.jsp"%>
        
        <%@include file="header.jsp" %>

        
            <form action="LoginServlet" method="post">
                <p><label>Username: <input type="text" name="username" placeholder="Username" /></label></p>
                <p><label>Password: <input type="text" name="password" placeholder="Password" /></label></p>
                <button type="submit" class="btn btn-default" id="login-btn">Submit</button>
            </form>
        

        <%@include file="footer.jsp" %>
         
    </body>
</html>
