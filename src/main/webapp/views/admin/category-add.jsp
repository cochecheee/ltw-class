<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/commons/taglib.jsp"%>


<!-- jsp below -->
<a href="${pageContext.request.contextPath}/admin/category/add"></a>
<form action="${pageContext.request.contextPath}/admin/category/insert" method="post">
	<label for="fname">Category name:</label><br> 
	<input type="text" id="fname" name="categoryname"><br> 
	<label for="lname">Link images:</label><br> 
	<input type="text" id="lname" name="images"><br> 
	
	 <input type="radio" id="ston" name="status" value="1">
	 <label for="css">On</label><br>
	 <input type="radio" id="stoff" name="status" value="0">
	 <label for="javascript">Off</label><br> 
	  
	  <input type="submit" value="Insert">
</form>