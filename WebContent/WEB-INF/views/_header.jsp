<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
     <meta charset="UTF-8">
     <title>Home Page</title>
     <!--link href="main.css" rel="stylesheet"-->
     <style type="text/css">
    	<%@include file="../css/main.css" %>
	</style>
  </head>
  <body>
  
  <header>
  <div style="float: left">
     <h1>My Site</h1>
  </div>
 
  <div class="user_info">
 
     <!-- User store in session with attribute: loginedUser -->
     Hello <b>${loginedUser.userName}</b>
   <br/>
     Search <input name="search">
 
  </div>
 
</header>