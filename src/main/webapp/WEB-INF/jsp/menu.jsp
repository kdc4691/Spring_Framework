<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="ko" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script  src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javaScript" language="javascript" defer="defer">


</script>
</head>
<body>
<form id="menu" name="menu"  method="post">
<nav class="navbar navbar-expand  navbar-dark bg-dark">
	<div class="container">
		<div class="navbar-header">
			<a class="navbar-brand" href="./main">Home</a>
		</div>
		
		<div class="navbar-header">
		<c:choose>
           <c:when test="1=1">
             <a class="navbar-brand" href="#">환영합니다.</a>
           </c:when>
           <c:otherwise>
             <a class="navbar-brand" href="/loginMember">로그인</a>
           </c:otherwise>
         </c:choose>		    			
			<a class="navbar-brand" href="/addMember.do">회원가입</a>
			<a class="navbar-brand" href="/products.do">상품목록</a>
			<a class="navbar-brand" href="/addProduct.do">상품등록</a>
			<a class="navbar-brand" href="/showupdateProduct.do">상품수정</a>
			<a class="navbar-brand" href="/deleteProduct.do">상품삭제</a>
		</div>
	</div>
</nav>
</form>
</body>
</html>