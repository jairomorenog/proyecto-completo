<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>

<!DOCTYPE html>
<html>
<head>
 <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">
	<title>Home</title>
	<meta http-equiv="content-type" content="text/html; utf-8">
 <link rel="stylesheet" type="text/css" href="css/stilylogin.css"/>
 
</head>
<body>
<header>
<h1>Control de ingreso</h1>
</header>
<section class="principal">
<article>
<div class="contenedor">

<header>
<h3>Login</h3>
</header>
<form action="enviar" method="post">
<div class="fila input-field">

<input name="txtuser" id="txtuser" type="text" class="txtuser validate" />
<label class="lbluser" id="lbluser" for="txtuser" > User</label>
</div>


<div class="fila input-field">

<input name="txtpassword" id="txtpassword" type="text" class="txtpassword validate" />
<label class="lblpassword" id="lbluser" for="txtpassword" > Password</label>
</div>

<input type="submit" class="btn" value="submit" />
</form>
<c:if test="${mensaje !=" "}">
<label class="lblmensaje">${mensaje}</label>
</c:if>

</article>

</section>

</div>
<script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
 <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
</body>
</html>
