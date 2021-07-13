<%@ include file="CommonHeader.jsp" %> 
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<link rel="stylesheet"href="background.css">
</head>
<body>
<link rel="stylesheet"href="background.css">
<center>
	
<form action="SignUp" method="post">
<div algin="Left">
<table>
<tr>
    <td>FirstName: </td>
    
    <td><input type="FirstName" id="FirstName" name="FirstName"></td>
     
 </tr>
 <tr>
    <td>LastName: </td>
    
    <td><input type="LastName" id="LastName" name="LastName"></td>
     
 </tr>
 <tr>
    <td>UserName: </td>
    
    <td><input type="UserName" id="UserName" name="UserName"></td>
     
 </tr>
 
  <br> 
   
  <tr>
       <td>Email : </td>
       
        <td><input type="Email" id="Email" name="Email"></td>
     
 </tr> 
 
 <br>
 
  <tr>
     <td>MobileNo : </td>
    
    <td><input type="MobileNo" id="MobileNo" name="MobileNo"></td>
    
   
 </tr>
 
 <br>
 <tr>
    <td>PassWord: </td>
    
    <td><input type="PassWord" id="PassWord" name="PassWord"></td>
 
 </tr>
 <center></center>
 <tr>
   <td>
   <input type="submit" value=" SignUp ">
   </td>
   </tr>
   </center>
   <center>
    <tr>
    <td><p>Already a Member <a href="Login.jsp">Login Here</a>.
    </tr>
</center>
 
 
  </tr> 
</table>
</form>
</body>
</html>