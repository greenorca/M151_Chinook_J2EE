<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<jsp:include page="_header.jsp"></jsp:include>
<jsp:include page="_menu.jsp"></jsp:include>

 
<h3>Album List</h3>
<p style="color: red;">${errorString}</p>
 <table border="1" cellpadding="5" cellspacing="1" >
    <tr>
       <th>Code</th>
       <th>Name</th>
       <th>Edit</th>
       <th>Delete</th>
    </tr>
    <c:forEach items="${albumList}" var="album" >
       <tr>
          <td>${album.idAlbum}</td>
          <td>${album.title}</td>
          <td>
             <a href="editProduct?code=${album.idAlbum}">Edit</a>
          </td>
          <td>
             <a href="deleteProduct?code=${album.idAlbum}">Delete</a>
          </td>
       </tr>
    </c:forEach>
 </table>
 
    <!-- a href="createProduct" >Create Product</a-->
     <jsp:include page="_footer.jsp"></jsp:include>
 
  </body>
</html>