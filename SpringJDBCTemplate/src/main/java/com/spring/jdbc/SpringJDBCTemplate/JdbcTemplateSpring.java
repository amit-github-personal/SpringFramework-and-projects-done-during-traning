package com.spring.jdbc.SpringJDBCTemplate;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateSpring {
	
	private JdbcTemplate jdbc;
	private DataSource datasource;
	
	/*Now we're setting the jdbc template here instead of creating instance in Xml.*/
	public void setDatasource(DataSource datasource) {
		this.datasource = datasource;
		jdbc= new JdbcTemplate(datasource);
	}
	
	public int insert(Student student)
	{
		String SQL="insert into student values('"+student.getId()+" ',' "+student.getName()+" ','"+student.getAddress()+" ',' "+student.getCourse()+"')";
		int i=jdbc.update(SQL);
		
		return i;
	}
	
	public void create(int id, String name, String address, String course)
	{
		String sql="insert into student(id , name, address, course) values(?, ?,  ?, ?)";
		
		jdbc.update(sql, id, name, address, course);
		
		System.out.println("Record inserted");
	}
	
	public List<Student> displayAll()
	{
		String sql="Select * from student";
		
		List<Student> student=(List<Student>) jdbc.query(sql, new StudentMapper());
		
		return student;
	}
	
	public void  delete(int i)
	{
		String sql="delete from student where id=?";
		jdbc.update(sql, i);
		
		System.out.println("Deleted Student with id : "+i);
		
		return;
	}
	
	public void updateName(int id ,String name)
	{
		String sql="update student set name= ? where id=?";
		jdbc.update(sql, name, id);
		System.out.println("Updated Name of of student ID : "+id);
	}

}
