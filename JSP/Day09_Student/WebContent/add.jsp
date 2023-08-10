<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>



<form method="POST" action="${cpath}/add-action.jsp">
	<input type="text" name="name" placeholder="이름">
	<input type="number" name="kor" placeholder="국어">
	<input type="number" name="eng" placeholder="영어">
	<input type="number" name="math" placeholder="수학">
	<input type="submit" value="제출">
</form>
</body>
</html>