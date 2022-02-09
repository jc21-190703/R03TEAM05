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
<title>メイン画面</title>
</head>
<%
Optional<List<String[]>>optList = Optional.ofNullable((List<String[]>)request.getAttribute("list"));
request.getAttribute("name");
List<String[]> list=new ArrayList<>();
if(optList.isPresent()){
	list = optList.get();
}
%>
<body bgcolor="#87cefa">

<H1 align="center">冷蔵庫管理</H1>
<table class="table" align="center" border="1" style="border-collapse: collapse"">

  <thead class="tableheader">
				<tr>
					<th>アイコン</th>
					<th>名前</th>
					<th>期限</th>
					<th>数</th>
				</tr>
			</thead>
  <tbody>
  
  <% for (String[] s : list){ %>
    <tr>
  
<td><%=s[0] %></td>
<td><%=s[1] %></td>
<td><%=s[2] %></td>
<td><%=s[3] %></td>

    </tr>
    <%} %>
    
    
  </tbody>
</table>
<table align="center">
<tr>
<td>
<form method="get" action="./insertCall">
<button type="submit" class="underbutton" id="returnbutton">登録へ</button>
</form>
</td>
<td>
<form method="get" action="./editPage">
<button type="submit" class="underbutton" id="nextbutton">編集へ</button>
</form>
</td>
</tr>
</table>
</body>
</html>