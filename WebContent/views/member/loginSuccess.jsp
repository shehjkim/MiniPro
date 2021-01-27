<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 성공</title>
</head>
<jsp:include page="../common/menu.jsp"></jsp:include>
<body>
<div align = "center">
	<h1>${vo.mName }님</h1>
	<h4>(ID-${vo.mId })</h4> 
	<h3>환영합니다.</h3>
</div>

</body>
</html>