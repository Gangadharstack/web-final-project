package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Credential;

public class CredentialDAO {
	
   Connection conn;
   
   public CredentialDAO()throws Exception
   {
	   
	   conn=utility.DBconn.getMySQLConnection();
  
   }
   
   public void insertCredential(Credential Credential)throws Exception
   {
	   PreparedStatement psmt=conn.prepareStatement("insert into webpage values (?,?,?,?,?,?,?)");
	   psmt.setString(1,Credential.getFirstName());
	   psmt.setString(2,Credential.getLastName());
	   psmt.setString(3,Credential.getUserName());
	   psmt.setString(4,Credential.getEmail());
	   psmt.setString(5,Credential.getMobileNo());
	   psmt.setString(6,Credential.getAge());
	   psmt.setString(7,Credential.getPassWord());
	   
	   int row_eff=psmt.executeUpdate();
   }
}  

