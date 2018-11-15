<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
 <h1>Employee Information</h1>
<form:form action="addemp1">
<table>
   <tr>
      <td>Employee Id</td>
      <td><form:input path="eId"/></td>
   </tr>
   
   <tr>
      <td>Employee Name</td>
      <td><form:input path="name"/></td>
   </tr>
   
   <tr>
      <td>Employee Dept</td>
      <td><form:input path="dept"/></td>
   </tr>
   
   <tr>
      <td><input type="submit" value="Submit"></td>
      <td><input type="reset"/></td>
   </tr>
</table>
</form:form>
</center>

</body>
</html>