<%@ page language="java"  contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%
	String contextPath = request.getContextPath();
 %>
<html>
<body>
<form action="<%= contextPath %>/test/login" method="post">
<input type="text" name="username" placeholder="username"/><br>
<input type="password" name="password" placeholder="password"/><br>
<input type="submit">
</form>
</body>
</html>
