<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
</head>
<body>
	<div style="width:80%;margin:0 auto;">
		<div>
			<a href="/board/add"><button>글쓰기</button></a>		
		</div>
		<table class="table table-hover" style="table-layout:fixed" >
	     <thead>
	       <tr>
				<th style="width: 50px;">번호</th> 
				<th>제목</th>
				<th>내용</th>
				<th>날짜</th>
				<th>삭제</th>
			</tr>
	      </thead>
	      <tbody>
			<c:forEach var="board" items="${boardList}" varStatus="status">	
			<tr>
				<td ><c:out value="${ status.count }" /></td>
				<td style="text-overflow:ellipsis; overflow:hidden"><nobr><c:out value="${ board.bTitle }"/></nobr></td>
				<td><c:out value="${ board.bContent }" /></td>
				<td><c:out value="${ board.bDate }" /></td>
				<td><a href="/board/delete/${board.bSeq}"><input type="button" value="삭제"></a></td>
			</tr>
			</c:forEach>
		</tbody>
		</table>
	</div>
</body>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

</html>