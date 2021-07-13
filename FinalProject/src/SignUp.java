

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.CredentialDAO;


@WebServlet("/SignUp")
public class SignUp extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		 String firstname=request.getParameter("FirstName");
		 String lastname=request.getParameter("LastName");
		 String userName=request.getParameter("UserName");
		 String email=request.getParameter("Email");
		 String mobileNo=request.getParameter("MobileNo");
		 String age=request.getParameter("Age");
		 String passWord=request.getParameter("PassWord");
		 
		 model.Credential obj=new model.Credential();
		 
		 obj.setFirstName(firstname);
		 obj.setLastName(lastname);
		 obj.setUserName(userName);
		 obj.setEmail(email);
		 obj.setMobileNo(mobileNo);
		 obj.setAge(age);
		 obj.setPassWord(passWord);
	try
	{
		
		CredentialDAO objDAO=new CredentialDAO();
		objDAO.insertCredential(obj);
	}
	catch(Exception e)
	{
	out.println("Exception Arised:"+e);
	}
  }
}	
