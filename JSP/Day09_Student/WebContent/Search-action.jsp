<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<jsp:useBean id="dto" class="student.StudentDTO"/>
<jsp:setProperty property="*" name="dto"/>

<c:set var="dao" value="${StudentDAO.getInstance()}"/>

<c:set var="item" value="${dao.search(dto)}"/>

<table>
	<thead>
		<tr>
			<th>이름</th>
			<th>국어</th>
			<th>영어</th>
			<th>수학</th>
			<th>합계</th>
			<th>평균</th>
		</tr>
	</thead>
	<tbody>

		<tr>
			<td>${item.name}</td>
			<td>${item.kor }</td>
			<td>${item.eng }</td>
			<td>${item.math }</td>
			<td>${item.total }</td>
			<td>${item.avg }</td>
		</tr>
			
	</tbody>
</table>




</body>
</html>