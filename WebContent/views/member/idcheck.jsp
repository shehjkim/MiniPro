<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>중복체크</title>
</head>
<script type="text/javascript">
	function formClose() {
		
		if(${check }) {
			window.opener.document.getElementById("mPassword").focus();
		}else{
			window.opener.document.getElementById("mId").value="";
			window.opener.document.getElementById("mId").focus();
			opener.frm.mId.focus();
		}
		window.close();
	}
	
</script>
<body>
<div align = "center">
	<h3>${msg }</h3>	
		<button type="button" onclick="formClose()">확인</button>
</div>
</body>
</html>