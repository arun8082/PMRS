package com.pmrs.testcontroller;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;
import com.pmrs.testservices.IStudentService;

//@RestController
//@RequestMapping("/pmrs/student")
public class StudentController {

	//@Autowired
	private IStudentService studentService;
	
	StudentController(){
		System.out.println("StudentController");
	}
	
	@PostMapping("/register")
	public int registerStudent(@RequestBody Student student) {
		//System.out.println("student controller "+student);		
		return studentService.registerStudent(student);		
	}

	@PostMapping("/getstudent")
	public Student getStudentDetails(@RequestBody Student student) {
		//System.out.println(studentService.getStudentDetails(student));
		return studentService.getStudentDetails(student);		
	}
	
	@PostMapping("/login")
	public Student authenticateStudent(@RequestBody Student student) {
		System.out.println("cont: "+student);
		//System.out.println("controller "+studentService.authenticateStudent(student));
		return studentService.authenticateStudent(student);		
	}
	
	@PostMapping("/addProject")
	public int addProject(@RequestBody Project project) {
		//System.out.println("cont: "+project);
		return studentService.addProject(project);
	}
}
