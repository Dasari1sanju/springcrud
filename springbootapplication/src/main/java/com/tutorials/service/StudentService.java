package com.tutorials.service;

import java.util.List;

import com.tutorial.model.Student;

public interface StudentService {
	
	public List<Student> getAllStudents();
	public Student findStudentById(int id);
	public void addStudent(Student student);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
}
