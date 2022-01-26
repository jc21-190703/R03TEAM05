<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Optional"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="edit.FoodDate" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>編集画面</title>
</head>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath() %>/css/editstyle.css">

<%
FoodDate foodDate1=(FoodDate)request.getAttribute("foodDate1");
String iconNo1=foodDate1.getIconNo();
String foodName1=foodDate1.getFoodName();
String expryDate1=foodDate1.getExpryDate();
String quantity1=foodDate1.getQuantity();
%>
<%
FoodDate foodDate2=(FoodDate)request.getAttribute("foodDate2");
String iconNo2=foodDate1.getIconNo();
String foodName2=foodDate1.getFoodName();
String expryDate2=foodDate1.getExpryDate();
String quantity2=foodDate1.getQuantity();
%>
<%
FoodDate foodDate3=(FoodDate)request.getAttribute("foodDate3");
String iconNo3=foodDate1.getIconNo();
String foodName3=foodDate1.getFoodName();
String expryDate3=foodDate1.getExpryDate();
String quantity3=foodDate1.getQuantity();
%>
<%
FoodDate foodDate4=(FoodDate)request.getAttribute("foodDate4");
String iconNo4=foodDate1.getIconNo();
String foodName4=foodDate1.getFoodName();
String expryDate4=foodDate1.getExpryDate();
String quantity4=foodDate1.getQuantity();
%>
<%
FoodDate foodDate5=(FoodDate)request.getAttribute("foodDate5");
String iconNo5=foodDate1.getIconNo();
String foodName5=foodDate1.getFoodName();
String expryDate5=foodDate1.getExpryDate();
String quantity5=foodDate1.getQuantity();
%>
<%
FoodDate foodDate6=(FoodDate)request.getAttribute("foodDate6");
String iconNo6=foodDate1.getIconNo();
String foodName6=foodDate1.getFoodName();
String expryDate6=foodDate1.getExpryDate();
String quantity6=foodDate1.getQuantity();
%>
<%
FoodDate foodDate7=(FoodDate)request.getAttribute("foodDate7");
String iconNo7=foodDate1.getIconNo();
String foodName7=foodDate1.getFoodName();
String expryDate7=foodDate1.getExpryDate();
String quantity7=foodDate1.getQuantity();
%>
<%
FoodDate foodDate8=(FoodDate)request.getAttribute("foodDate8");
String iconNo8=foodDate1.getIconNo();
String foodName8=foodDate1.getFoodName();
String expryDate8=foodDate1.getExpryDate();
String quantity8=foodDate1.getQuantity();
%>
<%
FoodDate foodDate9=(FoodDate)request.getAttribute("foodDate9");
String iconNo9=foodDate1.getIconNo();
String foodName9=foodDate1.getFoodName();
String expryDate9=foodDate1.getExpryDate();
String quantity9=foodDate1.getQuantity();
%>
<%
FoodDate foodDate10=(FoodDate)request.getAttribute("foodDate10");
String iconNo10=foodDate1.getIconNo();
String foodName10=foodDate1.getFoodName();
String expryDate10=foodDate1.getExpryDate();
String quantity10=foodDate1.getQuantity();
%>
<%
FoodDate foodDate11=(FoodDate)request.getAttribute("foodDate11");
String iconNo11=foodDate1.getIconNo();
String foodName11=foodDate1.getFoodName();
String expryDate11=foodDate1.getExpryDate();
String quantity11=foodDate1.getQuantity();
%>
<%
FoodDate foodDate12=(FoodDate)request.getAttribute("foodDate12");
String iconNo12=foodDate1.getIconNo();
String foodName12=foodDate1.getFoodName();
String expryDate12=foodDate1.getExpryDate();
String quantity12=foodDate1.getQuantity();
%>
<%
FoodDate foodDate13=(FoodDate)request.getAttribute("foodDate13");
String iconNo13=foodDate1.getIconNo();
String foodName13=foodDate1.getFoodName();
String expryDate13=foodDate1.getExpryDate();
String quantity13=foodDate1.getQuantity();
%>
<%
FoodDate foodDate14=(FoodDate)request.getAttribute("foodDate14");
String iconNo14=foodDate1.getIconNo();
String foodName14=foodDate1.getFoodName();
String expryDate14=foodDate1.getExpryDate();
String quantity14=foodDate1.getQuantity();
%>
<%
FoodDate foodDate15=(FoodDate)request.getAttribute("foodDate15");
String iconNo15=foodDate1.getIconNo();
String foodName15=foodDate1.getFoodName();
String expryDate15=foodDate1.getExpryDate();
String quantity15=foodDate1.getQuantity();
%>
<%
FoodDate foodDate16=(FoodDate)request.getAttribute("foodDate16");
String iconNo16=foodDate1.getIconNo();
String foodName16=foodDate1.getFoodName();
String expryDate16=foodDate1.getExpryDate();
String quantity16=foodDate1.getQuantity();
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
					<th>アイコン</th>
					<th>名前</th>
					<th>期限</th>
					<th>数</th>
				</tr>
			</thead>
			
				<tbody>
    				<tr>
						<td>
							<label for="p01s" class="showHand" id="p01g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo1 %>name="iconNo" id="p01s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate1 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate1 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity1 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p02s" class="showHand" id="p02g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo2 %>name="iconNo" id="p02s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate2 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate2 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity2 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p03s" class="showHand" id="p03g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo3 %>name="iconNo" id="p03s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate3 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate3 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity3 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%><tr>
						<td>
							<label for="p04s" class="showHand" id="p04g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo4 %>name="iconNo" id="p04s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate4 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate4 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity4 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p05s" class="showHand" id="p05g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo5 %>name="iconNo" id="p05s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate5 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate5 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity5 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p06s" class="showHand" id="p06g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo6 %>name="iconNo" id="p06s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate6 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate6 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity6 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p07s" class="showHand" id="p07g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo7 %>name="iconNo" id="p07s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate7 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate7 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity7 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p08s" class="showHand" id="p08g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo8 %>name="iconNo" id="p08s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate8 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate8 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity8 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p09s" class="showHand" id="p09g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo9 %>name="iconNo" id="p09s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate9 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate9 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity9 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p010s" class="showHand" id="p010g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo10 %>name="iconNo" id="p010s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate10 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate10 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity10 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p011s" class="showHand" id="p011g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo11 %>name="iconNo" id="p011s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate11 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate11 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity11 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p012s" class="showHand" id="p012g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo12 %>name="iconNo" id="p012s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate12 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate12 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity12 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p013s" class="showHand" id="p013g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo13 %>name="iconNo" id="p013s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate13 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate13 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity13 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p014s" class="showHand" id="p014g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo14 %>name="iconNo" id="p014s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate14 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate14 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity14 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p015s" class="showHand" id="p015g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo15 %>name="iconNo" id="p015s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate15 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate15 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity15 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
					<tr>
						<td>
							<label for="p016s" class="showHand" id="p016g">＋</label> 
							<script src="<%=request.getContextPath()%>/js/Icon/icon.js"></script> 
							<input type="text" value=<%=iconNo16 %>name="iconNo" id="p016s" onclick="showDialog(event);"class="z">
							<script	src="<%=request.getContextPath()%>/js/Icon/icon.js"></script>
						</td>
						<td><input type="text" value=<%=foodDate16 %> name="foodName" id="foodmane"></td>
						<td><input type="date" value=<%=expryDate16 %> name="expryDate" id="expryDate"></td>
						<td>
							<div class="pmbutton">
    							<button class="button" id="down">－</button>
    							<input type="text" value=<%=quantity16 %> name="quantity" class="inputtext" id="textbox">
    							<button class="button" id="up">＋</button>
  							</div>
  							<script src="pmbutton.js"></script>
						</td>
    				</tr>
<%-- ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// --%>
    				
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