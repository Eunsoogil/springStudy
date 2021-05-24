<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Hello World!

<br><br>
<!-- ESTL 안깔아도 동작함 -->
Student name : ${param.studentName}

<br><br>
<!-- model에 담겨있는 값 읽음 -->
The message : ${message}
</body>
</html>