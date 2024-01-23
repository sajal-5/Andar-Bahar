<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Andar Bahar Game Result</title>
</head>
<body>
    <h1>Result: ${result}</h1>

    <p>Joker Card: ${jokerCard}</p>

    <%-- Iterate over the 'andarCard' ArrayList and print its elements in the same line --%>
   
   	<p>
   	Andar Cards:
    <% 
        java.util.ArrayList<Integer> andarCard = (java.util.ArrayList<Integer>)request.getAttribute("andarCard");
        if (andarCard != null) {
            for (Integer card : andarCard) {
    %>
                <%= card %> 
    <%
            }
        }
    %>
	</p>

    
    <p>
    <%-- Iterate over the 'baharCard' ArrayList and print its elements in the same line --%>
    Bahar Cards:
    <% 
        java.util.ArrayList<Integer> baharCard = (java.util.ArrayList<Integer>)request.getAttribute("baharCard");
        if (baharCard != null) {
            for (Integer card : baharCard) {
    %>
                <%= card %> 
    <%
            }
        }
    %>
    </p>
    
    <p>Reward: ${reward}</p>

    <button onclick="window.location.href='/';">Play Again</button>
</body>
</html>
