import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Credential;
import log.LoginDAO;

@WebServlet("/Login")
public class LogIn extends HttpServlet {
    private static final long serialVersionUID = 1;
    private LoginDAO loginDao;

    public void init() {
        loginDao = new LoginDAO();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {

        String UserName = request.getParameter("UserName");
        String PassWord = request.getParameter("PassWord");
        Credential loginBean = new Credential();
        loginBean.setUserName(UserName);
        loginBean.setPassWord(PassWord);
        

        try {
            if (loginDao.validate(loginBean)) {
                //HttpSession session = request.getSession();
                // session.setAttribute("UserName",UserName);
            	System.out.println("Welcome:"+UserName);
                response.sendRedirect("Success.jsp");
                
            } else {
                HttpSession session = request.getSession();
                //session.setAttribute("user", UserName);
                //response.sendRedirect("LoginPage.jsp");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}