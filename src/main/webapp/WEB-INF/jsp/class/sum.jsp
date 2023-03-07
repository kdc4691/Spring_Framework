<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
1부터 ${id}까지의 합 :
 <c:set var="sum" value="0"/>
<c:forEach var="i" begin="1" end="${id}" step="1">
 <c:set var="sum" value="${sum + i }"/>
</c:forEach>
${sum }
</body>
</html>