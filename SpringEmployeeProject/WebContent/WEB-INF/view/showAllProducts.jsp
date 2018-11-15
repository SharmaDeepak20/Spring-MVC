<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<center>
  <h1>Product Info</h1>
  <table>
      <tr>
         <td>PId</td>
         <td>${product.pId}</td>
      </tr>
      
      <tr>
         <td>Name</td>
         <td>${product.pname}</td>
      </tr>
      
      <tr>
         <td>Price</td>
         <td>${product.price}</td>
      </tr>
  </table>
</center>
</body>
</html>