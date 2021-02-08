package com.tutorial.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.tutorial.model.Student;
import com.tutorial.model.StudentRowMapper;

@Transactional
@Repository
public class StudentDaoImpl  implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Student> getAllStudents() {
		String query ="select * from student";
		RowMapper<Student> rowMapper = new StudentRowMapper();
		List<Student> list = jdbcTemplate.query(query, rowMapper);
		
		return list;
	}

	@Override
	public Student findStudentById(int id) {
		String query ="select * from student where studentId=?";
		RowMapper<Student> rowMapper = new BeanPropertyRowMapper<Student>(Student.class);
		Student student = jdbcTemplate.queryForObject(query, rowMapper, id);
		
		return null;
	}

	@Override
	public void addStudent(Student student) {
		String query ="insert into student(student_id, first_name, last_name, email, phone, address) values(?,?,?,?,?,?)";
		jdbcTemplate.update(query, student.getStudentId(), student.getFirstName(), student.getLastName(), student.getEmail(), student.getPhone(), student.getAddress());	
	}

	@Override
	public void updateStudent(Student student) {
		String query ="update student set first_name=?, last_name=?, email=?, phone=?, address=? where student_id=?";
		jdbcTemplate.update(query, student.getFirstName(), student.getLastName(), student.getEmail(), student.getPhone(), student.getAddress(), student.getStudentId());
		
	}

	@Override
	public void deleteStudent(int id) {
		String query = "delete from student where student_id=?";
		jdbcTemplate.update(query, id);
		
	}

}
