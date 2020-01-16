<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="/board/add" method = "post" id="submitStr">
		<table>
			<tr>
				<td>제목 : </td>
				<td><input type="text" value="" name="bTitle"></td>
			</tr>
			<tr>
				<td>내용 : </td>
				<td><input type="text" value="" name="bContent"></td>
			</tr>
		</table>
		<input type="button" value="작성 완료" onclick="submitGo()">
		<a href="/board/list"><input type="button" value="취소"></a>
	</form>
</body>
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script>
function submitGo() {
	$("#submitStr").submit();
}
</script>

</html>