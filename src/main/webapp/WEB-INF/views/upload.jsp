<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>WebSpringMvc</title>
</head>
<body>
	<div style="color: green;">
		<a href="/upload">文件上传</a>--<a href="/index">主页</a>
	</div>
	<hr>
	<div style="color: green; font-size: 20px;">${message}</div>
	
	<form action="/upload/single" enctype="multipart/form-data" method="post" style="border: 3px solid blue;float: left;">
		<input type="text" name="a"/><br/>
		<input type="file" name="file" /><br />
		<input type="submit" value="单文件上传" />
	</form>
	
	<form action="/upload/multi" enctype="multipart/form-data" method="post" style="border: 3px solid blue;float: left;">
		<input type="file" name="file1" /><br />
		<input type="file" name="file2" /><br />
		<input type="submit" value="多文件上传" />
	</form>
	<form action="/upload/s-multi" enctype="multipart/form-data" method="post" style="border: 3px solid blue;float: left;">
		<input type="file" name="file1" /><br />
		<input type="file" name="file2" /><br />
		<input type="submit" value="多文件上传" />
	</form>

</body>
</html>
