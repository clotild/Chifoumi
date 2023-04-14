<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Chifoumi</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.min.js"
            integrity="sha384-cuYeSxntonz0PPNlHhBs68uyIAVpIIOZZ5JqeqvYYIcEL727kskC66kF92t6Xl2V"
            crossorigin="anonymous"></script>

</head>
<body>
<header>
    <h1> Chifoumi Game ( ● ✂ 🍂 ) </h1>
</header>
<main>
    <form method="post" action="${pageContext.request.contextPath}/chifoumi">
        <fieldset>
            <legend>Time to play !!</legend>
            <label for="${choice}">Your choice</label>
            <select name="choice" id="choice">
                <option selected>Make your choice</option>
                <option value="pierre">pierre</option>
                <option value="feuille">feuille</option>
                <option value="ciseaux">ciseaux</option>
            </select>

            <button type="submit" class="btn btn-primary">Confirm</button>

        </fieldset>
    </form>
</main>
</body>
</html>
