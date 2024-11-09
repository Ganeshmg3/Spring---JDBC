package com.abc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.*;

public class EmployeeDao {
	private JdbcTemplate jdbc;

	public void setJdbcTemplate(JdbcTemplate jdbc) {
		this.jdbc = jdbc;
	}

	public int SaveEmployee(Employee employee) {
		String sql="insert into employee value('"+employee.getId()+"','"+employee.getName()+"','"+employee.getSalary()+"')";
		return jdbc.update(sql);
	}
	
	public int UpdateEmployee(Employee e) {
		String sql="update employee set name='"+e.getName()+"'where id='"+e.getId()+"'";	
		return jdbc.update(sql);
		
	}
	
	

}
