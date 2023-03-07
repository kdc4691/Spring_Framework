<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<script type="text/javascript">
	function fn_login(){
		if(${loginID[0].id} == "" or ${loginID[0].id == null}){
			alert("존재하지 않는 아이디 입니다.")
		}
		else if(${loginID[0].pw} != document.LoginForm.inputPassword.value){
			alert("비밀번호가 일치하지 않습니다.")
		}	
		else{
			alert("로그인 성공")
			document.LoginForm.action = "/main";
			document.LoginForm.submit();
		}
	}
</script>
<title>Login</title>
</head>
<body>
	<jsp:include page="menu.jsp" />	
	<div class="jumbotron">
		<div class="container">
         <h1 class="display-3">로그인</h1> 
		</div>
	</div>
	<div class="container" align="center">
		<div class="col-md-4 col-md-offset-4">
			<h3 class="form-signin-heading">Please sign in</h3>
			<form name="LoginForm" class="form-signin" action="/login.do" method="post">
				<div class="form-group">
					<label for="inputUserName" class="sr-only">User Name</label> 
					<input type="text" class="form-control" placeholder="ID" name="inputUserName" required autofocus>
				</div>
				<div class="form-group">
					<label for="inputPassword" class="sr-only">Password</label> 
					<input type="password" class="form-control" placeholder="Password" name="inputPassword" required>						
				</div> 
				<input type="submit" class="btn btn btn-lg btn-success btn-block " value="로그인 " onclick="javascript:fn_login()" >
			</form>		
		</div>
	</div>
</body>
</html>