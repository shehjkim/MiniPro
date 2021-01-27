<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<jsp:include page="../common/menu.jsp" />
<body>
<div align = "center">
	<div>
	<h3>${vo.mName }님 (ID-${vo.mId })로 회원가입 완료 되었습니다.</h3>
	</div>
</div>
<div align="center">
	<button type="button" onclick="location.href='loginForm.do'">로그인</button>
</div>
</body>
</html>