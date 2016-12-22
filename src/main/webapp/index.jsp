<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>ajax+servlet+jquery实例</title>
<script type="text/javascript" src="framework/jquery/jquery-3.1.1.min.js"></script>
</head>
<body>
 <!-- 省份 -->
 <select id="province">
 	<option>--请选择省份--</option>
 	<option>河南省</option>
 </select>
 <select id="city">
 	<option>--请选择城市--</option>
 </select>
</body>
<script type="text/javascript" src="product/servletjs/province.js"></script><!-- 这个script的引入必须放在上述body的后面，要不然jquery将不起作用 -->
</html>