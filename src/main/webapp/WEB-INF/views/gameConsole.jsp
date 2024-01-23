<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Andar Bahar Game</title>

<script src=""></script>
</head>
<body>
	<h1>Andar Bahar Game</h1>
	<p>Joker Card: ${jokerCard}</p>
    
    <form action="/choose" method="post">
        <label>Choose Side:</label>
        <input type="radio" name="side" value="0" required> Andar
        <input type="radio" name="side" value="1"> Bahar
        <br/><br/>
        <label for="betAmount">Place the Bet (max Limit: 10000):</label>
  		<input type="number" id="betAmount" name="betAmount" min="1" max="10000" required>
  		<br/><br/>
        <button type="submit">Submit Choice</button>
    </form>
</body>
</html>