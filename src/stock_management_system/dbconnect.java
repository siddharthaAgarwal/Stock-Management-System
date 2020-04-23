package stock_management_system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class dbconnect {

	
	Connection con;
	
	public void connect() throws ClassNotFoundException
	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock_management_system", "root", "");
		} 
		
		catch (SQLException e) 
		{
			e.printStackTrace();
		}


	}
	
	public ResultSet fetch(String q)
	{

		try 
		{
			ResultSet rs;
			Statement stm = con.createStatement();
			rs= stm.executeQuery(q);		
			return rs;
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
		
		return null;
	}
	
	
	public void update(String q)
	{

		try 
		{
			Statement stm = con.createStatement();
			 stm.executeUpdate(q);		
		}
		catch(Exception e)
		{
			e.printStackTrace();		
		}
		
	}
	public void close()
	{
		try {
			con.close();
		}
		catch (Exception e)
		{
			
		}
	}
}
