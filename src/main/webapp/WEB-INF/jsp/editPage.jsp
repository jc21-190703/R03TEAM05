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
	<div class="popup" id="popup-id">
		<div class="popup-inner" id="wpopup-inner">
			<img src="<%=request.getContextPath()%>/img/image01.jpg"
				onclick="returnData('img/image01.jpg');"> <img
				src="<%=request.getContextPath()%>/img/image02.jpg"
				onclick="returnData('img/image02.jpg');"> <img
				src="<%=request.getContextPath()%>/img/image03.jpg"
				onclick="returnData('img/image03.jpg');"> <img
				src="<%=request.getContextPath()%>/img/image04.jpg"
				onclick="returnData('img/image04.jpg');">
			<button type="button" onclick="popupClose();">キャンセル</button>
		</div>
		<div class="popup-back" onclick="popupClose();"></div>
	</div>
	
	<div class="header">
		<P><img src="./img/editHeader.svg"></P>
	</div>
	
	<form method="get" action="editcheck" class="inputable">
		<table class="foodtable" align="center">
			<thead class="tableheader">
				<tr>
					<th>イラスト</th>
					<th>名前</th>
					<th>期限</th>
					<th>数</th>
				</tr>
			</thead>
			
				<tbody>
    				<tr>
						<td>
							<label for="p00s" class="showHand" id="p00g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" name="iconNo" id="p00s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=list[0][0] %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=s[2] %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=s[3] %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
    				
    				
    			</tbody>
		</table>

		<table align="center">
			<tr>
				<td><a href="http://localhost:8080/Refrigerator/A"><button class="underbutton" id="returnbutton" type="button">戻る</button></a></td>
				<td><button type="submit" class="underbutton" id="nextbutton">決定</button></td>
			</tr>
		</table>
	</form>
	
</body>
</html>