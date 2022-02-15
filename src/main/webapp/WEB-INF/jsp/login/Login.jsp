<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%-- <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">--%>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/main.css">
<title>LOGIN</title>
</head>
<body bgcolor="#87cefa">
<form action="<%=request.getContextPath()%>/Login">
				 UserName : <INPUT type="text" name="username"><br><br>
				 Password : <INPUT type="password" name="password"><br><br>
				<button type="submit" class="btn btn-primary">login</button>
			</form>
<a href="<%=request.getContextPath()%>/NewUser">新規登録</a>

</body>
</html>