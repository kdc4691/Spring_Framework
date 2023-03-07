<%@ page contentType="text/html; charset=utf-8"%>
<html>
<head>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 등록</title>
<script type="text/javascript">
	function fn_deleteProduct() {
		document.deleteProduct.action = "/deleteProduct.do";
		document.deleteProduct.submit();
	}
</script>
</head>
<body>
	<jsp:include page="menu.jsp" />	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 삭제</h1>
		</div>
	</div>
	<div class="container">
		<form name="deleteProduct" class="form-horizontal" method="post" enctype="multipart/form-data">
			<div class="form-group row">
				<label class="col-sm-2">상품 코드</label>
				<div class="col-sm-3">
					<input type="text" name="pcode" class="form-control" >
				</div>
			</div>
			<div class="form-group row">
				<div class="col-sm-offset-2 col-sm-10 ">
					<input type="submit" class="btn btn-primary" value="삭제" onclick="javascript:fn_deleteProduct()">
				</div>
			</div>
		</form>
	</div>
</body>
</html>
