package mail.UserManager;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;

import com.springmvc.user.UserInfo;

public class UserOperations extends UserManagerAdapater {
	
	private JdbcTemplate jdbc;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	@Override
	public int add(UserInfo u)
	{
		String sql="insert into mailuser values('"+u.getUsername()+""+u.getPassword()+""+u.getEmail()+"')";
		return jdbc.update(sql);
	}
	
	//for veryfying login
	@Override
	public boolean check(final String user, final String pass)
	{
		String sql="select * from mailuser where username=? and password=?";
		
		return jdbc.execute(sql, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setString(1, user);
				ps.setString(2, pass);
				ResultSet rs=ps.executeQuery();
				
				
				return rs.next();
				
			}
			
		});
		
	}
	
	
}
