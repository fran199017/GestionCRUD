<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/css/style.css "/>
</head>
<body>

	<h1>Listado de Clientes</h1>

	<table>

		<tr>
			<th>Nombre</th>
			<th>Apellido</th>
			<th>Email</th>
		</tr>
		<!-- Creamos un forEach de jsp para recorrer los clientes y nos cree un td por cada cliente -->
		<c:forEach var="clienteTemp" items="${clientes }">
			<tr>
				<td>${clienteTemp.nombre}</td>
				<td>${clienteTemp.apellido}</td>
				<td>${clienteTemp.email}</td>

			</tr>

		</c:forEach>


	</table>

</body>
</html>