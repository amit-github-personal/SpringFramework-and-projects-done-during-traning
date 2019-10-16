package com.springjdbc.SpringResultSetExtractor;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class Extractor implements ResultSetExtractor<List<Employey>> {

	public List<Employey> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Employey> ls=new ArrayList<Employey>();
		
		while(rs.next())
		{
			Employey em=new Employey();
			em.setEm_id(rs.getInt(1));
			em.setEm_name(rs.getString("Name"));
			em.setDept(rs.getString("Designation"));
			em.setDesig(rs.getString("Department"));
			em.setAge(rs.getInt("Age"));
			
			ls.add(em);
		}
		
		return ls;
		
	}

}
