<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login MVC</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
<div class="container">
    <div class="box-login">
        <form method="post" action="ControllerLogin">
            <h1> Efetue login</h1>
            <input id="input-login" name="login" type="text" placeholder="Login" autofocus>
            <br>
            <input id="input-senha" name="senha" type="password" placeholder="Senha">
            <button type="submit">Entrar</button>
            <output>
                <%=
                request.getParameter("resultado")
                %>
            </output>
        </form>
    </div>
</div>




</body>
</html>