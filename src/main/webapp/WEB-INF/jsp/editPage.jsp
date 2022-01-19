<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集画面</title>
</head>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/editstyle.css">

<%
Optional<List<String[]>>optList = Optional.ofNullable((List<String[]>)request.getAttribute("list"));
List<String[]> list=new ArrayList<>();
if(optList.isPresent()){
	list = optList.get();
}
%>

<body bgcolor="#87cefa">
	<div class="header">
		<P><img src="./img/editHeader.svg"></P>
	</div>
	
	<%-- <form method="get" action="あとでいれます" class="inputable"> --%>
		<table align="center">
			<thead class="tableheader">
				<tr>
					<th>アイコン</th>
					<th>名前</th>
					<th>期限</th>
					<th>数</th>
				</tr>
			</thead>
			<tbody>
				<%! int count = 0; %>
				<% for (String[] s : list){ %>
    				<tr>
						<td><%=s[0] %></td>
						<td><input type="text" value=<%=s[1] %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=s[2] %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=s[3] %> class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
	    		<%} %>
			</tbody>
		</table>

		<table align="center">
			<tr>
				<td><a href="http://localhost:8080/Refrigerator/A"><button class="underbutton" id="returnbutton" type="button">戻る</button></a></td>
				<td><button type="submit" class="underbutton" id="nextbutton">決定</button></td>
			</tr>
		</table>
	<%-- </form> --%>
	
</body>
</html>