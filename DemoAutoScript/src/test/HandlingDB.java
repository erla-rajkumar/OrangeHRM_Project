package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class HandlingDB {

	@Test
	public void testDB() throws ClassNotFoundException, SQLException
	{
		//mysql-connector jar file/dependency should be added
		
		Class.forName("com.mysql.jdbc.Driver");
		//to connect with mysql
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","tiger");
		Statement statement = con.createStatement();
		ResultSet res = statement.executeQuery("select * from selenium_users where first_name='sagar';");
		
		while(res.next())
		{
//			getString(colname as arguments);
			String fs = res.getString("first_name");
			String ls = res.getString("last_name");
			System.out.println(fs+" "+ls);
		}
		
		
		
		
	}
}
