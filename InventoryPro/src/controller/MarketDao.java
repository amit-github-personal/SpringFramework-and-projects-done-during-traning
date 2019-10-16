package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MarketDao {
	
	private static Connection Con=null;
	private ResultSet rs;
	
	public static Connection Create()
	{
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		
		if(Con==null)
		{
			try 
			{
				Class.forName(driver);
				Con=DriverManager.getConnection(url, "system", "Techmn.1627620");
				
				
			}
			catch(SQLException | ClassNotFoundException e)
			{
				e.printStackTrace();
			}
			
		}
		
		
		return Con;
	}
	
	public static boolean insert(Bean x)
	{
		boolean b=false;
		
		try 
		{
			Con=Create();
			
			PreparedStatement ps=Con.prepareStatement("insert into Master values(?, ?, ?, ?, ?, ?)");
			ps.setLong(1, x.getItem_c());
			ps.setString(2, x.getItem_n());
			ps.setLong(3, x.getQuantity());
			ps.setLong(4,x.getRate());
			ps.setLong(5, x.getAmount());
			ps.setString(6, x.getDate_o_p());
			
			int i=ps.executeUpdate();
			
			if(i==1)
			{
				b=true;
			}
			else
			{
				b=false;
			}
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return b;
	}

}
