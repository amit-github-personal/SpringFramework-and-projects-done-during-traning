package com.springjdbc.SpringJDBC;

import org.springframework.jdbc.core.JdbcTemplate;
public class BookDao {
	
	private JdbcTemplate jdbc;
	


	public void setJdbc(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}
	
	public int save(Student b)
	{
		String str="insert into books values('"+b.getBookid()+"','"+b.getBname()+"','"+b.getSubject()+"','"+b.getWriter()+"')";
		int i=jdbc.update(str);
		
		return i;
	}

}
