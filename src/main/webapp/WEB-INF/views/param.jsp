<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebSpringMvc</title>
</head>
<body>
	<div style="color: green;">
		<a href="/param">参数系列（页面-->ACT）</a>--<a href="/index">主页</a>
	</div>
	<hr>
	<div style="color: green; font-size: 20px;">${message}</div>
	<div>
		<a href="/param">index</a>
	</div>
	<div>
		<a href="/param/int?i=123">/param/int?i=123</a>
	</div>
	<div>
		<a href="/param/str?str=string1">/param/str?str=string(单str)</a>
	</div>
	<div>
		<a href="/param/str?str=string1&str=string2">/param/str?str=string(多str)</a>
	</div>
	<div>
		<a href="/param/map?mapkey=mapvalue">/param/map?mapkey=mapvalue</a>
	</div>
	<div>
		<a href="/param/bean?i=1&s=s&m[a]=a">/param/bean?i=1&s=str&m[a]=a</a>
	</div>
	<div>
		<a href="/param/rest/123">/param/rest/123</a>
	</div>
	
	<div>
		<a href="/param/entity?entity[loginName]=a">/param/entity?entity[loginName]=a</a>
	</div>

</body>
</html>