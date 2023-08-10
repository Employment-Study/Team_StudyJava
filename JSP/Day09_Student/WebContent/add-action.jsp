<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@include file="header.jsp" %>

<jsp:useBean class="student.StudentDTO"  id="dto"/>
<jsp:setProperty property="*" name="dto"/>
<c:set var="dao" value="${StudentDAO.getInstance()}" />

${dao.insert(dto)}

<c:redirect url="list.jsp" />
</body>
</html>