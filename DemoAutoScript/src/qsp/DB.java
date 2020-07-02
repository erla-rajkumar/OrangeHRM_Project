package qsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class DB {

	@Test
	public void data() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sagar","root","tiger");
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("select * from selenium_user");
		while (res.next())
		{
		System.out.println(res.getString("first_name"));
		System.out.println(res.getString("last_name"));
		}
	}
	
	
	
	
}
