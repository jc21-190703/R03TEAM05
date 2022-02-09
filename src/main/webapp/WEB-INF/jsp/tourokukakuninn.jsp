<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/css/insertcheck.css">

<title>OUBO</title>
</head>
<%
Optional<List<String[]>> optList = Optional.ofNullable((List<String[]>) request.getAttribute("list"));
List<String[]> list = new ArrayList<>();
if (optList.isPresent()) {
	list = optList.get();
}
%>
<body bgcolor="#87cefa">

	><h1 align="center">登録内容の確認</h1>
	<table align="center" border="1" style="border-collapse: collapse" bgcolor="#ffffff">
			<thead class="tableheader">
				<tr>
					<th>アイコン</th>
					<th>名前</th>
					<th>期限</th>
					<th>数</th>
				</tr>
			</thead>
			<tbody>
	
		

			<%
			for (String[] a : list) {
			%>
			<tr>
				<td><%=a[0] %></td>
				<td><%=a[1] %></td>
				<td><%=a[2] %></td>
				<td><%=a[3] %></td>
			</tr>
			<%
			}
			%>
			
			
		</tbody>
	</table>

	<div class="row">
		<div class="col"></div>
		<div class="col-8">

			<table align="center">
			<tr>
			<td><form action="<%=request.getContextPath()%>/insertanddelete">
				<button class="underbutton" id="returnbutton" type="button">戻る</button>
			</form></td>

			<td><form action="<%=request.getContextPath()%>//tourokukakunin">
				<button type="submit" class="underbutton" id="nextbutton">決定</button>
			</form></td>
			</tr>
			</table>
		</div>
		<div class="col"></div>
	</div>


</body>

</html>