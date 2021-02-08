package com.tutorial.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.tutorial.model.Student;
import com.tutorials.service.StudentServiceImpl;

@Controller
@RequestMapping("/student")
public class StudentController {
	@Autowired
	private StudentServiceImpl studentService;
	
	@RequestMapping(value={"/", "/list"}, method=RequestMethod.GET)
	public ModelAndView getAllStudents() {
		ModelAndView model = new ModelAndView();
		List<Student> list = studentService.getAllStudents();
		
		model.addObject("student_list", list);
		model.setViewName("student_list");
		return model;
	}
	@RequestMapping(value="/update/{id}", method=RequestMethod.GET)
	public ModelAndView editStudent(@PathVariable int id) {
		
		
	}
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public ModelAndView addStudent() {
		
	}
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ModelAndView saveOrUpdateStudent(@ModelAttribute("studentForm") Student student) {
		
	}
	@RequestMapping(value="/delete/{id}", method=RequestMethod.GET)
	public ModelAndView deletStudent(@PathVariable("id") int id) {
		
	}
}
