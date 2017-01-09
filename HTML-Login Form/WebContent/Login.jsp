<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page-mvc</title>
</head>
<body>
<form action="LoginCheck" method = "post">
<table align="center" cellspacing="2">
<tr>
<td colspan="2"><center>Login Dialog</center></td>
</tr>
<tr>
<td>username</td><td><input type ="text" name="uname"/></td>
</tr>
<tr>
<td>password</td><td><input type ="text" name="passwd"/></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="SUBMIT"/></td>
</tr>

</table>
</form>
</body>
</html>