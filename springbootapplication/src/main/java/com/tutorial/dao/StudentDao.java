package com.tutorial.dao;

import java.util.List;

import com.tutorial.model.Student;

import com.tutorial.model.Student;

public interface StudentDao {
	
	public List<Student> getAllStudents();
	public Student findStudentById(int id);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	
}
