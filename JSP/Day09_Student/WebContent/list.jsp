<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="header.jsp" %>

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
<c:forEach var="dto" items="${dao.selectList()}" >
		<tr>
			<td>${dto.name}</a></td>
			<td>${dto.kor }</td>
			<td>${dto.eng }</td>
			<td>${dto.math }</td>
			<td>${dto.total }</td>
			<td>${dto.avg }</td>
		</tr>
</c:forEach>			
	</tbody>
</table>



</body>
</html>