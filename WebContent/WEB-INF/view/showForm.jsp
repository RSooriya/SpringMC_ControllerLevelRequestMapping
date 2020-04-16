<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Hello Form</h2>
<form action="/ControllerLevelRequestMapping/hello/processForm">
<table>
<tr>
<td>Name</td>
<td><input type="text" name="studentName"></td>
</tr>
<tr>
<td><input type="submit" value="Submit"></td>
</tr>
</table>
</form>
</body>
</html>