package utility;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBconn 
{
	public static Connection getMySQLConnection()throws Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","manam4527");
		return conn;
		
	}

}
