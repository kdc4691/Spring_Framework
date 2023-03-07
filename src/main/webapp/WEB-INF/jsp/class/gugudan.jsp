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
구구단 :
<c:forEach var="i" begin="1" end="9" step="1">
 ${id}*${i}=${id*i}
</c:forEach>
</body>
</html>