<%@ include file="CommonHeader.jsp" %> 

<body>	
<link rel="stylesheet"href="background.css">
<center>
<img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRhMBoEZBD0TqFd4PPh-3Fjj_jF1S4rA9zxrA&usqp=CAU"height="110px" width="150px">
	
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