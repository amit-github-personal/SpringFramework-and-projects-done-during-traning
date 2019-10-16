package com.client.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;


public class Database {
	
	private Connection Con=null;
	private ResultSet rs;
	
	public Connection Connect()
	{
		if(Con==null)
		{
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				Con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "Techmn.1627620");
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
				JOptionPane.showMessageDialog(null, "Excception Occured while connecting with database.");
			}
		}
		
		return Con;
	}
	
	public boolean searchUser(String name, String pass)
	{
		boolean flag=false;
		try {
			
			PreparedStatement ps=Con.prepareStatement("Select * from chat where Name=? and Password=?");
			ps.setString(1, name);
			ps.setString(2, pass);
			
			rs=ps.executeQuery();
			
			if(rs.next())
			{
				flag=true;
			}
			else
			{
				flag=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			flag=false;
		}
		
		return flag;
	}
}
