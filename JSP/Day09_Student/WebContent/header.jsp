<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="student.*"  %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <% request.setCharacterEncoding("UTF-8"); %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
    header{
        width: 1400px;
        box-sizing: border-box;
        margin: auto;
        background-color: #D7BBF5;
        height: 300px;
        border-radius: 20px;
        box-shadow: 15px 15px 15px #EDE4FF;
}
ul{
    list-style: none;
    display: flex;
    justify-content: space-between;
}
ul>li{
    padding: 0;
    margin: 0;
    padding: 20px 50px;
    margin: 0 50px;
    border-radius: 30px;
    border: 3px solid #EDE4FF;
    font-size: 1.4em;
    background-color: whitesmoke;
    color: #A076F9;
    font-weight: bold;
}
#title{
    padding: 0;
    margin: 0;
    margin: 50px auto;
    width: 400px;
    height: fit-content;
    text-align: center;
    padding: 30px 0 10px 0;
    color: #35155D;
    border-bottom: 3px solid #35155D;
}
table{
	width : 700px;
	height : 300px;
	margin: auto;
	margin-top : 50px;
	border-collapse: collapse;
}
th,td{
	text-align: center;
	font-size : 1.5em;
}
th{
	background-color: #6554AF;
	color : white;
	border-radius: 20px 20px 0 0;
}
td{
	background-color : #EDE4FF;
	color: #6F61C0;
	
	font-weight: bold;
}
a{
	text-decoration: none;
	color: inherit;
}
</style>
<c:set var="cpath" value="${pageContext.request.contextPath }" />
<body>
<header>
    <div id="title">
        <h1><a href="${cpath}/header.jsp">학생관리 프로그램</a></h1>
    </div>
    <div id="nav">
        <ul>
            <li><a href="${cpath}/list.jsp">리스트</a></li>
            <li><a href="${cpath}/add.jsp">학생추가</a></li>
            <li><a href="${cpath}/search.jsp">검색</a></li>
            <li><a href="${cpath}/delete.jsp">삭제</a></li>
        </ul>
    </div>
    
    <c:set var="dao" value="${StudentDAO.getInstance()}" />
</header>
