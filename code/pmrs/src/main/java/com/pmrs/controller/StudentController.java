package com.pmrs.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.iservice.IStudentService;
import com.pmrs.pojos.Student;
/**
 * 
 * @author Raman Chopra
 *
 */

@RestController
@RequestMapping("/pmrs/student")
public class StudentController  {
	
	@Autowired
	public IStudentService studentService;
	
	public StudentController()
	{
		System.out.println("In student controller");
	}
	
	
	//method to login student
	@PostMapping("/login")
	public Student loginStudent(@RequestBody Student student)
	{
		System.out.println("In login student controller");
		//return studentService.loginStudent(student);
		return null;
	}
	

	//method to register student 
	@PostMapping("/register")
	public Student registerStudent(@RequestBody Student student) {
		System.out.println("In register student controller");
		student.setAdded(LocalDate.now());
		return studentService.add(student);
	}
	
	//method to get list of student
	@GetMapping("/list")
	public List<Student> getStudentList()
	{
		System.out.println("In getStudent list controller method");
		//return studentService.getStudentList();
		return null;
	}
	

}
