<%-- 
    Document   : Purchases
    Created on : Nov 14, 2017, 9:14:32 PM
    Author     : kmne6
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Purchases</title>
    </head>
    <body>
        <h1>Member Purchases</h1>
        
        <h2>${m.memid}</h2>
        <h2>${m.firstnm} ${m.lastnm}</h2>
        <table border="1">
            <tr>
            <th>Purchase Dt</th>
            <th>Purchase Type</th>
            <th>Trans. Cd</th>
            <th>Trans. Desc</th>
            <th>Amount</th>            
        </tr>
        <c:forEach var="purch" items="${pur}">
            <tr>
                <td align="left">${purch.purchdt}</td>
                <td align="left">${purch.transtype}</td>
                <td align="left">${purch.tcd}</td>
                <td align="left">${purch.transdesc}</td>
                <td align="right">${purch.amt}</td>
            </tr>
        </c:forEach>                    
        </table>
        <br>
        <p>${msg}</p>
        <br>
        <a href=""MemberScreen.jsp">Back to Member Screen</a>
        
    </body>
</html>
