package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.ResultSetExtractor;

public class StudentDao {
	
	private JdbcTemplate jdbc;
	private Boolean flag=false;

	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public boolean save(final Student s) {
		
		
		String sql="insert into student values(?, ?, ?, ?, ?, ?, ?)";
		return jdbc.execute(sql, new PreparedStatementCallback<Boolean>()
				{

					public Boolean doInPreparedStatement(PreparedStatement ps)
							throws SQLException, DataAccessException {
						ps.setInt(1, s.getId());
						ps.setString(2, s.getName());
						ps.setString(3, s.getUsername());
						ps.setString(4, s.getPassword());
						ps.setString(5, s.getEmail());
						ps.setString(6, s.getMobile());
						ps.setString(7, s.getAddress());
						return ps.execute();
					}
			
				});
	}

	public Boolean login(final Student st) {
		String sql="select * from student where username=? and password=?";
		return jdbc.execute(sql, new PreparedStatementCallback<Boolean>() {

			public Boolean doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				
				ps.setString(1, st.getUsername());
				ps.setString(2, st.getPassword());
				ResultSet rs=ps.executeQuery();
				
				
				return rs.next();
				
			}
			
		});
		

	}
	
	public List display()
	{
		String sql="select * from student";
		
		final List list=new ArrayList();
		
		jdbc.query(sql,new ResultSetExtractor<Student>() {		
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				while(rs.next())
				{
					Student st=new Student();
					st.setId(rs.getInt(1));
					st.setName(rs.getString(2));
					st.setUsername(rs.getString(3));
					st.setPassword(rs.getString(4));
					st.setEmail(rs.getString(5));
					st.setMobile(rs.getString(6));
					st.setAddress(rs.getString(7));
					list.add(st);
				}
				return null;
				
				
				
			}
			
		});
		return list;
		
	}

	//This will return the list of students by id
	public List findbyID(int id) {
		// TODO Auto-generated method stub
		String sql="select * from student where id='"+id+"'";
		
		final List list=new ArrayList();
		jdbc.query(sql,new ResultSetExtractor<Student>() {		
			public Student extractData(ResultSet rs) throws SQLException, DataAccessException {
				
				while(rs.next())
				{
					Student st=new Student();
					st.setId(rs.getInt(1));
					st.setName(rs.getString(2));
					st.setUsername(rs.getString(3));
					st.setPassword(rs.getString(4));
					st.setEmail(rs.getString(5));
					st.setMobile(rs.getString(6));
					st.setAddress(rs.getString(7));
					list.add(st);
				}
				return null;
				
				
				
			}
			
		});
		return list;
	}
	
	

}
