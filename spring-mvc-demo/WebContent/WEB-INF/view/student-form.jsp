<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student-form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student">
		First name : <form:input path="firstName" />
		<br><br>
		Last name : <form:input path="lastName" />
		<br><br>
		Country : 
		<!-- 
		<form:select path="country">
			<form:option value="Brazil" label="Brazil"/>
			<form:option value="France" label="France"/>
			<form:option value="Germany" label="Germany"/>
			<form:option value="India" label="India"/>
		</form:select>
		 -->
		 <!-- 자바에서 직접 옵션들 가져옴 -->
		<form:select path="country">
			<form:options items="${student.countryOptions }"/>
		</form:select>
		<br><br>
		Favorite Language : 
		Java <form:radiobutton path="favoriteLanguage" value="Java"/>
		C# <form:radiobutton path="favoriteLanguage" value="C#"/>
		PHP <form:radiobutton path="favoriteLanguage" value="PHP"/>
		Ruby <form:radiobutton path="favoriteLanguage" value="Ruby"/>
		<br><br>
		Operating Systems:
		Linux <form:checkbox path="operatingSystems" value="linux"/>
		Mac Os <form:checkbox path="operatingSystems" value="Mac Os"/>
		windows <form:checkbox path="operatingSystems" value="windows"/>
		<br><br>
		<input type="submit" value="submit">
	</form:form>
</body>
</html>