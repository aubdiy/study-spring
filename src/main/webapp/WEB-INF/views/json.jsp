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
		<a href="/json">json系列</a>--<a href="/index">主页</a>
	</div>
	<hr>
	<div style="color: green; font-size: 20px;">${message}</div>
	<div>
		<a href="/json">/json</a>
	</div>
	<table>
		<tr>
			<td>i</td>
			<td><input id="i" value="100" /></td>
		</tr>
		<tr>
			<td>s</td>
			<td><input id="s" value="snowolf" /></td>
		</tr>
		<tr>
			<td>--</td>
			<td><input type="button" id="ajax" value="show" /></td>
		</tr>
	</table>

</body>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		$("#ajax").click(function() {
			show();
		});
	});

	function show() {
		var mydata = '{"i":"' + $('#i').val() + '","s":"' + $('#s').val()
				+ '"}';
		alert(mydata);
		$.ajax({
			type : 'POST',
			contentType : 'application/json',
			url : '/json/ajax',
			processData : false,
			dataType : 'json',
			data : mydata,
			success : function(data) {
				alert("i: " + data.i + "\ns: " + data.s);
			},
			error : function() {
				alert('Err...');
			}
		});
	}
</script>
</html>


