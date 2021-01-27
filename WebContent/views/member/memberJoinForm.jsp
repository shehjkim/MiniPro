<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입</title>
<script type="text/javascript">
	function formCheck() {
		
		if(frm.mPassword.value == ""){
			alert("패스워드는 반드시 입력해야 합니다. ");
			frm.mPassword.focus();
			return false;
		}

		if (frm.mPassword.value != frm.mPassword1.value) {
			alert("패스워드가 일치 하지 않습니다.");
			frm.mPassword1.value = null;
			frm.mPassword.focus();
			return false;
		}
		if (frm.mName.value == "") {
			alert("이름은 반드시 입력해야 합니다. ");
			frm.mName.focus();
			return false;
		}
		
		return true;
	}
	function idCheck(str) {
		var url = "idCheck.do?mid="+str;
		if(str == "") {
			alert("아이디를 입력하세요. ") 
			frm.mId.focus();
		}else{
			window.open(url, "아이디중복체크", "width=400, height=400, top=100, left=100");
		}
		
	}
	
</script>
<jsp:include page="../common/menu.jsp" />
</head>

<body>
	<div align="center">
		<h1>회원가입</h1>
		<div>
			<form id="frm" name="frm" onsubmit="return formCheck()" action="memberJoin.do" method="post">
				<div>
					<br />
					<table border="1">
						<tr>
							<th width="100">아 이 디</th>
							<td width="350">
							<input type="text" id="mId" name="mId" size="30" required="required"> &nbsp;&nbsp;&nbsp;
							<button type="button" onclick="idCheck(mId.value)">중복체크</button></td>
						</tr>
						<tr>
							<th width="100">Password</th>
							<td width="300"><input type="password" id="mPassword" name="mPassword" size="30"></td>
						</tr>
						<tr>
							<th width="120">Password 확인</th>
							<td width="300"><input type="password" id="mPassword1" name="mPassword1" size="30"></td>
						</tr>
						<tr>
							<th width="100">이 름</th>
							<td width="300"><input type="text" id="mName" name="mName"size="30" required="required"></td>
						</tr>
					</table>
				</div><br />
				<div>
				 <input type="submit" value="회원가입"> &nbsp;&nbsp;&nbsp; 
						<input type="reset" value="취소">
				</div>
			</form>
		</div>
	</div>
</body>
</html>