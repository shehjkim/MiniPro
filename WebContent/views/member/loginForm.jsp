<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login 로그인</title>
</head>
		<jsp:include page="../common/menu.jsp" />
<body>
	<div align="center">
			<h1>로 그 인</h1>
		<div>
			<form id="frm" name="frm" action="login.do" method="post">
				<div><br/>
					<table border="1">
						<tr>
							<th width="100">아 이 디</th>
							<th width="150"><input type="text" id="mId" name="mId" size="30"></th>
						</tr>
							<th width="100">패스워드</th>
							<th width="150"><input type="password" id="mPassword" name="mPassword" size="30"></th>
					</table>
		</div><br/>
		<input type="submit" value="로그인"> &nbsp;&nbsp;&nbsp;
		<input type="reset" value="취소">
		</form>
	</div>
</div>
</body>
</html>