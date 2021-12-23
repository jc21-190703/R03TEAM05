<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="../css/insert.css">
<title>登録画面</title>
</head>
<body>

	<table align="center" border="1" style="border-collapse: collapse">
		<tr>
			<th>画</th>
			<th>名前</th>
			<th>期限</th>
			<th>数</th>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today" min="2021-11-01"
				max="2022-02-28"> <script src="../../webapp/WEB-INF/js/TDjs/today.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down">－</button>
						<input type="text" value="0" class="inputtext" id="textbox">
						<button class="button" id="up">＋</button>
					</div>
				</div> <script src="../../js/NCjs/main.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today1" min="2021-11-01"
				max="2022-02-28"><script src="today1.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down1">－</button>
						<input type="text" value="0" class="inputtext" id="textbox1">
						<button class="button" id="up1">＋</button>
					</div>
				</div><script src="/src/main/webapp/WEB-INF/js/NCjs/main1.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today2" min="2021-11-01"
				max="2022-02-28"><script src="today2.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down2">－</button>
						<input type="text" value="0" class="inputtext" id="textbox2">
						<button class="button" id="up2">＋</button>
					</div>
				</div><script src="main2.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		
				<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today3" min="2021-11-01"
				max="2022-02-28"><script src="today3.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down3">－</button>
						<input type="text" value="0" class="inputtext" id="textbox3">
						<button class="button" id="up3">＋</button>
					</div>
				</div><script src="main3.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today4" min="2021-11-01"
				max="2022-02-28"><script src="today4.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down4">－</button>
						<input type="text" value="0" class="inputtext" id="textbox4">
						<button class="button" id="up4">＋</button>
					</div>
				</div><script src="main4.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today5" min="2021-11-01"
				max="2022-02-28"><script src="today5.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down5">－</button>
						<input type="text" value="0" class="inputtext" id="textbox5">
						<button class="button" id="up5">＋</button>
					</div>
				</div><script src="main5.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today6" min="2021-11-01"
				max="2022-02-28"><script src="today6.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down6">－</button>
						<input type="text" value="0" class="inputtext" id="textbox6">
						<button class="button" id="up6">＋</button>
					</div>
				</div><script src="main6.js"></script>
			</td>
		</tr>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
		<tr>
			<td>
				＋
			</td>

			<td><input type="text" name="name"></td>

			<td><input type="date" value="today" id="today7" min="2021-11-01"
				max="2022-02-28"><script src="today7.js"></script></td>

			<td>
				<div class="container">

					<div class="field">
						<button class="button" id="down7">－</button>
						<input type="text" value="0" class="inputtext" id="textbox7">
						<button class="button" id="up7">＋</button>
					</div>
				</div><script src="main7.js"></script>
			</td>
		</tr>
		<tr>
		<td colspan="4">
		<button type="submit" class="btn btn-primary aaa">これで応募</button>
		</td>
		</tr>
	</table>
<%--///////////////////////////////////////////////////////////////////////////////// --%>
	
	<form  action = "/insert.java">
	
				
			
	</form>
</body>	
</html>