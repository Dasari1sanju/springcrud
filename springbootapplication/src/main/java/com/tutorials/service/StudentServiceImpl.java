package com.tutorials.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.dao.StudentDaoImpl;
import com.tutorial.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDaoImpl studentDao;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentDao.getAllStudents();
	}

	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDao.findStudentById(id);
	}

	@Override
	public void addStudent(Student student) {
		studentDao.addStudent(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
		
	}

	@Override
	public void deleteStudent(int id) {
		studentDao.deleteStudent(id);
		
	}
}
