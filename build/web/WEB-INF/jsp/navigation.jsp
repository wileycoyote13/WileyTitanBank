
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
    </head>
    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="com.titanbank.bll.*" errorPage="errorPage.jsp"%>
        
        <%@include file="header.jsp" %>
        
        <div class="navbar" id="tbnavbar">
                    <ul class="nav-left">
                      <li ><a href="#">Accounts</a></li>
                      <li ><a href="#">Transfers</a></li>
                      <li><a href="#">Manage Checks</a></li>
                      <li><a href="#">Account Info</a></li>
                    </ul>
        </div>
        
        <%@include file="footer.jsp" %>
    </body>
</html>
