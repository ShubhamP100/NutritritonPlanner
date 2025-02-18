<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USer data</title>
</head>
<body>
    <h2>List of User</h2>

	<table border="1">
		<tr>
			<th>Age</th>
			<th>Height</th>
			<th>Weight</th>
			<th>Health Goal</th>
			<th>Medical Condition</th>
			<th>Created At</th>
			<th>Activity Level</th>
		</tr>
		
		<c:forEach items="${listUser}" var="v">
			<tr>
				<td>${v.age}</td>
				<td>${v.height}</td>
				<td>${v.weight}</td>
				<td>${v.healthGoal}</td>
				<td>${v.medicalCondition}</td>
				
				<td>${v.activityLevel}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
