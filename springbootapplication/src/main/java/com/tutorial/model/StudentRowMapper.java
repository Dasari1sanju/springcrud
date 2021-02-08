package com.tutorial.model;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Student student = new Student();
		student.setStudentId(rs.getInt("student_id"));
		student.setFirstName(rs.getString("fisrst_name"));
		student.setFirstName(rs.getString("last_name"));
		student.setFirstName(rs.getString("email"));
		student.setFirstName(rs.getString("phone"));
		student.setFirstName(rs.getString("address"));
		return student;
	}
	
	
}
