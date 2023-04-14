<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chifoumi</title>
</head>
<body>
<main>
    <h1> Result</h1>

    <%
        String msg = (String) request.getAttribute("result");
        String playerChoice = (String) request.getAttribute("playerChoice");
        String serverChoice = (String) request.getAttribute("serverChoice");

    %>
    <p>
        Your choice is : <%=playerChoice %><br>
        The computer choice is : <%=serverChoice %><br>
        The result is : <%=msg%><br>
    <p>
       <button> <a href="chifoumi">Play again</a></button>
</p>

</main>
</body>
</html>
