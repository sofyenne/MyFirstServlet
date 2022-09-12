<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="web.ResModel"%>
    <%
    ResModel res = (ResModel)request.getAttribute("model");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcule Poids</title>
</head>
<body>
<form action="calculePoid.poids" method="post">
<label>Taile</label>
<input type="text" name="taille" value="<%=res.getTaille() %>">
<label>sexe</label>
<input type="text" name="sexe" value="<%=res.getSexe() %>"  >
<button type="submit">Calculer </button>
</form>
<h3>result : <%=res.getPoids()%>  </h3>
</body>
</html>