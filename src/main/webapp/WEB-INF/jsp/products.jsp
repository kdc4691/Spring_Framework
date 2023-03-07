<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 목록</title>
<script type="text/javaScript" language="javascript" defer="defer">
	function fn_select(id) {
		document.showDetail.action = "/productDetail.do?no="+id;
		document.showDetail.submit();
	}
</script>
</head>
<body>
  <jsp:include page="menu.jsp" />	
  <form id="showDetail" name="showDetail" method="post">	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>

	<div class="container">
		<div class="row" align="center">
		
					<c:forEach var="result" items="${products}" varStatus="status">
            		<div class="col-md-4">
			              	<h3><c:out value="${result.pname}"/></h3>
			             	<p><c:out value="${result.detail}"/>
			            	<p><c:out value="${result.price}"/>원
			              	<p><a href="javascript:fn_select('${result.pcode}')" 
				           class = "btn btn-secondary" role="button">상세정보 &raquo;</a>
		        	</div>
        			</c:forEach>		
		</div>
		<hr>
	</div>
	<jsp:include page="footer.jsp" />
	</form>
</body>
</html>
