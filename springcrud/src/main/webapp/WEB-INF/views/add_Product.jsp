<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="./base.jsp" %>
</head>
<body>
<div class="container py-5">
<form action="handle_product" method="post">
  <div class="form-group">
    <label for="exampleInputEmail1">Name</label>
    <input type="text" class="form-control" name="name" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Enter Name">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword1">Description</label>
    <input type="text" class="form-control" name="descroption" id="exampleInputPassword1" placeholder="Enter description">
  </div>
  <div class="form-group">
    <label for="exampleInputPassword2">Price</label>
    <input type="text" class="form-control" id="exampleInputPassword2" name="price" placeholder="Enter price">
  </div>
  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>

</body>
</html>