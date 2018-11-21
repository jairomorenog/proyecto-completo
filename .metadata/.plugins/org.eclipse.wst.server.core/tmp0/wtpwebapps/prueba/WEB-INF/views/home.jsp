<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Formulario de busqueda
</h1>
<form action="ver.pr" method="post">

<div class="fila">
<label id="lblrup">Rup</label>
<input type="text" class="txtrup" name="txtrup" />
</div>
<input type="submit" value="submit" />

</form>


<c:if test="${ mensaje =="ok" }">
<label class="lblmensaje">${mensaje}+ "ok"</label>
</c:if>
<c:if test="${auto!=null}">
<p>${auto.id }</p>
<p>${auto.marca }</p>
<p>${auto.color }</p>
</c:if>

<jsp:forward page="irhola"></jsp:forward>

</body>
</html>
