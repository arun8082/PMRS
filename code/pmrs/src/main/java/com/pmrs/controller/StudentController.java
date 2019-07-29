package com.pmrs.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pmrs.iservice.IProjectService;
import com.pmrs.iservice.IStudentService;
import com.pmrs.pojos.EEntityStatus;
import com.pmrs.pojos.Project;
import com.pmrs.pojos.Student;
/**
 * 
 * @author Raman Chopra
 *
 */

@RestController
@RequestMapping("/pmrs/student")
@CrossOrigin(origins = "http://localhost:4200",allowedHeaders = "*")
public class StudentController  {
	
	@Autowired
	public IStudentService studentService;
	
	@Autowired
	public IProjectService projectService;
	
	public StudentController()
	{
		System.out.println("In student controller");
	}
	
	
	//method to login student
	@PostMapping("/login")
	public Student authenticateStudent(@RequestBody Student student)
	{
		//System.out.println("In login student controller"+studentService.authenticateStudent(student));
		return studentService.authenticateStudent(student);
	}
	

	//method to register student 
	@PostMapping("/register")
	public Student registerStudent(@RequestBody Student student) {
		//System.out.println("In register student controller");
		student.setAdded(LocalDate.now());
		student.setStatus(EEntityStatus.INACTIVE);
		return studentService.add(student);
	}
	
	//method to add project
	@PostMapping("/addProject")
	public Project addProject(@RequestBody Project project)
	{
		//System.out.println("In project add method");
		project.setProjectCreated(LocalDate.now());
		return projectService.add(project);
		
	}
	
	
	//method to get list of members in a particular project group using projectId
	@PostMapping("/memberlist")
	public List<Student> getMemberList(@RequestBody Project projectId)
	{
		System.out.println("In get project member list controller method");
		return studentService.listAll(projectId);
	}
	
	
	//method to add document
	
	//method to check project details
	
	//method to update profile
	

}
