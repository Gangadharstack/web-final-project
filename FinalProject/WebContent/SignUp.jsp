<%@ include file="CommonHeader.jsp" %> 
<!DOCTYPE html>
<html>
<style>
body {
  background-color: hsla(89, 43%, 51%, 0.3);
}
</style>
<head>
<meta charset="ISO-8859-1">
<title>SignUp</title>
<link rel="stylesheet"href="background.css">
</head>
<body>


<center><img src="https://image.freepik.com/free-vector/big-data-flat-background_23-2148003377.jpg" height="200px" width="450px">
</center>
	
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
     <td>Age: </td>
    
    <td><input type="Age" id="Age" name="Age"></td>
    
   
 </tr>
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