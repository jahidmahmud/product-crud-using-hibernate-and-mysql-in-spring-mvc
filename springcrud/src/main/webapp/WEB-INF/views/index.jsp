<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>

<div class="container mt-4">
<div class="row">
<div class="col-md-12">
<h1 class="text-center">Welcome to Product App</h1>
<table class="table">
  <thead class="thead-light">
    <tr>
      <th scope="col">Id</th>
      <th scope="col">Name</th>
      <th scope="col">Description</th>
      <th scope="col">Price</th>
      <th scope="col">Action</th>
    </tr>
  </thead>
  <tbody>
  <c:forEach items="${products}" var="p">
    <tr>
      <th scope="row">Item-Pro${p.id}</th>
      <td>${p.name}</td>
      <td>${p.descroption}</td>
      <td>${p.price}</td>
      <td><a href="delete/${p.id}"><i class="far fa-trash-alt text-danger" style="font-size: 30px"></i></a>
      <a href="update/${p.id}"><i class="fas fa-pencil-alt"" style="font-size: 30px"></i></a>
      </td>
    </tr>
    </c:forEach>
  </tbody>
</table>
<div class="container text-center">
<a href="add" class="btn btn-outline-success">Add Product</a>
</div>
</div>
</div>
</div>

</body>
</html>