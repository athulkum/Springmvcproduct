<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Product Details</h1>

<form:form action="save" modelAttribute="products" method="post">
  <table>
            <!-- Name Field -->
            <tr>
                <td >Name</td>
                <td><form:input path="name" /></td>
            </tr>
            
            <!-- Price Field -->
            <tr>
                <td >Price</td>
                <td><form:input path="Price" /></td>
            </tr>
            
            <!-- quantity Field -->
            <tr>
                <td >Quantity</td>
                <td><form:input path="qty"/></td>
            </tr>
            
            <!-- Submit Button -->
            <tr>
               <td>
                    <form:button type="submit">Submit</form:button>
                </td>
            </tr>
  </table>
</form:form>
<p><font color="green">${msg }</font> </p>

<a href="products">View Products</a>

</body>
</html>