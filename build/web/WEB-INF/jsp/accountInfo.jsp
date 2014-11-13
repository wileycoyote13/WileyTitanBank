<!DOCTYPE html>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Titan Bank</title>
        
    </head>

    <body>
        <%@page contentType="text/html" pageEncoding="UTF-8" import="com.titanbank.bll.*" errorPage="errorPage.jsp"%>
        
        <%@include file="header.jsp" %>
        
        <%@include file="navigation.jsp" %>
        <section>
            <p>Account Info</p>
            <p>
                <jsp:include page="/ViewAccountServlet" flush="true" />
            </p>
        </section>
        
        <%@include file="footer.jsp" %>
    </body>
</html>
