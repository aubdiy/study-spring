<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebSpringMvc</title>
</head>
<body>
	<div style="color: green;">
		<a href="/inter">拦截器系列</a>--<a href="/index">主页</a>
	</div>
	<hr>
	<div style="color: green; font-size: 20px;">${message}</div>
	<div>
		<a href="/inter">index</a>
	</div>
	<div>
		<a href="/inter/false">/inter/false</a>
	</div>
	<div>
		<a href="/inter/true">/inter/true</a>
	</div>

</body>
</html>
