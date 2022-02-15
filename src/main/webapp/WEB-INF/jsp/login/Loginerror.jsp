<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>エラー</title>
<link href="css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<header>
		<h1>エラー</h1>
	</header>

	<div id="contents">
		<%
		out.println(request.getAttribute("error"));
		%>
		<a href="CLogin">ログインページへ戻る</a>
	</div>
</body>
</html>