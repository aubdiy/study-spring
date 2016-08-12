<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebSpringMvc</title>
</head>
<body>
	<div style="color: green;">
		<a href="/view">视图系列（ACT--页面）</a>--<a href="/index">主页</a>
	</div>
	<hr>
	<div style="color: green; font-size: 20px;">${message}</div>
	<c:if test="${list.size() > 0}">
		<div style="color: green; font-size: 20px;">
			list 集合个数： ${list.size()}<br/>
			<c:forEach items="${list}" var="data" >
				${data}<br> 
			</c:forEach>
		</div>
	</c:if>
	
	<c:if test="${map.size() > 0}">
		<div style="color: green; font-size: 20px;">
			map 集合个数： ${map.size()}<br/>
			<c:forEach items="${map}" var="data" >
				${data.key}:${data.value}<br> 
			</c:forEach>
		</div>
	</c:if>
	
	<c:if test="${listbean.size() > 0}">
		<div style="color: green; font-size: 20px;">
			listbean 集合个数： ${listbean.size()}<br/>
			<c:forEach items="${listbean}" var="data" >
				${data.i}:${data.s}<br> 
			</c:forEach>
		</div>
	</c:if>
	
	
	<div>
		<a href="/view">/view</a>
	</div>
	<div>
		<a href="/view/list">/view/list</a>
	</div>
	<div>
		<a href="/view/map">/view/map</a>
	</div>
	<div>
		<a href="/view/listbean">/view/listbean</a>
	</div>

</body>
</html>
