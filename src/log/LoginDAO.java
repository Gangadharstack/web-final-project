package log;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.Credential;

public class LoginDAO {

    public boolean validate(Credential loginBean) throws ClassNotFoundException {
        boolean status = false;
        		Class.forName("com.mysql.cj.jdbc.Driver");
        	try	(Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","kirankumar143");
        	   PreparedStatement preparedStatement = conn.prepareStatement("select * from signup where UserName = ? and PassWord = ? "))
        	{
        			            preparedStatement.setString(1, loginBean.getUserName());
        			            preparedStatement.setString(2, loginBean.getPassWord());
        			            
    		                    System.out.println(preparedStatement);
                                ResultSet rs = preparedStatement.executeQuery();
                                 status = rs.next();

             } catch (SQLException e) {
         
               printSQLException(e);
             }
        return status;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }
}

