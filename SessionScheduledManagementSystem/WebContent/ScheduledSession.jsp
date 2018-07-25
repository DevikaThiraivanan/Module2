<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ScheduledSession</title>
</head>
<body>


<table>
<tr>
<th>SesionName</th>
<th>Duration(Days)</th>
<th>Faculty</th>
<th>Mode</th>
</tr>


<a:forEach items="${sess}" var="ses">
<tr>
<td>${ses.name}</td>
<td>${ses.duration}</td>
<td>${ses.faculty}</td>
<td>${ses.mode1}</td>
<td><a href="successpage" >Enroll Me</a> </td>
</tr>
</a:forEach>


</table>
</body>
</html>