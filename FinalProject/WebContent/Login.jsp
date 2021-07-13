<%@ include file="CommonHeader.jsp" %> 

<body>	
<style>
body {
  background-color: hsla(89, 43%, 51%, 0.3);
}
</style>
<center>
	<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR_YbXp-LHXSxxOJ15x3xi9jq-xV2PFEDk0ag&usqp=CAU" height="200px" width="450px">
<form action="Login" method="post">
<div algin="Left">
<table>
<tr>
    <td>UserName: </td>
    
    <td><input type="UserName" id="UserName" name="UserName"></td>
     
 </tr>
 <tr>
    <td>PassWord: </td>
    
    <td><input type="PassWord" id="PassWord" name="PassWord"></td>
     
 </tr>
 
 <td>
   <input type="submit" value=" Login">
   </td> 
 </table>
    <tr>
    <td><p>New user. <a href="SignUp.jsp">SignUp Here</a>.
    </tr>


 </body>
</html>